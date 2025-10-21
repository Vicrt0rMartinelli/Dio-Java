package Operadores;

public class Lógicoa {
    public static void main(String[]args){
        boolean condicao1 = true;
        boolean condicao2 = false;

        //AND &&

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 & condicao2);

        //OR ||

        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 | condicao2);

        //XOR ^

        System.out.println(condicao1 ^ condicao2);

        //NEGAÇÃO !

        System.out.println(!condicao1);
        System.out.println(!condicao2);

    }
}
