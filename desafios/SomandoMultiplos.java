package desafios;
import java.util.Scanner;
public class SomandoMultiplos {
    public static void main(String[] args) {
        int A, N, SOMA = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        
        for(int i = N; i >= A; i--) {
          if(i % A == 0) {
            SOMA += i;
          }
        }
        
        System.out.println(SOMA);
    }
}
