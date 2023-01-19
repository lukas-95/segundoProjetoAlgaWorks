package com.curso.desafio.herancaesobreposicao;

public class Conta {

    private String descricao;
    private Double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta;


    public Conta(){
        this.situacaoConta = SituacaoConta.PENDENTE;
    }

    public void cancelar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não é possível cancelar uma conta que ja foi paga: " + this.getDescricao() + ".");

        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que ja foi cancelada: " + this.getDescricao() + ".");

        } else {
            System.out.println("Cancelando a conta " + this.getDescricao() + ".");

            this.situacaoConta = SituacaoConta.CANCELADA;
        }

    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return this.situacaoConta;
    }

}

