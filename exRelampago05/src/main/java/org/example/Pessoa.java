package org.example;

public class Pessoa {

    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Pessoa(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getTipoEscolaridade() {
        if (this.escolaridade == null) {
            throw new NullPointerException("A pessoa não tem escolaridade!");
        }
        return this.escolaridade.getTipoEscolaridade();
    }

    public Cidade getNaturalidade() {
        return this.naturalidade;
    }

    public void setNaturalidade(Cidade naturalidade) {
        if(this.naturalidade == null) {
            throw new NullPointerException("A pessoa nao tem naturalidade!");
        }
        this.naturalidade = naturalidade;
    }

    public String getEstadoNome() {
        if (this.naturalidade == null){
            throw new NullPointerException("A pessoa nao tem naturalidade!");
        }
        return this.naturalidade.getNomeEstado();
    }

    public String getNomeCidade() {
        if (this.naturalidade == null){
            throw new NullPointerException("A pessoa nao tem naturalidade!");
        }
        return this.naturalidade.getNome();
    }
}
