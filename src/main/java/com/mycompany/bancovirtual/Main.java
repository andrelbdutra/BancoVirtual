/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bancovirtual;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Pichau
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>(); 
        
        contas.add(new Conta());
        contas.get(0).depositar();
        System.out.println(contas.get(0).toString());
        contas.get(0).sacar();
        System.out.println(contas.get(0).toString());
        contas.add(new Conta());
        System.out.println(contas.get(1).toString());  
    }
}
