//Exerc�cio 2 

import java.ultil.Scanner ;
public class PrecoIPVA { 
     public static void main (String [] args) { 
     Scanner in = newScanner (System.in); 

     //VARIAVEIS
     int v, IPVA;

     //PEDINDOS PARA INFORMAR O VALORES
      System.out.println ("Entre com o valor do ve�culo"); 
       v= in.nextInt (); 

     //CALCULO
       IPVA = v * 4/100; 
      
     //APRESENTA��O
      System.out.println ("O valor do IPVA � "+IPVA); 
  }
} 