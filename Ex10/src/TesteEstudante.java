import java.util.Scanner;

public class TesteEstudante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as notas do estudante 1: ");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite as notas do estudante 2: ");
        System.out.print("Nota 1: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota4 = scanner.nextDouble();

        Estudante estudante1 = new Estudante(nota1, nota2);
        Estudante estudante2 = new Estudante(nota3, nota4);

        System.out.println("Estudante 1: ");
        estudante1.mostrarDadosEstudante();
        System.out.println("Estudante 2: ");
        estudante2.mostrarDadosEstudante();
    }
}