public class DormeDepoisDeQuantasRoladas {
    public static void main(String []args){
        int roladas = 0; 
        for (int contagem = 0; contagem <=20; contagem ++){
            System.out.println(("Contagem de roladas:"+ contagem));
            roladas = contagem;
        }
        System.out.println(("Só dormir depois de "+ roladas +" roladas"));
    }
}
