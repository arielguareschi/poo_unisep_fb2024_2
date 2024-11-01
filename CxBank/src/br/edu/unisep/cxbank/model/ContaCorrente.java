package br.edu.unisep.cxbank.model;

public class ContaCorrente extends Conta {
    private Double limite;

    public ContaCorrente(String titular, Double saldo, Double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(Double valor) {
        if(saldo + limite >= valor){
            saldo -= valor;
            System.out.println(titular + " sacou " + valor +
                    ". Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }
}
