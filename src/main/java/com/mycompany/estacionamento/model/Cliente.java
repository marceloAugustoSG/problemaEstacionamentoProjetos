package com.mycompany.estacionamento.model;

public class Cliente {

    private String nome;

    private boolean isPreferencial;

    public Cliente(String nome, boolean isPreferencial) {
        this.nome = nome;
        this.isPreferencial = isPreferencial;
    }

    public boolean isIsPreferencial() {
        return isPreferencial;
    }

}
