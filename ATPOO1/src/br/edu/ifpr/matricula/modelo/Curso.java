package br.edu.ifpr.matricula.modelo;

public class Curso {
    private String nome, dataCriacao, periodo;

    public Curso(String nome, String dataCriacao, String periodo) {
        this.nome = nome;
        this.dataCriacao = dataCriacao;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getPeriodo() {
        return periodo;
    }
}