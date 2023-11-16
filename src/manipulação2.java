import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class manipulação2 {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dis-da-semana}, BOM DIA.

        String nome = "Marcelo";

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour());
    }
}
