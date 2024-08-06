package br.edu.ifpr.palestra.modelo;

public class Sala {
    private int capacidade;
    private String nome, local;

    public Sala(String nome, String local, int capacidade) {
        this.nome = nome;
        this.local = local;
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }
}