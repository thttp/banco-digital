package com.thttp.banco_digital.model;

public class Conta {
    private final int numero;
    private final String titular;
    protected double saldo;
    
    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " para " + destino.getTitular() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência não realizada.");
            return false;
        }
    }
}
