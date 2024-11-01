package br.edu.unisep.cxbank.model;

public class ContaPoupanca extends Conta {
    private Double taxa;

    public ContaPoupanca(String titular, Double saldo, Double taxa) {
        super(titular, saldo);
        this.taxa = taxa;
    }


    @Override
    public void sacar(Double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + " sacou " + valor +
                    ". Saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void aplicarRendimento() {
        saldo += saldo * taxa;
        System.out.println("Rendimento aplicado. Saldo atual de " +
                titular + ": " + saldo);
    }
}
