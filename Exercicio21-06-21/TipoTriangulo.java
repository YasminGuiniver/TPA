//Exerc�cio 5 

import java.ultil.Scanner; 
public class Tri�ngulo { 
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

	//TOMADA DE DECIS�O
   	if (ladoA = ladoB =ladoC) ; 
       		System.out.println ("Esse � um tri�ngulo equil�tero"); 

      	}else if (ladoA ? ladoB ? ladoC) { 
         	System.out.println ("Esse � um tri�ngulo Escaleno");  
      	}else if (ladoA = ladoB ? ladoC"); { 
         	System.out.println ("Esse � um tri�ngulo Isocel�s"); 
} 

ler.Close (); 

	//LENDO AS INFORMA��ES / VARIFICANDO SE � OU N�O TRI�NGULO
   	System.out.println ("Entre com o valor do primeiro lado"),
     	ladoA= ler.nextInt(); 

   	System.out.println ("Entre com o valor do segundo lado"); 
     	ladoB= ler.nextInt(); 

   	System.out.println ("Entre com o valor do terceiro lado");
     	ladoC= ler.nextInt(); 

	//TOMADA DE DECIS�O
    		if (ladoC < ladoA + ladoB);
      			System.out.println ("Segundo a lei, isso � um tri�ngulo") ; 
    		}else { 
      		System.out.println ("Segundo a lei, isso n�o � um tri�ngulo") ; 
    		} 
  ler.Close (); 
  } 
} 