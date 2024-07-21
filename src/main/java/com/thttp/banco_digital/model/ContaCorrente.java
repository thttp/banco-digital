package com.thttp.banco_digital.model;

public class ContaCorrente extends Conta {
    private final double limiteChequeEspecial;
    
    public ContaCorrente(int numero, String titular, double limiteChequeEspecial) {
        super(numero, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }
    
    @Override
    public boolean sacar(double valor) {
        double limiteDisponivel = saldo + limiteChequeEspecial;
        if (valor > 0 && valor <= limiteDisponivel) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso (incluindo limite especial).");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }
}
