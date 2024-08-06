package br.edu.ifpr.palestra.teste;
import br.edu.ifpr.palestra.modelo.*;

import java.util.Date;

public class Teste {
    public void testarSala(String nome, String local, int capacidade){
        Sala sala = new Sala(nome, local, capacidade);
        System.out.println("Sala: " + sala.getNome() + " - " + sala.getLocal() + " - " + sala.getCapacidade());
    }

    public void testarPalestrante(String nome, String cpf, String endereco, String rg, String cidadeNascimento, String estadoNascimento, String dataNascimento){
        Palestrante palestrante = new Palestrante(nome, cpf, endereco, rg, cidadeNascimento, estadoNascimento, dataNascimento);
        System.out.println("Palestrante: " + palestrante.getNome() + " - " + palestrante.getCpf() + " - " + palestrante.getEndereco() + " - " + palestrante.getRg() + "\n" + palestrante.getCidadeNascimento() + " - " + palestrante.getEstadoNascimento() + " - " + palestrante.getDataNascimento());
    }

    public void testarParticipante(String nome, String email, String cpf){
        Participante participante = new Participante(nome, email, cpf);
        System.out.println("Participante: " + participante.getNome() + " - " + participante.getEmail() + " - " + participante.getCpf());
    }

    public void testarCertificado(int livro, int folha, int pagina, int numeroDoCertificado){
        Certificado certificado = new Certificado(livro, folha, pagina, numeroDoCertificado);
        System.out.println("Certificado: " + certificado.getLivro() + " - " + certificado.getFolha() + " - " + certificado.getPagina() + " - " + certificado.getNumeroDoCertificado());
    }

    public void testarPalestra(String tema, String diaHora, boolean exigeFrequencia){
        Palestra palestra = new Palestra(tema, diaHora, exigeFrequencia);
        System.out.println("Palestra: " + palestra.getTema() + " - " + palestra.getDiaHora() + " - " + palestra.isExigeFrequencia());
    }
}