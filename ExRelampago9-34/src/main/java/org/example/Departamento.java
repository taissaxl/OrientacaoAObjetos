package org.example;

public class Departamento {
    private Empresa empresa;
    private Funcionario chefeDepto;

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefeDepto() {
        return this.chefeDepto;
    }

    public void setChefeDepto(Funcionario chefeDepto) {
        this.chefeDepto = chefeDepto;
    }

    public String getEscolaridadeChefeDepto() {
        if(this.chefeDepto == null) {
            throw new IllegalArgumentException("Não há chefe no depto!");
        }
        return this.chefeDepto.getEscolaridadeFuncionario();
    }

    public String getPaisDepartamento() {
        if(this.empresa == null) {
            throw  new IllegalArgumentException("Não há departamento!");
        }
        return this.empresa.getPaisEmpresa();
    }
}
