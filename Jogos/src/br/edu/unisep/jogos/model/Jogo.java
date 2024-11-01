package br.edu.unisep.jogos.model;

public class Jogo {
    private int id;
    private String nome;
    private String fornecedor;
    private int ano;
    private String plataforma;

    public Jogo() {
    }

    public Jogo(int id, String nome, String fornecedor, int ano, String plataforma) {
        this.id = id;
        this.nome = nome;
        this.fornecedor = fornecedor;
        this.ano = ano;
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
