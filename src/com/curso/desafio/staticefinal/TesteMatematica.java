package com.curso.desafio.staticefinal;

public class TesteMatematica {

            public static void main(String[] args) {
            int numeroFibonacci = MatematicaUtil.calcularFibonacci(155);
            System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);

            double areaCirculo = MatematicaUtil.calcularAreaCirculo(28);
            System.out.println("Área do círculo: " + areaCirculo);
        }


}
