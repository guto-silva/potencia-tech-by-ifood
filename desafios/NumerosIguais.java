package desafios;
import java.util.Scanner;
public class NumerosIguais {
    public static void main(String[] args) {

        int A;
        int B;
        
        Scanner leia = new Scanner(System.in);
        
        A = leia.nextInt();
        B = leia.nextInt();
        
        if(A == B){
          System.out.println("Sao iguais!");
        }
        else {
          System.out.println("Nao sao iguais!");
        }
        
        leia.close();
    }
}
