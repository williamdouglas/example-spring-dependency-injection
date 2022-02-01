package com.example.examplespringdependencyinjection.notificacao;

import com.example.examplespringdependencyinjection.modelo.Cliente;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando cliente %s - email: %s - mensagem: %s\n", cliente.getNome(), cliente.getEmail(),
                mensagem);
    }
}