package com.curso.desafio.thisconstrutoresjavabeans;

public class ContaPagar {

    private String descricao;
    private int valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    public ContaPagar() {

    }

    public ContaPagar(Fornecedor fornecedor, String descricao, int valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;

    }

    public void pagar() {
        System.out.println("Pagando Conta " + this.getDescricao() + " no valor de " + this.getValor() + " com vencimento em "
                + this.getDataVencimento() + " do fornecedor " + this.fornecedor.getNome() + ".");

    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

}