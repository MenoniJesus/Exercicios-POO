package br.edu.ifpr.matricula.modelo;

public class Estudante {
    private String nome, cpf;

    public Estudante(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}