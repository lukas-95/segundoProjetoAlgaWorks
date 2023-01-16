package com.curso.desafio.thisconstrutoresjavabeansandpackagesenums;

public class ContaPagar {

    private String descricao;
    private int valor;
    private String dataVencimento;
    private Fornecedor fornecedor;

    private SituacaoConta situacaoConta;

    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public ContaPagar() {
        this.situacaoConta = SituacaoConta.PENDENTE;

    }

    public ContaPagar(Fornecedor fornecedor, String descricao, int valor, String dataVencimento) {
        this.();

        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;

    }


    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode pagar uma conta que já está PAGA: " + this.getDescricao() + ".");

        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Não pode cancelar uma conta que está CANCELADA: " + this.getDescricao() + ".");

        } else {
                System.out.println("Pagando Conta " + this.getDescricao() + " no valor de " + this.getValor() + " com vencimento em "
                    + this.getDataVencimento() + " do fornecedor " + this.fornecedor.getNome() + ".");

                this.situacaoConta = SituacaoConta.PAGA;

        }

    }

    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())){
            System.out.println("Não pode PAGAR uma conta que já está PAGA: " + this.getDescricao() + ".");

        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())){
            System.out.println("Não pode CANCELAR uma conta que está CANCELADA: " + this.getDescricao() + ".");

        } else {
            System.out.println("Cancelando Conta " + this.getDescricao() + ".");

            this.situacaoConta = SituacaoConta.CANCELADA;
        }

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