package com.curso.fjoo.enums;

public enum Naipe {
    OURO("Vermelho"),
    PAUS("Preto"),
    ESPADA("Preto"),
    COPAS("Vermelho");

    private Naipe (String cor) {
        this.cor = cor;
    };
    private String cor;
    public String getCor(){
        return cor;
    }

}
