public class Produto {
    int codigo, quantidadeEstoque;
    String descricao;
    double precoUnitario;

    public Produto(int parametroCodigo, String parametroDescricao, double parametroPrecoUnitario, int parametroQuantidadeEstoque) {
        codigo = parametroCodigo;
        descricao = parametroDescricao;
        precoUnitario = parametroPrecoUnitario;
        quantidadeEstoque = parametroQuantidadeEstoque;
    }

    public double calcularValorEstoque() {
        return precoUnitario * quantidadeEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        quantidadeEstoque -= quantidade;
    }
}