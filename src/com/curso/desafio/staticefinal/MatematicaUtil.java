package com.curso.desafio.staticefinal;

public class MatematicaUtil {

    // http://pt.wikipedia.org/wiki/Número_de_Fibonacci
    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double v) {
    }
}
