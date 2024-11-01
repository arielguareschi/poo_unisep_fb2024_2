package br.edu.unisep.jogos.model;

public class JogoFps extends Jogo{
    private String skin;
    private String hand;
    private String equipamento;
    private String squad;

    public JogoFps() {
    }

    public JogoFps(int id, String nome, String fornecedor, int ano, String plataforma, String skin, String hand, String equipamento, String squad) {
        super(id, nome, fornecedor, ano, plataforma);
        this.skin = skin;
        this.hand = hand;
        this.equipamento = equipamento;
        this.squad = squad;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }
}
