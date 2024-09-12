package org.example;

public class Aluno extends Pessoa {

    private Curso curso;
    public Aluno(Escolaridade escolaridade) {
        super(escolaridade);
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getEstadoEscolaAluno() {
        if (this.curso == null) {
            throw new NullPointerException("Aluno sem curso!");
        }
        return this.curso.getEstadoCurso();
    }

    public String getNomeCoordenadorCursoAluno () {
        if (this.curso == null) {
            throw new NullPointerException("Aluno sem curso!");
        }
        return this.curso.getNomeCoordenadorCurso();
    }
}
