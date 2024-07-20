public class Retangulo {
    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calculaArea(){
        double area = this.largura * this.altura;
        return area;
    }
}