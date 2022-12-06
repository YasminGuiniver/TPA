//Exercício 5 

import java.ultil.Scanner; 
public class Triângulo { 
   public static void main (String [] args) { 

    Scanner ler = new Scanner (System.in); 

	//VARIAVEIS
     
   	 int ladoA , ladoB , ladoC , tipoTri; 

        //PEDINDO PARA INFORMAR OS VALORES
     	System.out.println ("Entre com o valor do primeiro lado"); 
	ladoA = ler.nextInt (); 
   
	System.out.println ("Entre com o valor do segundo lado"); 
	ladoB = ler.nextInt(); 
  	
	System.out.println ("Entre com o valor do terceiro lado") ; 
        ladoC= ler.nextInt(); 

	//TOMADA DE DECISÃO
   	if (ladoA = ladoB =ladoC) ; 
       		System.out.println ("Esse é um triângulo equilátero"); 

      	}else if (ladoA ? ladoB ? ladoC) { 
         	System.out.println ("Esse é um triângulo Escaleno");  
      	}else if (ladoA = ladoB ? ladoC"); { 
         	System.out.println ("Esse é um triângulo Isocelés"); 
} 

ler.Close (); 

	//LENDO AS INFORMAÇÕES / VARIFICANDO SE É OU NÃO TRIÂNGULO
   	System.out.println ("Entre com o valor do primeiro lado"),
     	ladoA= ler.nextInt(); 

   	System.out.println ("Entre com o valor do segundo lado"); 
     	ladoB= ler.nextInt(); 

   	System.out.println ("Entre com o valor do terceiro lado");
     	ladoC= ler.nextInt(); 

	//TOMADA DE DECISÃO
    		if (ladoC < ladoA + ladoB);
      			System.out.println ("Segundo a lei, isso é um triângulo") ; 
    		}else { 
      		System.out.println ("Segundo a lei, isso não é um triângulo") ; 
    		} 
  ler.Close (); 
  } 
} 