package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmpresaTest {

    @Test
    public void deveRetornarEmpresaSemGrupo() {
        try {
            Empresa empresa = new Empresa();
            empresa.setGrupo(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empresa sem grupo!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarPaisEmpresa() {
        Empresa empresa = new Empresa();
        Pais pais = new Pais("Brasil");
        Grupo grupo = new Grupo();

        empresa.setGrupo(grupo);
        grupo.setAlocacao(pais);

        assertEquals("Brasil", empresa.getPaisEmpresa());
    }

    @Test
    public void deveRetornarNomeDiretor() {
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento();
        Funcionario diretor = new Funcionario("Claudia", departamento);

        empresa.setDiretor(diretor);

        assertEquals("Claudia", empresa.getNomeDiretor());
    }

    @Test
    public void deveRetornarEmpresaSemDiretor() {
        try {
            Empresa empresa = new Empresa();
            empresa.getNomeDiretor();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empresa não tem diretor!", e.getMessage());
        }
    }
}