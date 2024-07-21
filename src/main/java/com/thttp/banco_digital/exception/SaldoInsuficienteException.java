package com.thttp.banco_digital.exception;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar a operação.");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
}
