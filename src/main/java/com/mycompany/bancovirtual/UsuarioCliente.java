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

    }
    
    public UsuarioCliente(String nomeCompleto, String nomeLogin,String senha){
        setNomeCompleto(nomeCompleto);
        setNomeLogin(nomeLogin);
        setSenha(senha);
    }
}
