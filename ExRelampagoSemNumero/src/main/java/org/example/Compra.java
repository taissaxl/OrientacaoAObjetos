package org.example;

public class Compra extends Transacao {
    private int precoUnit;
    private Fornecedor fornecedor;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int qtdeCompra, int precoUnit) {
        super(dataCompra, produto, qtdeCompra);
        this.fornecedor = fornecedor;
    }

    public int getPrecoUnit() {
        return this.precoUnit;
    }

    public void setPrecoUnit(int precoUnit) {
        if(precoUnit <= 0) {
            throw new IllegalArgumentException("Valor invalido!");
        }
        this.precoUnit = precoUnit;
    }

    public boolean comprar(Produto produto, int qtdeCompra) {
        if(produto.verificarEstoqueExcedente(qtdeCompra)) {
            return false;
        }
        else {
            produto.creditarEstoque(qtdeCompra);
            return true;
        }
    }
}
