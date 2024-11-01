package br.edu.unisep.despesas.util;

import br.edu.unisep.despesas.model.Categoria;
import br.edu.unisep.despesas.model.Empresa;
import br.edu.unisep.despesas.model.Lancamento;
import br.edu.unisep.despesas.model.Tipo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcoes {

    private List<Categoria> categorias = new ArrayList<>();
    private List<Empresa> empresas = new ArrayList<>();
    private List<Tipo> tipos = new ArrayList<>();
    private List<Lancamento> lancamentos = new ArrayList<>();


    public void novaCategoria(){
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da categoria"));
        String descricao = JOptionPane.showInputDialog("Digite a descrição da categoria");

        Categoria categoria = new Categoria();
        categoria.setId(id);
        categoria.setDescricao(descricao);

        categorias.add(categoria);

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

    public void novaEmpresa(){
        Empresa empresa = new Empresa();
        empresa.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do empresa")));
        empresa.setNome(JOptionPane.showInputDialog("Digite o nome"));
        empresa.setEndereco(JOptionPane.showInputDialog("Digite o endereco"));
        empresa.setTelefone(JOptionPane.showInputDialog("Digite o telefone"));
        empresa.setCnpj(JOptionPane.showInputDialog("Digite o cnpj"));
        JOptionPane.showMessageDialog(null, empresa);
    }

    public boolean escolherOpcao(){
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
            case 1:
                novaEmpresa();
                break;
            case 2:
                novoTipo();
                break;
            case 3:
                novoLancamento();
                break;
            case 4:
                listarCategoria();
//                "Listar Categoria",
                break;
            case 5:
//                "Listar Empresa",
                break;
            case 6:
//                "Listar Tipo",
                break;
            case 7:
//                "Listar Lançamento",
                break;
            case 8:
//                "Excluir Categoria",
                break;
            case 9:
//                "Excluir Empresa",
                break;
            case 10:
//                "Excluir Tipo",
                break;
            case 11:
//                "Excluir Lançamento"
                break;
            default:
                return false;
        }
        return true;
    }

    public void listarCategoria() {
        String texto = "Categorias\n";
        for(Categoria categoria : categorias){
            texto += categoria + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
    }

    public void novoLancamento() {
    }
}
