/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharp
 */
public class ContaPoupanca extends Conta {


    public ContaPoupanca() {

        diaRendimento=15;
        this.saldo = 0;
        this.cliente = new UsuarioCliente();
    }

    public ContaPoupanca(UsuarioCliente cliente) {
        diaRendimento = 15;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public String toString() {
        String s = " ContaPoupança [ ";
        s += " ; dia de rendimento: " + diaRendimento;
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

        double novoSaldo;
        double taxaRendimento = 0.1;
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            // saldo + = saldo * taxaRendimento;
            novoSaldo=(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return novoSaldo;

        } else {
            JOptionPane.showMessageDialog(null, "Não é dia de verificar o saldo");
            return this.getSaldo();
        }
    }
}
