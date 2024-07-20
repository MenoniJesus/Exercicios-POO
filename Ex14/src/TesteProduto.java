public class TesteProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Caneta", 1.50, 100);

        double valorEstoque = produto.calcularValorEstoque();
        System.out.println("Valor do estoque: " + valorEstoque);

        produto.adicionarEstoque(50);

        double novoValorEstoque = produto.calcularValorEstoque();
        System.out.println("Novo valor do estoque: " + novoValorEstoque);
    }
}