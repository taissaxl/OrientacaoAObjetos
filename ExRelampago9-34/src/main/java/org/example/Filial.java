package org.example;

public class Filial {

    private Empresa empresa;
    private Cidade cidade;

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getEstadoFilial() {
        if(this.cidade == null) {
            throw new IllegalArgumentException("Não há cidade registrada!");
        }
        return this.cidade.getEstadoCidade();
    }

    public String getNomeDiretor() {
        if(this.empresa == null) {
            throw new IllegalArgumentException("Filial não tem empresa!");
        }
        return this.empresa.getNomeDiretor();
    }
}
