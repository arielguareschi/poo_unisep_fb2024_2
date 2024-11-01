package br.edu.unisep.biblioteca.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {

    public void exibir(){
        JFrame tela = new JFrame("Menu principal");
        tela.setSize(800, 600);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(2,2));

        JButton jBtnEditora = new JButton("Editora");
        jBtnEditora.addActionListener(e -> {
            EditoraView editora = new EditoraView();
            editora.exibir();
        });
        painel.add(jBtnEditora);

        tela.add(painel);
        tela.setVisible(true);
    }
}
