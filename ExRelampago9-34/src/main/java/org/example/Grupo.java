package org.example;

public class Grupo {
    private Funcionario presidente;
    private Pais alocacao;

    public Funcionario getPresidente() {
        return this.presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public Pais getAlocacao() {
        return this.alocacao;
    }

    public void setAlocacao(Pais alocacao) {
        this.alocacao = alocacao;
    }

    public String getEscolaridadePresidente() {
        if(this.presidente == null) {
            throw new IllegalArgumentException("Não há presidente!");
        }
        return this.presidente.getEscolaridadeFuncionario();
    }

    public String getPais() {
        if(this.alocacao == null) {
            throw new IllegalArgumentException("A empresa não tem país!");
        }
        return this.alocacao.getNomePais();
    }
}
