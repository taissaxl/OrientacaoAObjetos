package org.example;

public class Venda extends Transacao {

    private Pessoa cliente;

    public Venda(String dataVenda, Pessoa cliente, Produto produto, int qtdeVendida) {
        super(dataVenda, produto, qtdeVendida);
        this.cliente = cliente;
    }

    public boolean vender(Produto produto, int qtdeVenda) {
        if(produto.verificarEstoqueInsuficiente(qtdeVenda)) {
            return false;
        }
        else {
            produto.debitarEstoque(qtdeVenda);
            return true;
        }
    }
}
