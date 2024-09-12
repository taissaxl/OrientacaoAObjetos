package org.example;

public class Empresa {
    private String nomeEmpresa;
    private Grupo grupo;
    private Funcionario diretor;

    public String getNomeEmpresa() {
        return this.nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        if(grupo == null) {
            throw new IllegalArgumentException("Empresa sem grupo!");
        }
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }

    public String getNomeDiretor() {
        if(this.diretor == null) {
            throw new IllegalArgumentException("Empresa não tem diretor!");
        }
        return this.diretor.getNome();
    }

    public String getPaisEmpresa() {
        return this.grupo.getPais();
    }
}
