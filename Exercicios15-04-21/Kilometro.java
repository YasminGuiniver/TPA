  //Exercício 1 

import java.util.Scanner ; 

public class ConverteMeteos { 
    public static void main (String [] args) { 

    Scanner in= newScanner (System.in); 

    //VARIAVEIS

     int m, km; 

    //PEDINDO PARA INFORMAR O VALOR 
     System.out.println ("Entre com o valor em metros"); 
      m = in.nextInt (); 

    //CALCULO
      km= m * 1000; 
    
    //APRESENTAÇÃO
     System.out.println ("O resultado é "+km+""); 
    } 
} 