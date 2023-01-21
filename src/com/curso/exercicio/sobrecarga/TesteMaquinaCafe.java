package com.curso.exercicio.sobrecarga;

public class TesteMaquinaCafe {

    public static void main(String[] args) {
        MaquinaCafe maquina = new MaquinaCafe();
        maquina.acucarDisponivel = 10;


        maquina.fazerCafe(3);
        maquina.fazerCafe(5);

        maquina.fazerCafe();
    }
}
