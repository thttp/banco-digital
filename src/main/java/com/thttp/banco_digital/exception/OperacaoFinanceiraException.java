package com.thttp.banco_digital.exception;

public class OperacaoFinanceiraException extends Exception {

    public OperacaoFinanceiraException() {
        super("Erro ao realizar operação financeira.");
    }

    public OperacaoFinanceiraException(String message) {
        super(message);
    }

    public OperacaoFinanceiraException(String message, Throwable cause) {
        super(message, cause);
    }
}
