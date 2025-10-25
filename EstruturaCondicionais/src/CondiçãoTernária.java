import java.util.Scanner;
import java.util.Locale;

public class CondiçãoTernária {
    public static void main (String []args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Qual é o tamanho em cm????");
        Double tamanho = scanner.nextDouble();

        String resultado = (tamanho >= 18) ? "Nossa lobio mal!!!" : 
                            (tamanho >= 12.5) ? "A média não é uma motivo de vergonha" : 
                           "Tudo pequenininho aí?";
        System.out.println(resultado);
        scanner.close();
    }
}
