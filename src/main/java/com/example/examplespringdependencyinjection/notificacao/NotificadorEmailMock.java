package com.example.examplespringdependencyinjection.notificacao;

import com.example.examplespringdependencyinjection.modelo.Cliente;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("[MOCK] Notificação seria enviada para %s - email: %s - mensagem: %s\n", cliente.getNome(),
                cliente.getEmail(), mensagem);
    }
}