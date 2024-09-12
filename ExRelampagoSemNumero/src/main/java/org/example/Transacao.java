package org.example;

public class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao(String dataTransacao, Produto produto, int qtde) {
        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.qtde = qtde;
    }

    public Transacao() {
    }

    public String getDataTransacao() {
        return this.dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }
}
