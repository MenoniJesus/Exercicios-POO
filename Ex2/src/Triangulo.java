public class Triangulo{
    double ladoA, ladoB, ladoC;
    String tipoTriangulo;

    public Triangulo(double parametroLadoA, double parametroLadoB, double parametroLadoC){
        ladoA = parametroLadoA;
        ladoB = parametroLadoB;
        ladoC = parametroLadoC;
        tipoTriangulo = "Invalido";
    }

    public Triangulo(double parametroLadoA, double parametroLadoB, double parametroLadoC, String parametroTipoTriangulo){
        this(parametroLadoA, parametroLadoB, parametroLadoC);
        tipoTriangulo = parametroTipoTriangulo;
    }
}