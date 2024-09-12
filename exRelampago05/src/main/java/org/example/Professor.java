package org.example;

public class Professor extends Pessoa {

    private Curso cargo;
    private Cidade cidade;

    public Professor(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Curso getCargo() {
        return this.cargo;
    }

    public void setCargo(Curso cargo) {
        this.cargo = cargo;
    }

    public String getNomeCoordenador() {
        if(this.cargo == null) {
            throw new NullPointerException("Nao ha contratacao para coordenador!");
        }
        return this.cargo.getNomeCoordenadorCurso();
    }

    public String getNomeDiretor() {
        if(this.cargo == null) {
            throw new NullPointerException("Nao ha contratacao para diretor!");
        }
        return this.cargo.getNomeDiretorEscola();
    }

    public String getTipoEnsinoContratado() {
        if(this.cargo == null) {
            throw new NullPointerException("Nao ha cargo definido para o professor!");
        }
        return this.cargo.getNomeTipoEnsino();
    }

    public String getNomeCidade() {
        return this.cidade.getNome();
    }

}
