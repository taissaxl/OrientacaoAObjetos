package org.example;

public class Funcionario {
    private String nome;
    private Departamento setor;
    private Filial coordenador;
    private Escolaridade escolaridade;

    public Funcionario(String nome, Departamento setor) {
        this.nome = nome;
        if(setor == null) {
            throw new IllegalArgumentException("Não há depto registrado!");
        }
        this.setor = setor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getSetor() {
        return this.setor;
    }

    public void setSetor(Departamento setor) {
        if(setor == null) {
            throw new IllegalArgumentException("Não há depto registrado!");
        }
        this.setor = setor;
    }

    public Filial getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Filial coordenador) {
        this.coordenador = coordenador;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEscolaridadeFuncionario() {
        if(this.escolaridade == null) {
            throw new IllegalArgumentException("Funcionário não tem escolaridade!");
        }
        return this.escolaridade.getTipoEscolaridade();
    }

    public String getPaisDepartamento() {
        if(this.setor == null) {
            throw new IllegalArgumentException("Não há depto registrado!");
        }
        return this.setor.getPaisDepartamento();
    }

    public String getEstadoFilial() {
        if(this.coordenador == null) {
            throw new IllegalArgumentException("Filial sem coordenador!");
        }
        return this.coordenador.getEstadoFilial();
    }
}
