/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

/**
 *
 * @author Sharp
 */
public class Conta {

    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
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
        s += " nomeCliente: " + nomeCliente;
        s += " ; numConta: " + numConta;
        s += " ; saldo: " + saldo;
        s += " ] ";
        return s;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferencia(Conta outra, double valor) {
        if (valor <= saldo) {
            this.sacar(valor);
            outra.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
}
