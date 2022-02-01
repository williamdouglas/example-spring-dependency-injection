package com.example.examplespringdependencyinjection.service;

import com.example.examplespringdependencyinjection.modelo.Cliente;
import com.example.examplespringdependencyinjection.notificacao.NivelUrgencia;
import com.example.examplespringdependencyinjection.notificacao.Notificador;
import com.example.examplespringdependencyinjection.notificacao.TipoDoNotificador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    // @TipoDoNotificador(NivelUrgencia.NORMAL)
    // @Autowired
    // private Notificador notificador;

    // @Autowired
    // public AtivacaoClienteService(NotificadorEmail notificador) {
    // this.notificador = notificador;
    // }

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        // notificador.notificar(cliente, "Seu cadastro está ativo!");

        // informar para o container Spring que o cliente está ativo no momento
        // emitir evento
        // existirão listenes, consumidores desse envento
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}
