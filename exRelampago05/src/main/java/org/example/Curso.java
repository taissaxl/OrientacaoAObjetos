package org.example;

public class Curso {

    private Professor coordenador;
    private Escola escola;
    private TipoEnsino tipoEnsino;

    public Curso(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public Curso() {}

    public String getNomeDiretorEscola() {
        return this.escola.getNomeDiretor();
    }

    public Escola getEscola() {
        return escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getNomeTipoEnsino() {
        return this.tipoEnsino.getNome();
    }

    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        if (coordenador != null) {
            this.coordenador = coordenador;
        }
    }

    public String getEscolaridadeCoordenador() {
        if (this.coordenador == null) {
            throw new NullPointerException("Nao ha coordenador registrado");
        }
        return coordenador.getTipoEscolaridade();
    }
    public String getNomeCoordenadorCurso() {
        if (this.coordenador == null) {
            throw new NullPointerException("Nao ha coordenador registrado");
        }
        return this.coordenador.getNome();
    }

    public String getEstadoCurso() {
        if (this.escola == null) {
            throw new NullPointerException("Nao ha estado registrado!");
        }
        return this.escola.getEstadoEscola();
    }
}
