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
        int loop1 = 0, loop2 = 0, numero;
        double valor;
        Scanner teclado = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        while (loop1 != 3) {
            telaInicial();
            loop1 = teclado.nextInt();
            if (loop1 == 1) { // Cria conta nova.
                contas.add(new Conta());
                System.out.println("Conta criada com sucesso.");
            } else if (loop1 == 2) { // Loga na conta.
                System.out.println("Digite o nome de login: ");
                String nomeLoginDigitado = teclado.next();
                System.out.println("Digite a senha: ");
                String senhaDigitada = teclado.next();
                System.out.println(Conta.getQuantidadeContas());
                for (int i = 0; i <= Conta.getQuantidadeContas(); i++) {
                    if (nomeLoginDigitado.equals(contas.get(i).getCliente().getNomeLogin()) && senhaDigitada.equals(contas.get(i).getCliente().getSenha())) {
                        while (loop2 != 4) {
                            telaConta(contas.get(i).getCliente().getNomeCompleto(), contas.get(i).getSaldo());
                            loop2 = teclado.nextInt();
                            if (loop2 == 1) { // Sacar dinheiro.
                                contas.get(i).sacar();
                            } else if (loop2 == 2) { // Depositar dinheiro.
                                contas.get(i).depositar();
                            } else if (loop2 == 3 && Conta.getQuantidadeContas() >= 2) { // Fazer uma transferência de uma conta para outra
                                System.out.println("Digite o ID da conta que receberá a trasnferencia");
                                numero = teclado.nextInt();
                                System.out.println("Agora digite o valor que deseja transferir");
                                valor = teclado.nextDouble();
                                contas.get(i).transferencia(contas, numero, valor);
                            }
                        }
                        loop2 = 0;
                        i = Conta.getQuantidadeContas();
                    }
                }
            } else if (loop1 == 3) { // Sai do programa.

            } else {
                System.out.println("Valor invalido.");
            }
        }
    }

    public static void telaInicial() {
        System.out.println("Banco Virtual");
        System.out.println("");
        System.out.println("Opções:");
        System.out.println("1 - Criar uma conta nova.");
        System.out.println("2 - Logar em uma conta.");
        System.out.println("3 - Sair");
    }

    public static void telaConta(String nome, double saldo) {
        System.out.println("Olá, " + nome);
        System.out.println("");
        System.out.println("Saldo:[ $" + saldo + " ]");
        System.out.println("");
        System.out.println("Opções:");
        System.out.println("1 - Sacar.");
        System.out.println("2 - Depositar");
        System.out.println("3 - Transferencia");
        System.out.println("4 - Sair da conta.");
    }

}
