/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

/**
 *
 * @author Pichau
 */
import java.util.ArrayList;
import java.util.List;

public class UsuarioGerente extends Usuario{
    public UsuarioGerente() {

    }

    public UsuarioGerente(String nomeCompleto, String nomeLogin,String senha) {
        setNomeCompleto(nomeCompleto);
        setNomeLogin(nomeLogin);
        setSenha(senha);
    }

    public void apaga(List contas, int id) {
        contas.remove(contas.get(id));        
    }
    public int verificaQtdContas(int qtdContas) {
        return qtdContas;
    }
}
