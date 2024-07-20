import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int numero = scanner.nextInt();
        System.out.println("A soma dos números primos de 1 até " + numero + " é: " + somaDosNumerosPrimosDeUmAteN(numero));

    }
    public static int somaDosNumerosPrimosDeUmAteN(int n){
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (numeroPrimo(i)) {
                soma += i;
            }
        }
        return soma;
    }
    public static boolean numeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}