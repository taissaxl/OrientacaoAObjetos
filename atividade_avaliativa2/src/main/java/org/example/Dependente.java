package org.example;

//Nome: Taíssa Xavier Leal
//Matrícula: 202176016

public class Dependente extends Pessoa{

    private Funcionario funcionario;
    private String dataNascimento;
    private int anoNascimento;
    private TesteData data;

    public Dependente(String nome, String dataNascimento) {
        super(nome);
        this.dataNascimento = dataNascimento;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int calcularAnoNascimento() {
        return this.anoNascimento = data.getAnoData() - this.anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if(anoNascimento <= 0) {
            throw new IllegalArgumentException("Ano invalido!");
        }
        this.anoNascimento = anoNascimento;
    }

    public String getDataNascimento() {
        return data.getDataFormatada();
    }

    public void setDataNascimento(TesteData dataNascimento) {
        this.dataNascimento = dataNascimento.getDataFormatada();
    }
}
