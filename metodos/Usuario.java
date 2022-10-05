public class Usuario {
    public static void main(String args[]) {
       
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        smartTv.ligar();
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(8);
        System.out.println(smartTv.canal);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        

    }
}