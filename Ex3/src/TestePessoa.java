import java.util.Scanner;

public class TestePessoa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia do seu nascimento: ");
        int diaNascimento = scanner.nextInt();
        System.out.print("Digite o mês do seu nascimento: ");
        int mesNascimento = scanner.nextInt();
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();

        Pessoa pessoa = new Pessoa(diaNascimento, mesNascimento, anoNascimento);

        System.out.println("Sua idade é: " + pessoa.idade + " anos." + " Nascido(a) em: " + pessoa.diaNascimento + "/" + pessoa.mesNascimento + "/" + pessoa.anoNascimento);
    }
}