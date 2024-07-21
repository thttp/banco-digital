package com.thttp.banco_digital.model;

public class ContaPoupanca extends Conta {
    private final double taxaRendimento;
    
    public ContaPoupanca(int numero, String titular, double taxaRendimento) {
        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }
    
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void aplicarRendimento() {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println("Rendimento de R$" + rendimento + " aplicado à conta de " + getTitular());
    }
    
    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }
}
