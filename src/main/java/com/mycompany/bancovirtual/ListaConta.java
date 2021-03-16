/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

//Aluno: André Luís Braga Dutra - 201735038
//Aluno: Wesley de Almeida Cruz - 201765567AC

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

    public void adicionaElementoCorrente(UsuarioCliente cliente) {

        contas.add(new ContaCorrente(cliente));
    }
    public void adicionaElementoPoupanca(UsuarioCliente cliente) {

        contas.add(new ContaPoupanca(cliente));
    }
}
