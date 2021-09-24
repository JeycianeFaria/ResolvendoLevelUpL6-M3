package br.com.zup.Exemplo6;

public class Atores {
    private String nome;
    private String papel;
    private double salario;

    public Atores() {

    }

    public Atores(String nome) {
        this.nome = nome;
    }

    public Atores(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Atores(String nome, String papel, double salario) {
        this.nome = nome;
        this.papel = papel;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}