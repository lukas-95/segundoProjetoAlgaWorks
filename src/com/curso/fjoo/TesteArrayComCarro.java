package com.curso.fjoo;

public class TesteArrayComCarro {

    public static void main(String[] args) {


        Carro[] carros= new Carro[2];
        carros[0] = new Carro();
        carros[0].anoDeFabricacao = 2011;


        System.out.println("Ano de Fabricação: " + carros[0].anoDeFabricacao);

    }
}
