package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetonarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor(escolaridade);
        Curso curso = new Curso(professor);
        escolaridade.setTipoEscolaridade("Graduacao");

        assertEquals("Graduacao", curso.getEscolaridadeCoordenador());
    }

    @Test
    public void deveRetornarCursoSemCoordenadorEscolaridade() {
        try {
            Curso curso = new Curso();
            curso.getEscolaridadeCoordenador();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha coordenador registrado!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstadoCurso() {
        Cidade cidade = new Cidade("JF", new Estado("MG"));
        Curso curso = new Curso();
        Escola escola = new Escola();
        escola.setCidade(cidade);
        curso.setEscola(escola);
        assertEquals("MG", curso.getEstadoCurso());
    }

    @Test
    public void deveRetornarCursoSemEscola() {
        try {
            Curso curso = new Curso();
            curso.getEstadoCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha escola para o curso!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Graduacao");
        Curso curso = new Curso();
        curso.setTipoEnsino(tipoEnsino);

        assertEquals("Graduacao", curso.getNomeTipoEnsino());
    }

    @Test
    public void deveRetornarCursoSemTipoEnsino() {
        try {
            Curso curso = new Curso();
            curso.getNomeTipoEnsino();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha tipo de ensino no curso!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeCoordenador(){
        Curso curso = new Curso();
        Professor coordenador = new Professor(new Escolaridade("Graduacao"));
        curso.setCoordenador(coordenador);
        coordenador.setNome("Laura");

        assertEquals("Laura", curso.getNomeCoordenadorCurso());
    }

    @Test
    public void deveRetornarCursoSemCoordenador() {
        try {
            Curso curso = new Curso();
            curso.getNomeCoordenadorCurso();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha coordenador registrado!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarNomeDiretor(){
        Curso curso = new Curso();
        Professor diretor = new Professor(new Escolaridade("Doutor"));
        Escola escola = new Escola(diretor);
        diretor.setNome("Mauro Lucio");
        curso.setEscola(escola);

        assertEquals("Mauro Lucio", curso.getNomeDiretorEscola());
    }

    @Test
    public void deveRetornarCursoSemEscolaDiretor() {
        try {
            Curso curso = new Curso();
            curso.getNomeDiretorEscola();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem diretor!", e.getMessage());
        }
    }
}