package com.curso.fjoo.sobreposicao;

import java.util.Date;

public class TesteSobreposicao {

    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "caixa de fosforo";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
