package org.example;

public class TipoEnsino {
    private String nomeTipoEnsino;

    public TipoEnsino(String nome) {
        this.nomeTipoEnsino = nome;
    }

    public String getNome() {
        return this.nomeTipoEnsino;
    }

    public void setNome(String nomeTipoEnsino) {
        this.nomeTipoEnsino = nomeTipoEnsino;
    }
}
