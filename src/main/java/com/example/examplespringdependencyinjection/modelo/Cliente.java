package com.example.examplespringdependencyinjection.modelo;

public class Cliente {
    private String nome;
    private String email;
    private String telefone;
    private boolean ativo = false;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public Object getNome() {
        return this.nome;
    }

    public Object getEmail() {
        return this.email;
    }

    public void ativar() {
        this.ativo = true;
    }

    public Object getTelefone() {
        return this.telefone;
    }
}
