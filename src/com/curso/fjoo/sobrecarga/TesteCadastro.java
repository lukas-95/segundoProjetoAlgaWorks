package com.curso.fjoo.sobrecarga;

public class TesteCadastro {

    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();

        Pessoa pessoa = new Pessoa("Lucas Reck", 27);
        cadastro.cadastrar(pessoa);

        // ----------------------

        cadastro.cadastrar("Monica", 24);





    }
}
