/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.view;

import com.mycompany.bancovirtual.Conta;
import com.mycompany.bancovirtual.Main;
import com.mycompany.bancovirtual.Usuario;
import com.mycompany.bancovirtual.UsuarioCliente;
import com.mycompany.bancovirtual.UsuarioGerente;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Pichau
 */
public class Tela extends JFrame{
    
    private JPanel principal;
    private JList<Conta> lista;
    private JTextField tfNome;
    private JTextField tfNomeLogin;
    private JTextField tfSenha;
    private int lastIndex;
    
    public Tela(){
        this.lastIndex = 0;
    }
    
    private void configuraJanela(){
        this.setSize(500,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.principal = new JPanel();
        this.principal.setLayout(new BorderLayout());
    }
}
