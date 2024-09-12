package org.example;

//Nome: Taíssa Xavier Leal
//Matrícula: 202176016

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ocorrencia {

    private Funcionario funcionario;

    private Date data;
    private int dataOcorrencia;
    private float valorAcrescimo;
    private float valorDesconto;
    private String descricaoOcorrencia;


    public Ocorrencia(int dataOcorrencia, float valorAcrescimo, float valorDesconto, String descricaoOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
        this.valorAcrescimo = valorAcrescimo;
        this.valorDesconto = valorDesconto;
        this.descricaoOcorrencia = descricaoOcorrencia;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getDataOcorrencia() {
        return data.getDate();
    }

    public void setDataOcorrencia(Date data) {
        this.dataOcorrencia = data.getDate();
    }

    public float getValorAcrescimo() {
        return this.valorAcrescimo;
    }

    public void setValorAcrescimo(float valorAcrescimo) {
        this.valorAcrescimo = valorAcrescimo;
    }

    public float getValorDesconto() {
        return this.valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getDescricaoOcorrencia() {
        return this.descricaoOcorrencia;
    }

    public void setDescricaoOcorrencia(String descricaoOcorrencia) {
        this.descricaoOcorrencia = descricaoOcorrencia;
    }
}
