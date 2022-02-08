package com.example.examplespringdependencyinjection.listener;

import com.example.examplespringdependencyinjection.service.ClienteAtivadoEvent;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {
    @EventListener
    public void emissaoNotaFiscalListener(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal cliente " + event.getCliente().getNome());
    }
}