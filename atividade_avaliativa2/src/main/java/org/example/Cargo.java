package org.example;

//Nome: Taíssa Xavier Leal
//Matrícula: 202176016

public class Cargo {

    private Funcionario funcionario;
    private float salarioBruto;

    public Cargo(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
