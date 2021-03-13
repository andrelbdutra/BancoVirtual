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
 * @author Sharp
 */
public class ListaContaPoupanca {

    static private List<ContaPoupanca> contasPoupanca = new ArrayList<>();

    public ListaContaPoupanca() {

    }

    public List<ContaPoupanca> getContasPoupanca() {
        return ListaContaPoupanca.contasPoupanca;
    }
    public void adicionaElementoPoupanca(UsuarioCliente cliente) {

        contasPoupanca.add(new ContaPoupanca(cliente));
    }
}
