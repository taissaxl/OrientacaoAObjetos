package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    public void deveCalcularSalarioLiquido() {
        Cargo cargo = new Cargo(1500.f);
        Funcionario funcionario = new Funcionario("Bruna", cargo);
        Ocorrencia ocorrencia = new Ocorrencia(2023, 5, 5, "Salario");
        TesteData testeData = testeData.getDataAtual();
        assertEquals(funcionario.calcularSalarioLiquido());
    }

}