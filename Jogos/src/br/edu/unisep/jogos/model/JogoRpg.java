package br.edu.unisep.jogos.model;

public class JogoRpg extends Jogo {

    private String personagem;
    private int nivel;
    private String historia;
    private String tipo;
    private String magia;

    public JogoRpg() {
    }

    public JogoRpg(int id, String nome, String fornecedor, int ano, String plataforma, String personagem, int nivel, String historia, String tipo, String magia) {
        super(id, nome, fornecedor, ano, plataforma);
        this.personagem = personagem;
        this.nivel = nivel;
        this.historia = historia;
        this.tipo = tipo;
        this.magia = magia;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
