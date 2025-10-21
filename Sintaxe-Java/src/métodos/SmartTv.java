package métodos;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void supirCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }   



    public void aumentar(){
        volume++;
        System.out.println("Aumentando o Volume para: " + volume);
    }
    public void diminuir(){
        volume --;
        System.out.println("Diminuindo o Volume para: " + volume);
    }

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}
