package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GrupoTest {

    @Test
    public void deveRetornarEscolaridadePresidente() {
        Departamento departamento = new Departamento();
        Funcionario presidente = new Funcionario("Lúcio Mauro", departamento);
        Grupo grupo = new Grupo();
        Escolaridade escolaridade = new Escolaridade("Pós-graduação");

        grupo.setPresidente(presidente);
        presidente.setEscolaridade(escolaridade);

        assertEquals("Pós-graduação", grupo.getEscolaridadePresidente());
    }

    @Test
    public void deveRetornarGrupoSemPresidente() {
        try {
            Grupo grupo = new Grupo();
            grupo.getEscolaridadePresidente();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há presidente!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarPais() {
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Noruega");

        grupo.setAlocacao(pais);
        assertEquals("Noruega", grupo.getPais());
    }

    @Test
    public void deveRetornarGrupoSemPais() {
        try {
            Grupo grupo = new Grupo();
            grupo.getPais();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("A empresa não tem país!", e.getMessage());
        }
    }

}