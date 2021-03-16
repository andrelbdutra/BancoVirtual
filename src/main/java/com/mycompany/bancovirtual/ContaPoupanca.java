/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

//Aluno: André Luís Braga Dutra - 201735038
//Aluno: Wesley de Almeida Cruz - 201765567AC

import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sharp
 */
public class ContaPoupanca extends Conta {

    private int diaRendimento ;

    public ContaPoupanca(UsuarioCliente cliente) {
        super(cliente);
        diaRendimento = 15;
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
        double taxaRendimento = 0.01;
        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
            // saldo + = saldo * taxaRendimento;
            novoSaldo = (this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return novoSaldo;

        } else {
            JOptionPane.showMessageDialog(null, "Não é dia de verificar o saldo");
            return this.getSaldo();
        }
    }
}
