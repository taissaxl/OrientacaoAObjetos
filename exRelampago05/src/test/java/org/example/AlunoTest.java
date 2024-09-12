package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarNaturalidadeAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
        Cidade cidade = new Cidade("JF", new Estado("MG"));
        aluno.setNaturalidade(cidade);

        assertEquals("MG", aluno.getEstadoNome());
    }

    @Test
    void deveRetornarAlunoSemNaturalidade() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
            aluno.getEstadoNome();
            fail();
        } catch (NullPointerException e) {
            assertEquals("A pessoa nao tem naturalidade!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstadoEscola() {
        Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        Cidade cidade = new Cidade("JF", new Estado("MG"));
        escola.setCidade(cidade);
        curso.setEscola(escola);
        aluno.setCurso(curso);

        assertEquals("MG", aluno.getEstadoEscolaAluno());
    }

    @Test
    void deveRetornarAlunoSemCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
            aluno.getEstadoEscolaAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso!", e.getMessage());
        }
    }

    @Test
    void deveRetornarCoordenadorCursoAluno() {
        Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
        Curso curso = new Curso();
        Professor professorCoordenador = new Professor(new Escolaridade("Graduacao"));
        professorCoordenador.setNome("Flavia");
        curso.setCoordenador(professorCoordenador);
        aluno.setCurso(curso);

        assertEquals("Flavia", aluno.getNomeCoordenadorCursoAluno());
    }

    @Test
    void deveRetornarAlunoSemCoordenadorCurso() {
        try {
            Aluno aluno = new Aluno(new Escolaridade("Fundamental"));
            aluno.getNomeCoordenadorCursoAluno();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Aluno sem curso!", e.getMessage());
        }
    }

}