//Exerc�cio 2 

import java.util.Scanner; 
public class Ve�culo{ 
   public static void main (String [] args); 

   Scanner ler = new Scanner (System.in) ; 

   //VARIAVEIS
   int disKm,  capLitros , gm;  

   //PEDINDO PARA QUE OS VALORES SEJAM INFORMADOS
   System.out.println ("Entre com a dist�ncia percorrida em kilometros") 
   disKm= ler.nextInt (); 
    
   System.out.println ("Entre com a capacidade do tanque em combust�vel") 
   capLitros= ler nextInt(); 
     
     //CALCULO
     gm= discKm / capLitros 
    
    //APRESENTANDO O VALOR
    System.out.print("Esse � o valor do gasto m�dio do seu ve�culo "+gm+"") ; 
    
	//TOMADA DE DECIS�O
  	 if (gm>=10) { 
       		System.out.println ("O ve�culo � econ�mico") 
   	} else if (gm<10){ 
      		 System.out.println ("O ve�culo n�o � econ�mico") 

    } 
ler.Close (); 
  }
}