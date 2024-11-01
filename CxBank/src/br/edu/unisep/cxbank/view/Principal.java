package br.edu.unisep.cxbank.view;

import br.edu.unisep.cxbank.model.Conta;
import br.edu.unisep.cxbank.model.ContaCorrente;
import br.edu.unisep.cxbank.model.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente("Joao", 1000.0, 500.0);
        Conta conta2 = new ContaPoupanca("Maria", 2000.0, 0.02);

        conta1.depositar(200.0);
        conta1.sacar(1500.0);

        System.out.println();
        conta2.depositar(300.0);
        conta2.sacar(2500.0);
        ((ContaPoupanca) conta2).aplicarRendimento();

        System.out.println();
        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
