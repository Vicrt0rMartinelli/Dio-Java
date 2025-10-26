public class BreackContinue {
    public static void main(String[]args){
        for (int x=1;x <=10;x++){
            if(x==5){
               // break; /*Ele interrombe todo o fluxo */
               continue; /*Ele interrompe apenas a iteração corrente */
            }
            System.out.println(x);
        }
    }
}
