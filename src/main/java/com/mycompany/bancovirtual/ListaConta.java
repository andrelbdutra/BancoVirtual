/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pichau
 */
public class ListaConta {

    static private List<Conta> contas = new ArrayList<>();   
    public ListaConta() {

    }

    public List<Conta> getContas() {
        return ListaConta.contas;
    }

    public void adicionaElemento(UsuarioCliente cliente) {

        contas.add(new Conta(cliente));
    }
    public void adicionaElementoPoupanca(UsuarioCliente cliente) {

        contas.add(new ContaPoupanca(cliente));
    }

}
