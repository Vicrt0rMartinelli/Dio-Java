package Operadores;

public class OperadoresEu {
    public static void main(String[]args){
    String nomeCompleto ="José" + " Victor";
    System.out.println(nomeCompleto);

    String concatenacao ="?";
    concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
    concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
    concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);
    concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
    concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

    }
}
