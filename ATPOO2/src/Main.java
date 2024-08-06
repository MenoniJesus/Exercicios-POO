import java.util.Date;
import java.util.Scanner;
import br.edu.ifpr.palestra.teste.Teste;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Teste teste = new Teste();

        System.out.println("Teste Sala");
        System.out.print("Digite o nome da sala: ");
        String nomeSala = scanner.nextLine();
        System.out.print("Digite o local da sala: ");
        String localSala = scanner.nextLine();
        System.out.print("Digite a capacidade da sala: ");
        int capacidadeSala = scanner.nextInt();
        teste.testarSala(nomeSala, localSala, capacidadeSala);
        System.out.println("----------------------------------");

        System.out.println("Teste Participante");
        System.out.print("Digite o nome do participante: ");
        String nomeParticipante = scanner.nextLine();
        System.out.print("Digite o email do participante: ");
        String emailParticipante = scanner.nextLine();
        System.out.print("Digite o CPF do participante: ");
        String cpfParticipante = scanner.nextLine();
        teste.testarParticipante(nomeParticipante, emailParticipante, cpfParticipante);
        System.out.println("----------------------------------");

        System.out.println("Teste Palestrante");
        System.out.print("Digite o nome do palestrante: ");
        String nomePalestrante = scanner.nextLine();
        System.out.print("Digite o CPF do palestrante: ");
        String cpfPalestrante = scanner.nextLine();
        System.out.print("Digite o endereço do palestrante: ");
        String enderecoPalestrante = scanner.nextLine();
        System.out.print("Digite o RG do palestrante: ");
        String rgPalestrante = scanner.nextLine();
        System.out.print("Digite a cidade de nascimento do palestrante: ");
        String cidadeNascimentoPalestrante = scanner.nextLine();
        System.out.print("Digite o estado de nascimento do palestrante: ");
        String estadoNascimentoPalestrante = scanner.nextLine();
        System.out.print("Digite a data de nascimento do palestrante: ");
        String dataNascimentoPalestrante = scanner.next();
        teste.testarPalestrante(nomePalestrante, cpfPalestrante, enderecoPalestrante, rgPalestrante, cidadeNascimentoPalestrante, estadoNascimentoPalestrante, dataNascimentoPalestrante);
        System.out.println("----------------------------------");

        System.out.println("Teste Palestra");
        System.out.print("Digite o tema da palestra: ");
        String temaPalestra = scanner.nextLine();
        System.out.print("Digite a data e hora da palestra: ");
        String diaHoraPalestra = scanner.nextLine();
        System.out.print("A palestra exige frequência? (true/false): ");
        boolean exigeFrequenciaPalestra = scanner.nextBoolean();
        teste.testarPalestra(temaPalestra, diaHoraPalestra, exigeFrequenciaPalestra);
        System.out.println("----------------------------------");

        System.out.println("Teste Certificado");
        System.out.print("Digite o número do livro do certificado: ");
        int livroCertificado = scanner.nextInt();
        System.out.print("Digite o número da folha do certificado: ");
        int folhaCertificado = scanner.nextInt();
        System.out.print("Digite o número da página do certificado: ");
        int paginaCertificado = scanner.nextInt();
        System.out.print("Digite o número do certificado: ");
        int numeroDoCertificado = scanner.nextInt();
        teste.testarCertificado(livroCertificado, folhaCertificado, paginaCertificado, numeroDoCertificado);
        System.out.println("----------------------------------");
    }
}