package br.edu.unisep.despesas.model;

public class Tipo {
    private int id;
    private String descricao;
    private String tipo;
    // construtor vazio
    // construtor com todos os atributos
    // getter e setter


    public Tipo() {
    }

    public Tipo(int id, String descricao, String tipo) {
        this.id = id;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo\n" +
                "Id: " + id + "\n" +
                "Descrição: " + descricao + "\n" +
                "Tipo:" + tipo;
    }
}
