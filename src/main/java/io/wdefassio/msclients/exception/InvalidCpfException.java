package io.wdefassio.msclients.exception;

public class InvalidCpfException extends RuntimeException {
    public InvalidCpfException(String cpf) {
        super("not found a client with cpf: " + cpf);
    }
}
