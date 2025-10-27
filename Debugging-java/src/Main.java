public class Main {
        public static void main(String[] args) {
        System.out.println("Iniciou o metodo main");
        a();
        System.out.println("Finalizou o metodo main");
    }
    static void a(){
        System.out.println("entrou  no metodo a");
        b();
        System.out.println("Finalizou o metodo a");
    }
    static void b(){
        System.out.println("ENtrou no metodo b");
        for (int i = 10; i>=0;i-- )System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
    }
    static void c(){
        System.out.println("Entrou no metodo C");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo C");
    }
}
