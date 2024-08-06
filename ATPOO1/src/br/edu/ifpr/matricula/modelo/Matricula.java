package br.edu.ifpr.matricula.modelo;

public class Matricula {
    private String ra, data;

    public Matricula(String ra, String data) {
        this.ra = ra;
        this.data = data;
    }

    public String getRa() {
        return ra;
    }

    public String getData() {
        return data;
    }
}