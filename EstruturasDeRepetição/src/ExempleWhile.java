import java.util.concurrent.ThreadLocalRandom; /*Importa uma biblioteca para gerar números aleatórios*/
public class ExempleWhile {
    public static void main(String[] args) {
        /*While == Enquanto*/
        int mesada = 50;
        while(mesada >0){
            int valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;}
            System.out.println("Doce valor: "+valorDoce+" Adicionar ao carrinho!");
                mesada = mesada - valorDoce;
        }
        System.out.println("mesada : "+ mesada);
        System.out.println("Acabou a mesada!");

    }
    private static int valorAleatorio() {
        return ThreadLocalRandom.current().nextInt(2, 8);
    }
}
