/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.Scanner;

/**
 *
 * @author Sharp
 */
public class Conta {

    private int ID;
    private UsuarioCliente cliente;
    private double saldo;
    private static int quantidadeContas;

    public Conta(){
        this.ID = quantidadeContas++;
        this.saldo = 0;
        this.cliente = new UsuarioCliente();
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

    public void depositar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser depositado: ");
        double valor = teclado.nextInt();
        this.saldo += valor;
        System.out.println("Deposito realizado com sucesso.");
    }

    public void sacar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser sacado: ");
        double valor = teclado.nextInt();
        if (this.getSaldo() - valor < 0) {
            System.out.println("Saldo indisponivel.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        }
    }

    public boolean transferencia(Conta outra, double valor) {
        if (valor <= getSaldo()) {
            this.sacar();
            outra.depositar();
            return true;
        } else {
            return false;
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
}
