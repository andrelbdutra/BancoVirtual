/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import View.TelaDeposito;
import javax.swing.JOptionPane;
/**
 *
 * @author Sharp
 */
public class Conta {

    private int ID;
    private UsuarioCliente cliente;
    private double saldo;
    private static int quantidadeContas;

    public Conta(UsuarioCliente cliente) {
        this.ID = quantidadeContas++;
        this.saldo = 0;
        this.cliente = cliente;
    }   
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        String s = " ContaBancaria [ ";
        s += " ; ID: " + this.ID;
        s += " nomeCliente: " + this.cliente.getNomeCompleto();
        s += " ; saldo: " + this.saldo;
        s += " ] ";
        return s;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) { 
        if (this.getSaldo() - valor < 0) {
            JOptionPane.showMessageDialog(null, "Saldo indisponivel!");
        } else {
            this.setSaldo(this.saldo-valor);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        }
    }

    public void transferencia(int id, double valor) {
        if (valor <= getSaldo()) {
            this.saldo = this.saldo - valor;
            new ListaConta().getContas().get(id).setSaldo(new ListaConta().getContas().get(id).getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Transação efetuada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo indisponivel!");
        }
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return the cliente
     */
    public UsuarioCliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(UsuarioCliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the quantidadeContas
     */
    public static int getQuantidadeContas() {
        return quantidadeContas;
    }
    
    public int leNumeroValido(String valorDigitado){
        int valor = 0;
        try{
            Double.parseDouble(valorDigitado);
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Valor Digitado é invalido. Tente um valor numerico.");
            valor = 1;
            return valor;
        }
        if(Double.parseDouble(valorDigitado) < 0){
            JOptionPane.showMessageDialog(null, "Valor Digitado é invalido. Tente um numero positivo");
            valor = 1;
            return valor;
        }
        else
            return valor;
    }
}
