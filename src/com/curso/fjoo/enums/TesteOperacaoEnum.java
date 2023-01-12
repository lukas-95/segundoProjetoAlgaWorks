package com.curso.fjoo.enums;

public class TesteOperacaoEnum {
    public static void main(String[] args) {

        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;

        int resultado1 = o1.operacao(5,3);

        System.out.println("O resultado é " + OperacaoAritmetica.ADICAO);

    }

}
