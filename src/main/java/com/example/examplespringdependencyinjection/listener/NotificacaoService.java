package com.example.examplespringdependencyinjection.listener;

import com.example.examplespringdependencyinjection.notificacao.NivelUrgencia;
import com.example.examplespringdependencyinjection.notificacao.Notificador;
import com.example.examplespringdependencyinjection.notificacao.TipoDoNotificador;
import com.example.examplespringdependencyinjection.service.ClienteAtivadoEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    @EventListener
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro está ativo!");
    }
}
