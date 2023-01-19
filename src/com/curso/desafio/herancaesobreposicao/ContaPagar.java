package com.curso.desafio.herancaesobreposicao;

public class ContaPagar extends Conta{

    private Fornecedor fornecedor;

    public ContaPagar(){
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento){

        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);

    }

    public void pagar(){
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
                System.out.println("Não pode pagar uma conta que ja foi paga: " + this.getDescricao() + ". ");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
                System.out.println("Não podemos pagar uma conta que está cancelada: " + this.getDescricao() + ".");

        } else {
                System.out.println("Pagando conta " + this.getDescricao() + " no valor total de R$" + this.getValor() + "  com vencimento em "
                        + this.getDataVencimento() + " do nosso querido fornecedor " + this.getFornecedor().getNome() + ".");

            this.situacaoConta = SituacaoConta.PAGA;
        }
    }


    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}


