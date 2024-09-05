package br.edu.unisep.despesas.util;

import br.edu.unisep.despesas.model.Categoria;
import br.edu.unisep.despesas.model.Tipo;

import javax.swing.*;
import java.util.Scanner;

public class Funcoes {

    public void novaCategoria(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da categoria"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição da categoria");

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setDescricao(descricao);
        JOptionPane.showMessageDialog(null, categoria);

        // como ler os dados pelo terminal
        /*Scanner s = new Scanner(System.in);
        System.out.println("Digite o Id da categoria: ");
        id = s.nextLong();
        System.out.println("Digite o nome da categoria: ");
        s = new Scanner(System.in);
        descricao = s.nextLine();*/
    }

    // crie o metodo para cadastrar um novo tipo
    public void novoTipo(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do tipo"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição do tipo");
//        String tip = JOptionPane.showInputDialog("Digite o tipo do tipo");

        String[] tipos = {"Entrada", "Saida"};
        int tipoEscolhido = JOptionPane.showOptionDialog(null,
                "Selecione o tipo",
                "Escolha o tipo do tipo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tipos,
                tipos[0]);

        Tipo tipo = new Tipo(id, descricao, tipos[tipoEscolhido]);
//        tipo.setId(id);
//        tipo.setDescricao(descricao);
//        tipo.setTipo(tipos[tipoEscolhido]);
        JOptionPane.showMessageDialog(null, tipo);

    }

    public void escolherOpcao(){
        String[] opcoes = {
                "Cadastrar Categoria",
                "Cadastrar Empresa",
                "Cadastrar Tipo",
                "Cadastrar Lançamento",
                "Listar Categoria",
                "Listar Empresa",
                "Listar Tipo",
                "Listar Lançamento",
                "Excluir Categoria",
                "Excluir Empresa",
                "Excluir Tipo",
                "Excluir Lançamento"
        };
        int opcaoEscolhida = JOptionPane.showOptionDialog(
                null,
                "Escolha uma opção",
                "Menu principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
        switch (opcaoEscolhida){
            case 0:
                novaCategoria();
                break;

//                "Cadastrar Categoria",
//                "Cadastrar Empresa",
//                "Cadastrar Tipo",
//                "Cadastrar Lançamento",
//                "Listar Categoria",
//                "Listar Empresa",
//                "Listar Tipo",
//                "Listar Lançamento",
//                "Excluir Categoria",
//                "Excluir Empresa",
//                "Excluir Tipo",
//                "Excluir Lançamento"
        }

    }
}
