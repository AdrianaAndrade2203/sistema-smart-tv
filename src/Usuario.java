public class Usuario {

    public static void main(String[] args) {
        
       //Criação de uma classe
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Qual canal atual: " + smartTv.canal);
        System.out.println("Qual volume atual: ? " + smartTv.volume);

        //Chamando o metodo ligar:

        smartTv.ligar ();
        System.out.println("Novo status: TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status: TV Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual volume atual: ? " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(20);
        smartTv.aumentarCanal();

        
    }
    
}
