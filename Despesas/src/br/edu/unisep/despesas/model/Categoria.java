package br.edu.unisep.despesas.model;

public class Categoria {
    /*
        O encapsulamento e baseado nessas e palavras
        public - visivel por todos
        private - visivel somente dentro da classe
        protected - visivel somente dentro do pacote
     */
    private int id;
    private String descricao;

    public Categoria() {
    }

    public Categoria(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
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

    @Override
    public String toString() {
        return "Categoria\n" +
                "Id: " + id + "\n" +
                "Descrição: " + descricao;
    }
}
