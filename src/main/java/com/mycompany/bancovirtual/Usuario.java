/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

//Aluno: André Luís Braga Dutra - 201735038
//Aluno: Wesley de Almeida Cruz - 201765567AC

/**
 *
 * @author Pichau
 */
public abstract class Usuario {
    private String nomeCompleto;
    private String nomeLogin;
    private String senha;

    public Usuario(String nomeComp, String nomeLog, String sen) {
        nomeCompleto = nomeComp;
        nomeLogin = nomeLog;
        senha = sen;
    }
     
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeLogin() {
        return nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
