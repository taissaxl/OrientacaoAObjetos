package org.example;

public class Cidade {

    private String nome;
    private Estado estado;

    public Cidade (String nomeCidade, Estado estado) {
        this.nome = nomeCidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if(this.estado != null) {
            this.estado = estado;
        }
    }

    public String getNomeEstado() {
        if(this.estado == null) {
            throw new NullPointerException("Estado nao registrado!");
        }
        return this.estado.getNome();
    }
}
