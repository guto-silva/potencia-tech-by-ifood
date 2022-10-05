public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Ligando a tv...");
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando para o canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Diminuindo para o canal: " + canal);
    }

}
