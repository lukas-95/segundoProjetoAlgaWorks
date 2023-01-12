package com.curso.fjoo;

public class TesteEncapsulamento {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); //só vai de 17 até 25

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");
    }
}
