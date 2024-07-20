public class TesteImovel {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Rua Dom Elizeu de Morais Pimentel", 400000);
        Imovel imovel2 = new Imovel("Rua Luis Zaros", 200000);

        imovel1.imprimirDados();
        imovel2.imprimirDados();
    }
}