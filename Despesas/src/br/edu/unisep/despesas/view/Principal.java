package br.edu.unisep.despesas.view;

import br.edu.unisep.despesas.model.Categoria;
import br.edu.unisep.despesas.model.Empresa;
import br.edu.unisep.despesas.model.Lancamento;
import br.edu.unisep.despesas.model.Tipo;
import br.edu.unisep.despesas.util.Funcoes;

import javax.swing.*;
import java.util.Calendar;
import java.util.Objects;

public class Principal {
    public static void main(String[] args){
        // agora eu vai instanciar um objeto da classe categoria
        // neste momento vai ocorrer a transmutacao
        // Clase --->>>>> Objeto
//        Categoria lanche = new Categoria();
//        lanche.setId(1);
//        lanche.setDescricao("Lanches");
//
//        Tipo salario = new Tipo();
//        salario.setId(1);
//        salario.setDescricao("Esmola empresa X");
//        salario.setTipo("E");
//
//        Empresa tom = new Empresa();
//        tom.setId(1);
//        tom.setNome("Lanches Tom e Jerry");
//        tom.setEndereco("Final do prolongamento da julio");
//        tom.setTelefone("(46) 99999-1111");
//        tom.setCnpj("12.345.678/0001-69");
//
//        Lancamento hotDog = new Lancamento();
//        hotDog.setId(1);
//        hotDog.setTipo(salario);
//        hotDog.setCategoria(lanche);
//        hotDog.setEmpresa(tom);
//        hotDog.setObservacao("Hot dog com 2 salsichas");
//        hotDog.setValor(15.00);
//        hotDog.setData(Calendar.getInstance());
//
//        System.out.println(hotDog);
//        JOptionPane.showMessageDialog(null, hotDog);

//        System.out.println(hotDog.getId());
//        System.out.println(hotDog.getEmpresa().getNome());
//        System.out.println(hotDog.toString());

        Funcoes funcoes = new Funcoes();
        while(true) {
            if (!funcoes.escolherOpcao()){
                break;
            }
        }
    }

}
