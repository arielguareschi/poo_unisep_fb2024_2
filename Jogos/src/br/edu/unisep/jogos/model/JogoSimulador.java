package br.edu.unisep.jogos.model;

import java.util.Calendar;
import java.util.Timer;

public class JogoSimulador extends Jogo {

    private boolean fisica;
    private String joystick;
    private int camera;
    private Calendar replay;
    private int posicao;

    public JogoSimulador() {

    }

    public JogoSimulador(int id, String nome, String fornecedor, int ano, String plataforma, boolean fisica, String joystick, int camera, Calendar replay, int posicao) {
        super(id, nome, fornecedor, ano, plataforma);
        this.fisica = fisica;
        this.joystick = joystick;
        this.camera = camera;
        this.replay = replay;
        this.posicao = posicao;
    }

    public boolean isFisica() {
        return fisica;
    }

    public void setFisica(boolean fisica) {
        this.fisica = fisica;
    }

    public String getJoystick() {
        return joystick;
    }

    public void setJoystick(String joystick) {
        this.joystick = joystick;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public Calendar getReplay() {
        return replay;
    }

    public void setReplay(Calendar replay) {
        this.replay = replay;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
