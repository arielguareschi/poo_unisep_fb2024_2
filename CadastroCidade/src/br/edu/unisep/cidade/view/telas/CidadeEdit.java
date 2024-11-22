package br.edu.unisep.cidade.view.telas;

import br.edu.unisep.cidade.model.Cidade;

import javax.swing.*;
import java.util.List;

public class CidadeEdit {
    private List<Cidade> cidades;
    private Cidade cidadeEditando;

    public CidadeEdit(List<Cidade> cidades, Cidade cidadeEditando) {
        this.cidades = cidades;
        this.cidadeEditando = cidadeEditando;
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
        jTFCodigo.setText(String.valueOf(cidadeEditando.getId()));

        JLabel jLNome = new JLabel("Nome");
        JTextField jTFNome = new JTextField(30);
        jTFNome.setText(cidadeEditando.getNome());

        JLabel jLEstado = new JLabel("Estado");
        JTextField jTFEstado = new JTextField(4);
        jTFEstado.setText(cidadeEditando.getUf());


        painel.add(jLCodigo);
        painel.add(jTFCodigo);
        painel.add(jLNome);
        painel.add(jTFNome);
        painel.add(jLEstado);
        painel.add(jTFEstado);


        JButton jBtnSalvar = new JButton("Salvar");
        jBtnSalvar.addActionListener(e -> {
            cidadeEditando.setNome(jTFNome.getText());
            cidadeEditando.setUf(jTFEstado.getText());
            int index = cidades.indexOf(cidadeEditando);
            cidades.set(index, cidadeEditando);
            JOptionPane.showMessageDialog(janela, "Salvo com sucesso!");
        });
        painel.add(jBtnSalvar);
        janela.add(painel);


        janela.setVisible(true);
    }
}
