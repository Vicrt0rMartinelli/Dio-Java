package TiposAndVáriaveis;

public class TiposVáriaveis {
    public static void main(String[] args) throws Exception {
     double salárioMinimo =1575.32;
    
     short numeroCurto = 1;
     int numeroNormal = numeroCurto;
     short  numeroCurto2 = (short) numeroNormal;  ///casting

     
    System.out.println(salárioMinimo);
    System.out.println(numeroCurto2);        

        int num = 5;
        num = 1;

        final double VALOR_DE_PI = 3.14;
        ///VALOR_DE_PI = 3.15;
        System.out.println(VALOR_DE_PI);
        System.out.println(num);

    }    
}
