import java.util.*;
class Main {
  public static void main(String[] args) {
 Scanner leitor = new Scanner(System.in);
 //variavel
 int primeiroNumero=0;
 int segundoNumero=0;
 int multiplicaçao=0;
 //entrada
 System.out.println ("digite um número inteiro");
 primeiroNumero= leitor.nextInt();

 System.out.println ("Digite outro número inteiro");
 segundoNumero= leitor.nextInt();
 //processamento
 multiplicaçao= primeiroNumero*segundoNumero;
 
//saida
System.out.println ("Resultado "+multiplicaçao);

  }
}