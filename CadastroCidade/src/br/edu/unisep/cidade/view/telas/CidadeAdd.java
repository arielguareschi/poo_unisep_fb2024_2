package br.edu.unisep.cidade.view.telas;

import br.edu.unisep.cidade.model.Cidade;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.List;

public class CidadeAdd {
    private List<Cidade> cidades;

    public CidadeAdd(List<Cidade> cidades) {
        this.cidades = cidades;
        exibir();
    }

    private void exibir() {
        JFrame janela = new JFrame("Cadastro de Cidade");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(500,500);

        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        JLabel jLCodigo = new JLabel("Código");
        JTextField jTFCodigo = new JTextField(10);
        jTFCodigo.setEditable(false);
        jTFCodigo.setText(String.valueOf(cidades.size()+1));

        JLabel jLNome = new JLabel("Nome");
        JTextField jTFNome = new JTextField(30);

        JLabel jLEstado = new JLabel("Estado");
        JTextField jTFEstado = new JTextField(4);


        painel.add(jLCodigo);
        painel.add(jTFCodigo);
        painel.add(jLNome);
        painel.add(jTFNome);
        painel.add(jLEstado);
        painel.add(jTFEstado);


        JButton jBtnSalvar = new JButton("Salvar");
        jBtnSalvar.addActionListener(e -> {
            Cidade cidade = new Cidade();
            cidade.setId(Integer.parseInt(jTFCodigo.getText()));
            cidade.setNome(jTFNome.getText());
            cidade.setUf(jTFEstado.getText());
            cidades.add(cidade);
            JOptionPane.showMessageDialog(janela, "Salvo com sucesso!");
        });
        painel.add(jBtnSalvar);
        janela.add(painel);


        janela.setVisible(true);
    }
}
