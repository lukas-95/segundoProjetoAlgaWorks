package com.curso.fjoo.sobrecarga;

public class CadastroPessoa {

    public void cadastrar(Pessoa pessoa) {

        armazenar(pessoa.getNome(), pessoa.getIdade());

    }



    private void armazenar(String nome, int idade) {

        System.out.println("Salvando: \"" + nome + "\" com " + idade + "anos.");
    }
}
