import java.util.Scanner;
import br.edu.ifpr.matricula.teste.Teste;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teste teste = new Teste();

        System.out.println("Teste Estudante");
        System.out.print("Digite o nome do estudante: ");
        String nomeEstudante = scanner.nextLine();
        System.out.print("Digite o CPF do estudante: ");
        String cpfEstudante = scanner.nextLine();
        teste.testarEstudante(nomeEstudante, cpfEstudante);
        System.out.println("----------------------------------");

        System.out.println("Teste Matricula");
        System.out.print("Digite o RA da matricula: ");
        String raMatricula = scanner.nextLine();
        System.out.print("Digite a data da matricula: ");
        String dataMatricula = scanner.nextLine();
        teste.testarMatricula(raMatricula, dataMatricula);
        System.out.println("----------------------------------");

        System.out.println("Teste Turma");
        System.out.print("Digite o nome da turma: ");
        String nomeTurma = scanner.nextLine();
        System.out.print("Digite o número mínimo da turma: ");
        int numeroMinimoTurma = scanner.nextInt();
        System.out.print("Digite o ano de ingresso da turma: ");
        int anoIngressoTurma = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        teste.testarTurma(nomeTurma, numeroMinimoTurma, anoIngressoTurma);
        System.out.println("----------------------------------");

        System.out.println("Teste Curso");
        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();
        System.out.print("Digite a data de criação do curso: ");
        String dataCriacaoCurso = scanner.nextLine();
        System.out.print("Digite o período do curso: ");
        String periodoCurso = scanner.nextLine();
        teste.testarCurso(nomeCurso, dataCriacaoCurso, periodoCurso);
        System.out.println("----------------------------------");

        System.out.println("Teste Disciplina");
        System.out.print("Digite o nome da disciplina: ");
        String nomeDisciplina = scanner.nextLine();
        System.out.print("Digite a carga horária da disciplina: ");
        int cargaHorariaDisciplina = scanner.nextInt();
        System.out.print("Digite o ano da disciplina: ");
        int anoDisciplina = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        teste.testarDisciplina(nomeDisciplina, cargaHorariaDisciplina, anoDisciplina);
        System.out.println("----------------------------------");

        System.out.println("Teste Professor");
        System.out.print("Digite o nome do professor: ");
        String nomeProfessor = scanner.nextLine();
        teste.testarProfessor(nomeProfessor);

        scanner.close();
    }
}