public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // Construtor com parâmetros
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    // Outros métodos da classe
    public void apresentarDados(){
        System.out.println("-------------------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}