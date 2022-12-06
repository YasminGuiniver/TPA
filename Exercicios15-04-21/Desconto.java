//Exercício 3 

import java.util.Scanner ;
public class ValorDesc {
   public static void main (String [] args) { 

   //VARIAVEIS
    int v,desc,valorDesc,valorF; 
    
	//PEDINDO PARA APRESENTAR OS VALORES
   	System.out.println ("Entre com o valor do produto"); 
    	v=ler.nextInt (); 
    	System.out.println ("Entre com o valor do desconto"); 
      	desc= ler.nextInt(); 
      
	//CALCULO DO DESCONTO
       	valorDesc= v - desc; 

	//APRESENTANDO O VALOR DE DESCONTO
	System.out.println ("Esse é o valor de desconto "+valorDesc); 

	//CALCULANDO O VALOR FINAL
       	valorF= v - valorDesc; 
      
	//APRESENTANDO O VALOR FINAL
       	System.out.println ("Esse é o valor final do produto "+valorF);
  }
}