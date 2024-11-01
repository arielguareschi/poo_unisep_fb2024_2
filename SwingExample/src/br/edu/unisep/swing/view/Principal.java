package br.edu.unisep.swing.view;

import javax.swing.*;
import java.awt.*;

public class Principal {
    public static void main(String[] args) {
        // cria a tela (frame/quadro)
        JFrame frame = new JFrame("Minha primeira Janelinha!");
        // seta o tamanho da tela
        frame.setSize(500, 500);
        // dizer que quando fechar acabou tudo
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setBackground(new Color(0, 255, 0));
        painel.setLayout(new GridLayout(2, 2));


        JLabel red = new JLabel("Rotulo vermelho");
        red.setForeground(Color.RED);
        red.setFont(new Font("Arial", Font.BOLD, 20));
        painel.add(red);

        JLabel black = new JLabel("Rotulo azul");
        painel.add(black);

        JButton botao1 = new JButton("Botao 1");
        painel.add(botao1);

        JTextField campoTexto = new JTextField(20);
        painel.add(campoTexto);


        frame.add(painel);

        // cha revelacao (exibe a tela)
        frame.setVisible(true);
    }
}
