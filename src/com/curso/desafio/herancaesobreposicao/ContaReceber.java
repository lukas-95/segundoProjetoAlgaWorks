package com.curso.desafio.herancaesobreposicao;

public class ContaReceber extends Conta{

    private Cliente cliente;

    public ContaReceber(){

    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento){
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() {
        if (this.getValor() < 50000) {
            System.out.println("Essa conta a receber não pode ser cancelada. Não podemos deixar de receber referente a " + this.getDescricao());
        } else {
            super.cancelar();
        }
    }
    public void receber(){
            if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
                System.out.println("Não é possível receber uma conta que ja foi paga: " + this.getDescricao() + ".");

            } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
                System.out.println("Não pode receber uma conta que está cancelada: " + this.getDescricao() + ".");

            } else {
                System.out.println("Recebendo a conta " + this.getDescricao() + " no valor total de R$" + this.getValor()
                        + " com vencimento em " + this.getDataVencimento() + " do nosso amado cliente " + this.getCliente().getNome() + ".");

                this.situacaoConta = SituacaoConta.PAGA;
            }
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
