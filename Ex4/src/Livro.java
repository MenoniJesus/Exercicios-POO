public class Livro {
    String titulo, autor;

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibeDetalhes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}