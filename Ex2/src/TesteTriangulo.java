import java.util.Scanner;
import java.util.Arrays;

public class TesteTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado A do triângulo: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o lado B do triângulo: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o lado C do triângulo: ");
        double ladoC = scanner.nextDouble();

        double[] lados = {ladoA, ladoB, ladoC};
        Arrays.sort(lados);

        if (lados[0] + lados[1] > lados[2]) {
            String tipoTriangulo;
            if (ladoA == ladoB && ladoB == ladoC) {
                tipoTriangulo = "Equilátero";
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                tipoTriangulo = "Isósceles";
            } else {
                tipoTriangulo = "Escaleno";
            }
            Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC, tipoTriangulo);
            System.out.println(triangulo.tipoTriangulo);
            System.out.println(triangulo.ladoA);
            System.out.println(triangulo.ladoB);
            System.out.println(triangulo.ladoC);
        } else {
            Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);
            System.out.println(triangulo.tipoTriangulo);
            System.out.println(triangulo.ladoA);
            System.out.println(triangulo.ladoB);
            System.out.println(triangulo.ladoC);
        }
    }
}