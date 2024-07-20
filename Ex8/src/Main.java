import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite valor para A: ");
        int numA = scanner.nextInt();

        System.out.print("Digite valor para B: ");
        int numB = scanner.nextInt();

        int numC = numA;
        numA = numB;
        numB = numC;
        System.out.println("Valor de A: " + numA);
        System.out.println("Valor de B: " + numB);
    }
}