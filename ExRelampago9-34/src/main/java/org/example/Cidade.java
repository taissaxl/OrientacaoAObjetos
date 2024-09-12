package org.example;

public class Cidade {
    private Estado estado;

    public Cidade(Estado estado) {
        if(estado == null) {
            throw new IllegalArgumentException("Não há estado registrado!");
        }
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getEstadoCidade() {
        if(this.estado == null) {
            throw new IllegalArgumentException("Não há estado registrado!");
        }
        return this.estado.getNome();
    }
}
