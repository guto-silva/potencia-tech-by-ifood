package desafios;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        Integer num = number.nextInt();
        
        number.close();

        System.out.println(fizzBuzz(num));

    }
    
    static String fizzBuzz(int num) {
      
      String mensagem = "";
      
      if(num % 3 == 0 && num % 5 == 0) {
        mensagem = "FizzBuzz";
      }
      else if(num % 3 == 0) {
        mensagem = "Fizz";
      }
      else if(num % 5 == 0) {
        mensagem = "Buzz";
      }
      else {
        mensagem = Integer.toString(num);
      }
     
      return mensagem;
    }
    
}
