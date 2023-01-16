package com.curso.desafio.thisconstrutoresjavabeansandpackagesenums;

public class Principal {

    public static void main(String[] args) {
    Fornecedor imobiliaria = new Fornecedor();
    imobiliaria.setNome("Tche Negócios Imobiliários");

    Fornecedor mercado = new Fornecedor();
    mercado.setNome("Mercado do João Pé de Feijão");

    ContaPagar conta1 = new ContaPagar();
    conta1.setDescricao("Aluguel da Av Paulista");
    conta1.setValor(8500);
    conta1.setDataVencimento("10/05/2023");
    conta1.setFornecedor(imobiliaria);

    ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 1600, "19/05/2023");

    ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da Fazenda", 3500, "11/05/2023");

    conta1.pagar();
    conta2.pagar();
    conta3.pagar();
}
}
