package com.example.examplespringdependencyinjection.notificacao;

import com.example.examplespringdependencyinjection.modelo.Cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {
    // @Value("${notificador.email.host-servidor}")
    // private String host;

    // @Value("${notificador.email.porta-servidor}")
    // private Integer porta;

    @Autowired
    private NotificadorProperties notificadorProperties;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println("Host: " + notificadorProperties.getHostServidor());
        System.out.println("Porta: " + notificadorProperties.getPortaServidor());

        System.out.printf("Notificando cliente %s - email: %s - mensagem: %s\n", cliente.getNome(), cliente.getEmail(),
                mensagem);
    }
}