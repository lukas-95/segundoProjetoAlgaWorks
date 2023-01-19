package com.curso.desafio.herancaesobreposicao;

public class Principal {

    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Tchê Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João pé de Feijão");

        // instanciando clientes
        Cliente agronegocio = new Cliente();
        agronegocio.setNome("Fazenda Porco D'Ouro");
        Cliente telecom = new Cliente();
        telecom.setNome("Vivo Telecomunicações");

        // instanciando contas a pagar
        ContaPagar contaPagar1 = new ContaPagar();
        contaPagar1.setDescricao("Aluguel da Paulista");
        contaPagar1.setValor(3600d);
        contaPagar1.setDataVencimento("25/01/2023");
        contaPagar1.setFornecedor(imobiliaria);

        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês no Pão de Açúcar", 1560d, "05/02/2023");

        // instanciando contas a receber
        ContaReceber contaReceber1 = new ContaReceber();
        contaReceber1.setDescricao("CRUD sofrido em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataVencimento("21/02/2023");
        contaReceber1.setCliente(agronegocio);

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção dos servidores",
                53200d, "21/02/2023");

        // pagamento e cancelamento de contas a pagar
        contaPagar1.pagar();
        contaPagar2.cancelar();

        // recebimento e cancelamento de contas a receber
        contaReceber1.receber();
        contaReceber2.cancelar();
    }

}
