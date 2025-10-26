import java.util.Scanner;
public class BestSwitchCase {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o plano desejado (T, M, B): ");
        String plano = scanner.nextLine();
        plano = plano.toUpperCase();
        //String plano = "T";
        //String plano = "M";
        //String plano = "B";


        switch (plano){
            case "T":{
                System.out.println("5GB Youtube");
                break;}
                case "M":{
                System.out.println("10GB Youtube");
                break;}
            case "B":{
                System.out.println("15GB Youtube"); 
                break;}
            default:
                System.out.println("Plano inválido");
            }
        scanner.close();
        }

    }

