package br.edu.unisep.biblioteca.view;

import javax.swing.*;
import java.awt.*;

public class EditoraView {

    public void exibir(){
        JFrame tela = new JFrame("Cadastro de Editoras");
        tela.setSize(500,500);
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4,2));

        JLabel jLbCodigo = new JLabel("Código");
        painel.add(jLbCodigo);

        JTextField jTfCodigo = new JTextField(30);
        painel.add(jTfCodigo);

        JLabel jLbNome = new JLabel("Nome");
        painel.add(jLbNome);

        JTextField jTfNome = new JTextField(30);
        painel.add(jTfNome);

        JLabel jLbEstado = new JLabel("Estado");
        painel.add(jLbEstado);

        JTextField jTfEstado = new JTextField(30);
        painel.add(jTfEstado);

        JButton jBtnSalvar = new JButton("Salvar");
        painel.add(jBtnSalvar);

        JButton jBtnSair = new JButton("Sair");
        painel.add(jBtnSair);

        tela.add(painel);

        tela.setVisible(true);
    }
}
