package desafios;

public class BuscaSequencial {
    public static void main(String[] args) {
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        System.out.println(buscarNumero(elementos, 10));
        
    }

    static String buscarNumero(int[] elementos, int X) {
        
        for(int i = 0; i < elementos.length; i++) {
            if(X == elementos[i]) {
                return "Achei " + X + " na posicao " + i;
            }
        }

        return "Numero " + X + " nao encontrado!";
    }
}
