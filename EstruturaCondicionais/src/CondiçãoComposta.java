///Resuktado Escolar
import java.util.Scanner;

public class CondiçãoComposta{
public static void main(String[]args){

    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite sua nota");
    Double nota = scanner.nextDouble ();

    if(nota>=7.00){
        System.out.println("Aprovado");
        
    }else
    System.out.println("Reprovado");
    scanner.close();

}
}
