package br.edu.ifpr.matricula.teste;
import br.edu.ifpr.matricula.modelo.*;

public class Teste {
    public void testarEstudante(String nome, String cpf){
        Estudante estudante = new Estudante(nome, cpf);
        System.out.println("Nome: " + estudante.getNome() + " CPF: " + estudante.getCpf());
    }

    public void testarMatricula(String ra, String data){
        Matricula matricula = new Matricula(ra, data);
        System.out.println("RA: " + matricula.getRa() + " Data: " + matricula.getData());
    }

    public void testarTurma(String nome, int numeroMinimo, int anoIngresso){
        Turma turma = new Turma(nome, numeroMinimo, anoIngresso);
        System.out.println("Nome: " + turma.getNome() + " Número Mínimo: " + turma.getNumeroMinimo() + " Ano de Ingresso: " + turma.getAnoIngresso());
    }

    public void testarCurso(String nome, String dataCriacao, String periodo){
        Curso curso = new Curso(nome, dataCriacao, periodo);
        System.out.println("Nome: " + curso.getNome() + " Data de Criação: " + curso.getDataCriacao() + " Período: " + curso.getPeriodo());
    }

    public void testarDisciplina(String nome, int cargaHoraria, int ano){
        Disciplina disciplina = new Disciplina(nome, cargaHoraria, ano);
        System.out.println("Nome: " + disciplina.getNome() + " Carga Horária: " + disciplina.getCargaHoraria() + " Ano: " + disciplina.getAno());
    }

    public void testarProfessor(String nome){
        Professor professor = new Professor(nome);
        System.out.println("Nome: " + professor.getNome());
    }
}