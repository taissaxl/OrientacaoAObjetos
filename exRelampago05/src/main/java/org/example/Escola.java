package org.example;

public class Escola {
    private Professor diretor;
    private Cidade cidade;

    public Escola() {}

    public Escola(Professor diretor) {
        if (diretor == null) {
            throw new IllegalArgumentException("Escola sem diretor!");
        }
        else {
            this.diretor = diretor;
        }
    }

    public Professor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Professor diretor) {
        if (diretor != null) {
            this.diretor = diretor;
        }
    }

    public String getNomeDiretor(){
        if (this.diretor == null){
            throw new NullPointerException("Escola sem diretor!");
        }
        return this.diretor.getNome();
    }

    public String getEscolaridadeDiretor() {
        if (this.diretor == null) {
            throw new NullPointerException("Escola sem diretor!");
        }
        return this.diretor.getTipoEscolaridade();
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getEstadoEscola() {
        if (this.cidade == null) {
            throw new NullPointerException("Escola sem cidade!");
        }
        return this.cidade.getNomeEstado();
    }
}
