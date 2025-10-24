import java.util.Scanner;
import java.util.Locale;

public class SaldoConta {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();
       
       ///Double saldo = 1000.0;

        System.out.println("Digite o valor do saque");
        Double valorDeSaque = scanner.nextDouble();

        if (valorDeSaque < saldo){
            saldo = saldo - valorDeSaque;
            System.out.println("Novo Saldo : " + saldo);
        }else 
            System.out.println("Saldo insuficiente para saque");
               
        scanner.close();    
    }
}