package operadores;

public class Operadores {
    public static void main(String[] args) {
        
      // = operador de atribuição
      String nome = "Guto";
      
      double soma = 10.5 + 15.7;
      int subtracao = 113 - 25;
      int multiplicacao = 20 * 7;
      int divisao = 15 / 3;
      int modulo = 18 % 3;
      double resultado = (10 * 7) + (20 / 4);

      System.out.println(nome);
      System.out.println(soma);
      System.out.println(subtracao);
      System.out.println(multiplicacao);
      System.out.println(divisao);
      System.out.println(modulo);
      System.out.println(resultado);

      int numero = 5;
      System.out.println(numero--); // exibe e depois decrementa 1
      System.out.println(--numero); // decrementa antes de exibir


      System.out.println(resultado == numero ? 1 : 0);
      System.out.println(resultado >= numero ? 1 : 0);

    }
}
