//Exerc�cio 2 

import java.ultil.Scanner; 
public class Idade { 
   public static void main (String [] args) { 
   Scanner in = new Scanner (System.in) ; 

   //VARIAVEIS
   int i=1 , anoAtual , anoN , idade , maior = 0, menor = 0 ; 
    
   //LA�O DE REPETI��O
   while (i <= 10) { 
   
   //PEDINDO OS VALORES
   System.out.println ("Entre com o ano atual"); 
     anoAtual = ler.nextInt (); 
   System.out.println ("Entre com o ano de nascimento"); 
     anoN= ler.nextInt (); 
     idade = anoAtual - anoN ; 
   System.out.println ("Sua idade � "+idade+" anos"); 

     //TOMADA DE DECIS�O
     if (idade < 18 ) { 
      System.out.println ("Menor de idade"); 
      menor ++ ; 
      } else 
      System.out.println ("Maior de idade"); 
      maior ++ ; 
     } 
   }
  
    //APRESENTA��O
    System.out.print (" Essas � a quantidade de alunos menores de idade "+menor");
    System.out.println (" Essa � a quantidade de alunos que s�o maiores de idade "+maior"); 

  } 
}