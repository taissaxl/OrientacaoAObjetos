package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveRetonarEscolaridadeProfessor() {
        Escolaridade escolaridade = new Escolaridade();
        escolaridade.setTipoEscolaridade("Doutor");
        Professor professor = new Professor(escolaridade);

        assertEquals("Doutor", professor.getTipoEscolaridade());
    }

    @Test
    void deveRetornarProfessorSemEscolaridade() {
        try {
            Professor professor = new Professor(null);
            professor.getTipoEscolaridade();
            fail();
        } catch (NullPointerException e){
            assertEquals("Professor sem escolaridade!", e.getMessage());
        }
    }
    @Test
    void deveRetornarNaturalidadeProfessor() {
        Professor professor = new Professor(new Escolaridade("Graduacao"));
        Cidade cidade = new Cidade("Ribeirao Preto", new Estado("SP"));

        professor.setNaturalidade(cidade);
        assertEquals("Ribeirao Preto", professor.getNomeCidade());
    }

    @Test
    void deveRetornarProfessorSemNaturalidade() {
        try {
            Professor professor = new Professor(new Escolaridade("Graduacao"));
            professor.getNomeCidade();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Professor sem naturalidade!", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoEnsinoProfessor() {
        Professor professor = new Professor(new Escolaridade("Graduacao"));
        Curso curso = new Curso();
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino medio");

        curso.setTipoEnsino(tipoEnsino);
        professor.setCargo(curso);
        assertEquals("Ensino medio", professor.getTipoEnsinoContratado());
    }

    @Test
    void deveRetornarProfessorSemCargo() {
        try {
            Professor professor = new Professor(new Escolaridade("Graduacao"));
            professor.getTipoEnsinoContratado();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha cargo definido para o professor!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretorEscola() {
        Professor professor = new Professor(new Escolaridade("Graduacao"));
        Professor diretor = new Professor(new Escolaridade("Graduacao"));
        diretor.setNome("Rogerio");
        Curso curso = new Curso();
        Escola escola = new Escola(diretor);
        curso.setEscola(escola);
        professor.setCargo(curso);

        assertEquals("Rogerio", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarProfessorSemContratacaoDiretor() {
        try {
            Professor professor = new Professor(new Escolaridade("Doutor"));
            professor.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha contratacao para diretor!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCoordenador() {
        Professor professor = new Professor(new Escolaridade("Doutor"));
        Professor coordenador = new Professor(new Escolaridade("Doutor"));
        coordenador.setNome("Pablo");
        Curso curso = new Curso();
        curso.setCoordenador(coordenador);
        professor.setCargo(curso);

        assertEquals("Pablo", professor.getNomeCoordenador());
    }

    @Test
    void deveRetornarProfessorSemCoordenador() {
        try {
            Professor professor = new Professor(new Escolaridade("Mestre"));
            professor.getNomeCoordenador();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Nao ha contratacao para coordenador!", e.getMessage());
        }
    }
}