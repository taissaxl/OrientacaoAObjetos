package org.example;

import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class DependenteTest {
    @Test
    public void deveRetornarAnoNascimento() {
        Dependente dependente = new Dependente("Joao", "18/09/2010");
        TesteData data = new TesteData(new Date());
        dependente.setDataNascimento(data);
        assertEquals(data, dependente.getDataNascimento());
    }


}
