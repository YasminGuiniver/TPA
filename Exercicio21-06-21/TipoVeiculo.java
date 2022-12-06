//Exercício 2 

import java.util.Scanner; 
public class Veículo{ 
   public static void main (String [] args); 

   Scanner ler = new Scanner (System.in) ; 

   //VARIAVEIS
   int disKm,  capLitros , gm;  

   //PEDINDO PARA QUE OS VALORES SEJAM INFORMADOS
   System.out.println ("Entre com a distância percorrida em kilometros") 
   disKm= ler.nextInt (); 
    
   System.out.println ("Entre com a capacidade do tanque em combustível") 
   capLitros= ler nextInt(); 
     
     //CALCULO
     gm= discKm / capLitros 
    
    //APRESENTANDO O VALOR
    System.out.print("Esse é o valor do gasto médio do seu veículo "+gm+"") ; 
    
	//TOMADA DE DECISÃO
  	 if (gm>=10) { 
       		System.out.println ("O veículo é econômico") 
   	} else if (gm<10){ 
      		 System.out.println ("O veículo não é econômico") 

    } 
ler.Close (); 
  }
}