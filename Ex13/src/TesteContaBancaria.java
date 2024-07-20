import java.util.Scanner;

public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(nomeTitular, numeroConta, saldo);
        conta.imprimirDados();

        System.out.print("Digite o valor a ser depositado: ");
        double valor = scanner.nextDouble();
        conta.depositar(valor);
        conta.imprimirDados();

        System.out.print("Digite o valor a ser sacado: ");
        double valor2 = scanner.nextDouble();
        conta.sacar(valor2);
        conta.imprimirDados();
    }
}