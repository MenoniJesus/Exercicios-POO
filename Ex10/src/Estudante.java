public class Estudante {
    double notaUm, notaDois, media;

    public Estudante(double parametroNotaUm, double parametroNotaDois){
        notaUm = parametroNotaUm;
        notaDois = parametroNotaDois;
        media = (notaUm + notaDois) / 2;
    }

    public void mostrarDadosEstudante(){
        System.out.println("Nota 1: " + notaUm + " Nota 2: " + notaDois + " Média: " + media);
    }
}