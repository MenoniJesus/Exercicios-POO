public class Pessoa{
    String nome, sobrenome;

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }
}