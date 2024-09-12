package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DepartamentoTest {
    @Test
    public void deveRetornarPais() {
        Empresa empresa = new Empresa();
        Departamento departamento = new Departamento();
        Grupo grupo = new Grupo();
        Pais pais = new Pais("Brasil");

        empresa.setGrupo(grupo);
        grupo.setAlocacao(pais);
        departamento.setEmpresa(empresa);

        assertEquals("Brasil", departamento.getPaisDepartamento());
    }

    @Test
    public void deveRetornarDepartamentoInexistente() {
        try {
            Departamento departamento = new Departamento();
            departamento.setEmpresa(null);
            departamento.getPaisDepartamento();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há departamento!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarEscolaridadeChefeDepto() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario("Plínio", departamento);
        Escolaridade escolaridade = new Escolaridade("Doutor");
        departamento.setChefeDepto(funcionario);
        funcionario.setEscolaridade(escolaridade);

        assertEquals("Doutor", departamento.getEscolaridadeChefeDepto());
    }

    @Test
    public void deveRetornarDeptoSemChefe() {
        try {
            Departamento departamento = new Departamento();
            departamento.setChefeDepto(null);
            departamento.getEscolaridadeChefeDepto();
        } catch (IllegalArgumentException e) {
            assertEquals("Não há chefe no depto!", e.getMessage());
        }
    }
}