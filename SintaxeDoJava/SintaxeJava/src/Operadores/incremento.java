package Operadores;

public class incremento {
    public static void main(String[]args){
        int numero = 5;
        System.out.println(numero);
        numero = numero +2;
        System.out.println(++numero);
        System.out.println(numero++);
        System.out.println(numero);

        numero ++; // incremento de 1
        System.out.println(numero);
        

        //Boleanos
        boolean variavel = false;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

    }
}
