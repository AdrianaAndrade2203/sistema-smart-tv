public class SmartTv {

    // Atributos 

    boolean ligada = false;
    int canal = 1; 
    int volume = 25;  

    // acima estão definidos um estado inicial de quando a TV for ligada.

    //Criando os metodos:

    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o Canal da TV para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
         System.out.println("Diminuindo o Canal da TV para: " + canal);
    }
     
    //Neste caso se o usuario vai escolher um canal, preciso receber um parametro. 
    //Qual canal?

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
         System.out.println("Mudando o Canal da TV para: " + novoCanal);

    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando o Volume da TV para: " + volume);
        // ou volume = volume +1;
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo o Volume da TV para: " + volume);
        // ou volume = volume -1;
    }

    public void ligar (){
        // Este metodo não retorna nada. Por esse motivo inicia com void 
        //e não possui a palavra return.
        ligada=true;   
    }

       public void desligar (){
        ligada=false;   
    }

}