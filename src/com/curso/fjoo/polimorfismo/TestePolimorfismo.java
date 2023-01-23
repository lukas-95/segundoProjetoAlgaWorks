package com.curso.fjoo.polimorfismo;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        
        
    }


    public static void imprimirSaldo(Conta conta){
        System.out.println("Saldo da contaq: R$ " + conta.getSaldo());
    }
}
