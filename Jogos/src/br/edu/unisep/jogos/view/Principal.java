package br.edu.unisep.jogos.view;

import br.edu.unisep.jogos.model.Jogo;
import br.edu.unisep.jogos.model.JogoFps;
import br.edu.unisep.jogos.model.JogoRpg;
import br.edu.unisep.jogos.model.JogoSimulador;

public class Principal {
    public static void main(String[] args) {
        JogoFps rdr = new JogoFps();
        rdr.setId(1);
        rdr.setNome("Red Dead Redemption 2");
        rdr.setAno(2023);
        rdr.setFornecedor("RockStar");
        rdr.setPlataforma("PC");
        rdr.setSquad("2pac");
        rdr.setHand("Left");
        rdr.setSkin("Cowboy VI ado");
        rdr.setEquipamento("Alazao prateado");

        JogoSimulador forza5 = new JogoSimulador();


        JogoRpg jumanji = new JogoRpg();

    }

}
