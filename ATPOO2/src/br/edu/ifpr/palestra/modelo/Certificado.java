package br.edu.ifpr.palestra.modelo;

public class Certificado {
    private int livro, folha, pagina, numeroDoCertificado;

    public Certificado(int livro, int folha, int pagina, int numeroDoCertificado) {
        this.livro = livro;
        this.folha = folha;
        this.pagina = pagina;
        this.numeroDoCertificado = numeroDoCertificado;
    }

    public int getLivro() {
        return livro;
    }

    public int getFolha() {
        return folha;
    }

    public int getPagina() {
        return pagina;
    }

    public int getNumeroDoCertificado() {
        return numeroDoCertificado;
    }
}