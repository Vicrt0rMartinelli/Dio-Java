public class ForEmArrays{
    public static void main(String[]args){
        String nome[]={"Maria", "João", "Pedro", "Ana", "Lucas"};
        
        /*Em arrays, o indice começa com 0(zero) */
        /*Coolcar  length depois do Arrays você descobre o tamanho dele.*/

        for(int x = 1; x<=nome.length; x++){
            System.out.println("O nome na posição " + x + " é: " + nome[x-1]);
        }
    }
}