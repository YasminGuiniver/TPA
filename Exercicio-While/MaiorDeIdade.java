//Exercício 2 

import java.ultil.Scanner; 
public class Idade { 
   public static void main (String [] args) { 
   Scanner in = new Scanner (System.in) ; 

   //VARIAVEIS
   int i=1 , anoAtual , anoN , idade , maior = 0, menor = 0 ; 
    
   //LAÇO DE REPETIÇÃO
   while (i <= 10) { 
   
   //PEDINDO OS VALORES
   System.out.println ("Entre com o ano atual"); 
     anoAtual = ler.nextInt (); 
   System.out.println ("Entre com o ano de nascimento"); 
     anoN= ler.nextInt (); 
     idade = anoAtual - anoN ; 
   System.out.println ("Sua idade é "+idade+" anos"); 

     //TOMADA DE DECISÃO
     if (idade < 18 ) { 
      System.out.println ("Menor de idade"); 
      menor ++ ; 
      } else 
      System.out.println ("Maior de idade"); 
      maior ++ ; 
     } 
   }
  
    //APRESENTAÇÃO
    System.out.print (" Essas é a quantidade de alunos menores de idade "+menor");
    System.out.println (" Essa é a quantidade de alunos que são maiores de idade "+maior"); 

  } 
}