public class Teste {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fiat", "Palio", 2010);
        Carro seuCarro = new Carro("Chevrolet", "Onix", 2018);

        meuCarro.apresentarDados();
        seuCarro.apresentarDados();
    }
}