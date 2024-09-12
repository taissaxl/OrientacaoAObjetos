package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void deveRetornarEscolaridadeFuncionario() {
        Escolaridade escolaridade = new Escolaridade("Graduação");
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario("Alberta", departamento);
        funcionario.setEscolaridade(escolaridade);

        assertEquals("Graduação", funcionario.getEscolaridadeFuncionario());
    }

    @Test
    public void deveRetonarFuncionarioSemEscolaridade() {
        try{
            Departamento departamento = new Departamento();
            Funcionario funcionario = new Funcionario("Roberto", departamento);
            funcionario.getEscolaridadeFuncionario();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Funcionário não tem escolaridade!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarFuncionarioSemDepartamento() {
        try {
            Funcionario funcionario = new Funcionario("Jeremias", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não há depto registrado!", e.getMessage());
        }
    }

    @Test
    public void deveRetornarDepartamentoNulo() {
        try {
            Funcionario funcionario = new Funcionario("Bernardo", new Departamento());
            funcionario.setSetor(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Não há depto registrado!", e.getMessage());
        }
    }

    @Test
    public void deveRetonarPaisSetorFuncionario() {
        Empresa empresa = new Empresa();
        Pais pais = new Pais("Brasil");
        Departamento departamento = new Departamento();
        Grupo grupo = new Grupo();
        Funcionario funcionario = new Funcionario("Rita", departamento);

        departamento.setEmpresa(empresa);
        empresa.setGrupo(grupo);
        grupo.setAlocacao(pais);

        assertEquals("Brasil", funcionario.getPaisDepartamento());
    }


    @Test
    public void deveRetornarEstadoFilial() {
        Filial filial = new Filial();
        Cidade cidade = new Cidade(new Estado("Maranhão"));
        Funcionario funcionario = new Funcionario("Jonas", new Departamento());

        filial.setCidade(cidade);
        funcionario.setCoordenador(filial);

        assertEquals("Maranhão", funcionario.getEstadoFilial());
    }

    @Test
    public void deveRetonarFuncionarioSemCoordenador() {
        try {
            Departamento departamento = new Departamento();
            Funcionario funcionario = new Funcionario("Luiza", departamento);
            funcionario.getEstadoFilial();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Filial sem coordenador!", e.getMessage());
        }
    }

}