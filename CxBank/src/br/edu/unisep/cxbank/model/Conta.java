package br.edu.unisep.cxbank.model;

public abstract class Conta {
    protected String titular;
    protected Double saldo;

    // construtor
    public Conta(String titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Metodo abstrato (para implantar o polimorfismo)
    public abstract void sacar(Double valor);

    // Metodo comum para todas as contas
    public void depositar(Double valor) {
        saldo += valor;
        System.out.println(titular + " depositou " + valor +
                " - Saldo atual: " + saldo);
    }

    // Metodo para exibir o saldo
    public void exibirSaldo() {
        System.out.println("Saldo de " + titular + ": " + saldo);
    }

}
