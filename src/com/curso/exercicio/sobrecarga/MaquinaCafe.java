package com.curso.exercicio.sobrecarga;

public class MaquinaCafe {

    int acucarDisponivel;


    void fazerCafe() {
            fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar) {
             if (acucarDisponivel < quantidadeAcucar) {
                      System.out.println("Não há açucar suficiente para fazer café," +
                    " por favor, preencha açucar na maquina");
             } else {
                    acucarDisponivel -= quantidadeAcucar;
                     System.out.println("Fazendo café com " + quantidadeAcucar + " gramas de açucar");
             }
    }





}


