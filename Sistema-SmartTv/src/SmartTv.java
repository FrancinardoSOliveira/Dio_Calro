/**
 * Aprendendo java 
 * Bootcamp DIO/Claro
 * Sistema de SmartTV
 * comandos basicos
 */

public class SmartTv {
     
    boolean ligada = false;/*Identifica estado da tv no moento */
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
        System.out.println("Tv Ligada");
        System.out.println("Seja Bem vindo!!");
        System.out.println("Canal atual : " + canal);
        System.out.println("Volume atual : " + volume);
    }
    public void desligar(){
        ligada = false;
        System.out.println("Tv Desligada");
        System.out.println("Até a proxima!!");
    }
    public void  aumentarVolume(){
        volume ++;
        System.out.println("Volume "+ volume);
    }
    public void  diminuirVolume(){
        volume --;
        System.out.println("Volume "+ volume);
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Canal "+ canal);
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Canal "+ canal);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal "+ canal);
    }

}
