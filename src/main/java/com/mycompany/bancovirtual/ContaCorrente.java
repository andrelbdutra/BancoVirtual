/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import javax.swing.JOptionPane;

/**
 *
 * @author Sharp
 */
public class ContaCorrente extends Conta {

    public ContaCorrente() {        
        this.saldo = 0;
        this.cliente = new UsuarioCliente();
    }

    public ContaCorrente(UsuarioCliente cliente) {
        this.saldo = 0;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String s = " ContaCorrente [ ";       
        s += " ; " + super.toString();
        s += " ] ";
        return s;
    }

    @Override
    public int getID() {
        return this.ID;
    }

    @Override
    public double calcularNovoSaldo() {
            JOptionPane.showMessageDialog(null, "Você não possui rendimento mensal","Alerta", JOptionPane.WARNING_MESSAGE);
            return this.getSaldo();
        }
 }

