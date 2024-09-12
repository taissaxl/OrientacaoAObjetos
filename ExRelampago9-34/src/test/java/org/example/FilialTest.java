package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilialTest {

    @Test
    public void deveRetornarEstadoFilial() {
        Cidade cidade = new Cidade(new Estado("Ceará"));
        Filial filial = new Filial();
        filial.setCidade(cidade);

        assertEquals("Ceará", filial.getEstadoFilial());
    }

    @Test
    public void deveRetonarFilialSemCidade() {
        try {
            Filial filial = new Filial();
            filial.getEstadoFilial();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há cidade registrada!", e.getMessage());
        }
    }

    @Test
    public void deveRetonarNomeDiretorEmpresa() {
        Empresa empresa = new Empresa();
        Filial filial = new Filial();
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario("Paulo", departamento);

        empresa.setDiretor(funcionario);
        filial.setEmpresa(empresa);

        assertEquals("Paulo", filial.getNomeDiretor());
    }

    @Test
    public void deveRetonarFilialSemEmpresa() {
        try {
            Filial filial = new Filial();
            filial.getNomeDiretor();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Filial não tem empresa!", e.getMessage());
        }
    }
}