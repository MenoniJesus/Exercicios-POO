public class ContaBancaria {
    String nomeTitular;
    double saldo, taxaDeJuros;
    int numeroConta;

    public ContaBancaria(String parametroNomeTitular, int parametroNumeroConta, double parametroSaldo) {
        nomeTitular = parametroNomeTitular;
        numeroConta = parametroNumeroConta;
        saldo = parametroSaldo;
        taxaDeJuros = calcularTaxaDeJuros();
    }

    public double calcularTaxaDeJuros() {
        if(saldo < 10000){
            return 0.05;
        } else if (saldo < 50000) {
            return 0.1;
        } else {
            return 0.15;
        }
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void imprimirDados(){
        System.out.println("Numero da Conta: " + numeroConta + " Nome do Titular: " + nomeTitular);
        System.out.println("Saldo: " + saldo + " Taxa de Juros: " + taxaDeJuros);
    }
}