import java.util.Scanner;

public class CondicionaisEncadeadas {

    public static void main(String[]args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual é o tamanho em cm????");
        Double tamanho = scanner.nextDouble();

        if(tamanho >= 18){
            System.out.println("Nossa lobio mal!!!");
        }
        else if(13 <= tamanho && tamanho <18){
            System.out.println("A média não é uma motivo de vergonha");
        }
        else{ 
        System.out.println("Tudo pequenininho aí?");
    }
        scanner.close();
    }
}