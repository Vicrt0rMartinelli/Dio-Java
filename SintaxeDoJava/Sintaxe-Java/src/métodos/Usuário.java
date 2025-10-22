package métodos;
public class Usuário {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Qual canal ? " + smartTv.canal);
        System.out.println("Qual Volume? " + smartTv.volume);
        
        ///Ligar-Desligar
        smartTv.ligar();
        System.out.println("Novo status da Tv ligada ? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status da Tv ligada ? " + smartTv.ligada);


        ///Volume
        smartTv.aumentar();
        System.out.println("Novo volume ? " + smartTv.volume);
        smartTv.diminuir();
        System.out.println("Novo volume ? " + smartTv.volume);


        ///Canal
        System.out.println("Canal atual" + smartTv.canal);
        smartTv.mudarCanal(21);
        System.out.println("Canal Atual " + smartTv.canal);
    }
}