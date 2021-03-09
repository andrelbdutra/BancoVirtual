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

        setNomeCompleto(nomeCompleto);
        setNomeLogin(nomeLogin);
        setSenha(senha);
    }
}
