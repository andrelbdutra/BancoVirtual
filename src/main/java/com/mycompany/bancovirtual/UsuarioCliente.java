/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class UsuarioCliente extends Usuario {

   
    public UsuarioCliente() {
        Scanner teclado = new Scanner(System.in);
        String nomeCompleto;
        String nomeLogin;
        String senha;

        System.out.println("Digite o nome do cliente:");
        nomeCompleto = teclado.next();

        System.out.println("Digite o nome de login: ");
        nomeLogin = teclado.next();

        System.out.println("Digite a senha de usuario:");
        senha = teclado.next();
<<<<<<< HEAD
        this.nomeCompleto = nomeCompleto;
        this.nomeLogin = nomeLogin;
        this.senha = senha;
    }
    

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeLogin() {
        return this.nomeLogin;
    }

    public void setNomeLogin(String nomeLogin) {
        this.nomeLogin = nomeLogin;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
=======
        setNomeCompleto(nomeCompleto);
        setNomeLogin(nomeLogin);
        setSenha(senha);
    }

>>>>>>> 26ee388e56122edae89a0480bb8127d996829b16
}
