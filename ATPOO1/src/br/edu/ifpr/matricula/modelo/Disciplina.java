package br.edu.ifpr.matricula.modelo;

public class Disciplina {
    private String nome;
    private int cargaHoraria, ano;

    public Disciplina(String nome, int cargaHoraria, int ano) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public int getAno() {
        return ano;
    }
}