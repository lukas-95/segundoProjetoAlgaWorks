package com.curso.fjoo;

public class TesteJavaBean {

    public static void main(String[] args) {
        PessoaBean pessoa = new PessoaBean();
        pessoa.setNome("Lucas Reck Menezes");
        pessoa.setIdade(27);

        System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos");
    }
}
