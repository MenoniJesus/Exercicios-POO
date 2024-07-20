public class Imovel {
    String endereco;
    double valorVenal, valorVenda;

    public Imovel(String parametroEndereco, double parametroValorVenal){
        endereco = parametroEndereco;
        valorVenal = parametroValorVenal;
        valorVenda = valorVenal + (valorVenal * 0.2);
    }

    public void imprimirDados(){
        System.out.println("Endereco: " + endereco + " Valor Venal: " + valorVenal + " Valor de Venda: " + valorVenda);
    }
}