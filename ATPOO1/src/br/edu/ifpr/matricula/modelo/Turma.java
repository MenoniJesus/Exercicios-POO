package br.edu.ifpr.matricula.modelo;

public class Turma {
    private String nome;
    private int numeroMinimo, anoIngresso;

    public Turma(String nome, int numeroMinimo, int anoIngresso) {
        this.nome = nome;
        this.numeroMinimo = numeroMinimo;
        this.anoIngresso = anoIngresso;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMinimo() {
        return numeroMinimo;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

}
