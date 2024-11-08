package br.edu.unisep.cidade.view.telas;

import br.edu.unisep.cidade.model.Cidade;
import br.edu.unisep.cidade.util.Funcoes;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class Menu {

    private List<Cidade> cidades;

    public Menu() {
        cidades = Funcoes.lerArquivoCidade();
        exibir();
    }

    private void exibir(){
        JFrame janela = new JFrame("Menu Principal");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 600);

        JPanel painel = new JPanel();

        JButton jBtnAddCidade = new JButton("Adicionar Cidade");
        jBtnAddCidade.addActionListener(e -> new CidadeAdd(cidades));
        painel.add(jBtnAddCidade);

        janela.add(painel);

        janela.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                if (Funcoes.salvarArquivoCidade(cidades)){
                    JOptionPane.showMessageDialog(janela,
                            "Dados salvos com sucesso!");
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(janela,
                            "Erro ao salvar arquivo de cidades!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        janela.setVisible(true);
    }
}
