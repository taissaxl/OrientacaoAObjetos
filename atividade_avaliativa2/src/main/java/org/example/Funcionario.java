package org.example;

//Nome: Taíssa Xavier Leal
//Matrícula: 202176016

import java.util.ArrayList;

public class Funcionario extends Pessoa {

    private Cargo cargo;
    private ArrayList<Dependente> dependentes;
    private Ocorrencia ocorrencias;

    private TesteData dataAtual;

    public Funcionario(String nome, Cargo cargo) {
        super(nome);
        this.cargo = cargo;
        this.dependentes = new ArrayList<>();
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    public float calcularSalarioLiquido(TesteData mes, TesteData ano) {
        float salarioLiquido = cargo.getSalarioBruto();
        if(dataAtual.getAnoData() == mes.getMesData() && dataAtual.getAnoData() == ano.getAnoData()) {
            salarioLiquido = (salarioLiquido- ocorrencias.getValorDesconto()) + ocorrencias.getValorAcrescimo();
        }
        for(Dependente dependente : dependentes) {
            if(dependente.getAnoNascimento() < 18) {
                salarioLiquido += 100.f;
            }
        }
        return salarioLiquido;
    }

    public String exibirDependetes() {
        for(Dependente dependente : dependentes) {
            return dependente.getNome();
        }
        return null;
    }

    public void calcularAniversarioDependentes() {
        String proximoAniversario;
        for(Dependente dependente : dependentes) {
            proximoAniversario = String.valueOf(dependente.getDataNascimento().compareTo(dataAtual.getDataFormatada()));
        }
    }
}
