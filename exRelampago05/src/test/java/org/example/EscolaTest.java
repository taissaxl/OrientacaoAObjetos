package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {

    @Test
    void deveRetornarEscolaSemDiretor() {
        try {
            Escola escola = new Escola(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Escola sem diretor!", e.getMessage());
        }
    }

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Escolaridade escolaridade = new Escolaridade();
        Professor professor = new Professor(escolaridade);
        Escola escola = new Escola(professor);
        escolaridade.setTipoEscolaridade("Graduacao");

        assertEquals("Graduacao", escola.getEscolaridadeDiretor());
    }

    @Test
    public void deveRetornarEscolaSemDiretorEscolaridade() {
        try {
            Escola escola = new Escola();
            escola.getEscolaridadeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem diretor!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEstadoEscola() {
        Escola escola = new Escola();
        Cidade cidade = new Cidade("MA", new Estado("MA"));
        escola.setCidade(cidade);
        assertEquals("MA", escola.getEstadoEscola());
    }

    @Test
    public void deveRetornarEscolaSemCidade() {
        try {
            Escola escola = new Escola();
            escola.getEstadoEscola();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem cidade!", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor professor = new Professor(new Escolaridade("Graduacao"));
        Escola escola = new Escola(professor);
        professor.setNome("Wagner");

        assertEquals("Wagner", escola.getNomeDiretor());
    }

    @Test
    public void deveRetornarNomeEscolaSemDiretor() {
        try {
            Escola escola = new Escola();
            escola.getNomeDiretor();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Escola sem diretor!", e.getMessage());
        }
    }

}