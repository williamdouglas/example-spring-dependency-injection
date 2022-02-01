package com.example.examplespringdependencyinjection.service;

import com.example.examplespringdependencyinjection.listener.NotificacaoService;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {
    @EventListener
    public void emissaoNotaFiscalListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal cliente " + event.getCliente().getNome());
    }
}