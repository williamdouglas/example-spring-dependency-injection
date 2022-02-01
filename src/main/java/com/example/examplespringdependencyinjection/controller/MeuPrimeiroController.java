package com.example.examplespringdependencyinjection.controller;

import com.example.examplespringdependencyinjection.modelo.Cliente;
import com.example.examplespringdependencyinjection.service.AtivacaoClienteService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "3198765432");

        ativacaoClienteService.ativar(joao);

        return "Hello!";
    }
}
