package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    public void deveRetornarEstadoCidade() {
        Cidade cidade = new Cidade("Rio Novo", new Estado("MG"));
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    public void deveRetornarCidadeSemEstado() {
        try {
            Cidade cidade = new Cidade("Rio Pomba",null);
            cidade.getNomeEstado();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Estado nao registrado!", e.getMessage());
        }
    }

}