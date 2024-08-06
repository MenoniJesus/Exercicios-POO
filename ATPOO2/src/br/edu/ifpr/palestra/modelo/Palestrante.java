package br.edu.ifpr.palestra.modelo;

public class Palestrante {
    private String nome, cpf, endereco, rg, cidadeNascimento, estadoNascimento;
    private String dataNascimento;

    public Palestrante(String nome, String cpf, String endereco, String rg, String cidadeNascimento, String estadoNascimento, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.rg = rg;
        this.cidadeNascimento = cidadeNascimento;
        this.estadoNascimento = estadoNascimento;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getRg() {
        return rg;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public String getEstadoNascimento() {
        return estadoNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}