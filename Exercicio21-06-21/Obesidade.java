//EXERCICIO3

import java.ultil.Scanner;
public class IMC { 
   public static void main (Strings [] args); 

   //VARIAVEIS
   int peso,altura , IMC ;

    //PEDINDO PARA QUE OS VALORES SEJAM INFORMADOS
    
    System.out.println ("Entre com o seu peso");
    peso = ler.nextInt (); 

    System.out.println ("Etre com a sua altura"); 
    altura =ler.nextInt (); 

	//CALCULO
      	IMC = peso % (altura • altura );


	//APRESENTANDO O IMC
    	System.out.print ("Seu IMC é "+IMC+"); 

	//TOMADA DE DECISÃO
    		if (IMC <18,5) { 
      			System.out.print ("Excesso de magreza"); 
   		} else if (IMC >=18,5 ou <25) { 
      			System.out.println ("Peso normal"); 
   		} else if (IMC >=25 ou <30){ 
      			System.out.println ("Execesso de peso"); 
   		} else if (IMC >=30 ou <35){ 
      			System.out.println ("Obesidade Grau I"); 
   		} else if (IMC >=35 ou >40){ 
      			System.out.println ("Obesidade Grau II"); 
   		} else if (IMC >40){ 
     			System.out.println ("Obesidade Grau III"); 
    		} 
ler.Close (); 
  }
}