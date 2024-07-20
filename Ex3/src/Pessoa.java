import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Pessoa {
    int diaNascimento, mesNascimento, anoNascimento, idade;

    public Pessoa(int parametroDiaNascimento, int parametroMesNascimento, int parametroAnoNascimento){
        diaNascimento = parametroDiaNascimento;
        mesNascimento = parametroMesNascimento;
        anoNascimento = parametroAnoNascimento;
        idade = calcularIdade();
    }

    Date date = new Date();
    LocalDate localDate = date.toInstant()
            .atZone(ZoneId.systemDefault())
            .toLocalDate();

    int ano = localDate.getYear();
    int mes = localDate.getMonthValue();
    int dia = localDate.getDayOfMonth();

    public int calcularIdade(){
        this.idade = ano - anoNascimento;
        if(mes < mesNascimento){
            idade--;
        }
        return idade;
    }
}