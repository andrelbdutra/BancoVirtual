/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Sharp
 */
public class ContaPoupanca extends Conta {

    private int diaRendimento;

    public ContaPoupanca() {
        this.diaRendimento = 13;
        this.saldo = 0;
        this.cliente = new UsuarioCliente();
    }

    public ContaPoupanca(UsuarioCliente cliente) {
        this.diaRendimento = 13;
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
    public boolean calcularNovoSaldo(double taxaRendimento) {

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            // saldo + = saldo * taxaRendimento;
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
}
