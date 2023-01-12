package com.curso.fjoo.modificadorstatic;

public class Contador {

    public static int COUNT = 0;
    public final static double PI = 3.141516171819;

    public  void incrementar(){
        COUNT++;
    }
    public static void imprimirContador(){
        System.out.println("O valor do contador agora é: " + Contador.COUNT);
    }
}
