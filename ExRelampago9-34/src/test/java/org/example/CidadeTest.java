package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CidadeTest {
    @Test
    public void deveRetornarEstado() {
        Estado estado = new Estado("Rio de Janeiro");
        Cidade cidade = new Cidade(estado);
        assertEquals("Rio de Janeiro", cidade.getEstadoCidade());
    }

    @Test
    public void deveRetornarEstadoInvalido() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há estado registrado!", e.getMessage());
        }
    }
}