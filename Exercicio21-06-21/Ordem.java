//Exerc�cio 6 
import java.ultil.Scanner; 
public class Ordem { 
  public static void main (String [] args){ 

      Scanner ler = new Scanner (System.in); 

	//VARIAVEIS
        int a, b , c ; 

	//PEDINDO PARA INFORMAR OS VALORES
       	System.out.println ("Entre com o valor a") ;
         a = ler.nextInt();
      	System.out.println ("Entre com o valor b") ;
         b = ler.nextInt(); 
        System.out.println ("Entre com o valor c"); 
         c = ler.nextInt(); 
    
	//TOMADA DE DECIS�O
         if (a < b) e (b < c) {
           System.out.print ("A ordem � a, b, c); 
        } else if (a < c ) e ( c < b ) {
             System.out.print ("A ordem � a , c , b "); 
        } else if ( b < a ) e ( a < c ) { 
               System.out.println (" A ordem � b , a , c") ; 
        } else if ( b < c ) e ( c < a ) { 
               System.out.println (" A ordem � b , c , a ") ; 
        } else if ( c < a ) e ( a < b ) { 
               System.out.println (" A ordem � c , a , b") ; 
        } else if ( c < b ) e ( b < a ) { 
               System.out.println (" A ordem � c, b , ") ; 
    } 
ler.Close (); 
  } 
}