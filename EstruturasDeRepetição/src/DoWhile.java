import java.util.Random; /*Importa uma biblioteca para gerar números aleatórios*/
public class DoWhile {
        public static void main(String[] args) {
            /*Do while = Faça emquanto 
             * A diferença do while para o do while é que
             *  no (do while) ele executa pelo menos uma vez o bloco de código
             *  antes de verificar a condição.
             */

             System.out.println("Telefone tocando...");

             do{//executando repetidas vezes até alguém atender
                System.out.println("Tocando...");
                }while(tocando());
                System.out.println("Alguém atendeu o telefone!");
                System.out.println("Fala ze-zé ");


        }
        private static boolean tocando(){
            boolean atendeu = new Random ().nextInt(3)==1;
            System.out.println("Atendeu? " + atendeu);

            return ! atendeu;

        }
}
