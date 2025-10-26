public class SwitchCase {
    public static void main (String []args){

        String tamanho = "P";

        switch (tamanho){
            case "P":{
                System.out.println("Pequeno");
                break;}
        case "M":{
                System.out.println("Médio");
                break;}
            case "G":{
                System.out.println("Grande");
                break;}
            case "GG":{
                System.out.println("Extra Grande");
                break;}
            default:
                System.out.println("Tamanho inválido");
        }
    }
}
