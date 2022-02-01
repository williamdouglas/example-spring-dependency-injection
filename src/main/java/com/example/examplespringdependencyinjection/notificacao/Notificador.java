package com.example.examplespringdependencyinjection.notificacao;

import com.example.examplespringdependencyinjection.modelo.Cliente;

public interface Notificador {
    public void notificar(Cliente cliente, String mensagem);
}
