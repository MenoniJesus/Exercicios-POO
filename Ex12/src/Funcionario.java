public class Funcionario {
    double salarioBase, salarioFinal;
    int totalDeVendas;

    public Funcionario(double parametroSalarioBase, int parametroTotalDeVendas) {
        salarioBase = parametroSalarioBase;
        totalDeVendas = parametroTotalDeVendas;
        salarioFinal = calcularSalarioFinal();
    }

    public double calcularSalarioFinal() {
        if(totalDeVendas < 0){
            return salarioBase - totalDeVendas;
        } else if (totalDeVendas > 0 && totalDeVendas <= 10000){
            return  salarioBase + (salarioBase * 0.1);
        } else if (totalDeVendas > 10000 && totalDeVendas <= 20000){
            return salarioBase + (salarioBase * 0.15);
        } else {
            return salarioBase + (salarioBase * 0.2);
        }
    }

    public void ImprimeAtributos(){
        System.out.println("Dados do Funcionario");
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Total de Vendas: " + totalDeVendas);
        System.out.println("Salario Final: " + salarioFinal);
    }
}