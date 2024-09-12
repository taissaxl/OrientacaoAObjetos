package org.example;

import java.util.ArrayList;

public class Produto {
    private int qtdeEstoque;
    private int precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;

    private Transacao transacao;

    private ArrayList<String> historico;
    private String nome;

    public Produto(String nome, int qtdeEstoque, int precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nome = nome;
        this.qtdeEstoque = qtdeEstoque;
        this.precoUnit = precoUnit;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void debitarEstoque(int quantidade) {
        if(verificarEstoqueInsuficiente(quantidade)) {
            throw new IllegalArgumentException("Estoque insuficiente!");
        }
        this.qtdeEstoque -= quantidade;
    }

    public void creditarEstoque(int quantidade) {
        if(verificarEstoqueExcedente(quantidade)) {
            throw new IllegalArgumentException("Estoque excedente!");
        }
        this.qtdeEstoque += quantidade;
    }

    public boolean verificarEstoqueBaixo() {
        if(this.qtdeEstoque < 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        if(this.qtdeEstoque < quantidade) {
            return true;
        }
        else {
            return false;
        }
    }

    public int calcularValorVenda(int quantidade) {
        if(quantidade < 0) {
            throw new IllegalArgumentException("Quantidade inválida!");
        }
        return this.precoUnit * quantidade;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        if(this.qtdeEstoque + quantidade > estoqueMaximo) {
            return true;
        }
        else {
            return false;
        }
    }

    public void vender(String dataVenda, Pessoa cliente, int qtdeVendida) {
        Venda venda = new Venda(dataVenda, cliente, this, qtdeVendida);
        if(venda.vender(this, qtdeVendida)) {
            registrarHistorico("Venda de " + this);
        }
    }

    public void comprar(String dataVenda, Fornecedor fornecedor, int qtdeVendida) {
        Compra compra = new Compra(dataVenda, this, fornecedor, qtdeVendida, precoUnit);
        if(compra.comprar(this, qtdeVendida)) {
            registrarHistorico("Compra de " + this);
        }
    }

    public String exibirHistorico() {
        StringBuilder historicoString = new StringBuilder();
        for (String dadosTransacao : historico) {
            historicoString.append(dadosTransacao).append("\n");
        }
        return historicoString.toString();
    }

    public void registrarHistorico(String dadosTransacao) {
        if(dadosTransacao == null) {
            throw new NullPointerException("Nenhuma transacao registrada!");
        }
        this.historico = new ArrayList<String>();
        this.historico.add(dadosTransacao);
    }

    public int getQtdeEstoque() {
        return this.qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {
        if(qtdeEstoque < 0) {
            throw new IllegalArgumentException("Quantidade invalida!");
        }
        this.qtdeEstoque = qtdeEstoque;
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

    public int getEstoqueMinimo() {
        return this.estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        if(estoqueMinimo <= 0) {
            throw new IllegalArgumentException("Estoque invalido!");
        }
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return this.estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        if(estoqueMaximo <= 0) {
            throw new IllegalArgumentException("Estoque invalido");
        }
        this.estoqueMaximo = estoqueMaximo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
