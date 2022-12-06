//Exercício 8 

import java.ultil.Scanner; 
public class MédiaFinal { 
  public static void main (String [] args) { 
     Scanner ler. new Scanner (System.in) ; 

     //VARIAVEIS
     int: nota1, nota2, nota3 notaM, notaF; 

     //PEDINDO PARA INFORMAR OS VALORES
     System.out.println ("Entre com a primeira nota") ;
       nota1=ler.nextInt (); 
     System.out.println ("Entre com a segunda nota") ;
       nota2=ler.nextInt (); 
     System.out.println ("Entre com a terceira nota") ;
       nota3= ler.nextInt (); 
   

      //CALCULO
      notaM = nota1 + nota2 / 2 ;

      //TOMADA DE DECISÃO
      if (notaM < 3) 
        System.out.print ("Reprovado") ;
     { else if (notaM >= 6) { 
        System.out.print (" Aprovado ") ;
     { else if (notaM >= 3 e <6) { 
        System.out.print ("Exame") ;
     } 

     //CASO O ALUNO FICASSE DE EXAME HAVERIA OUTRA VERIFICAÇÃO

	//PEDINDO PARA APRESENTAR O VALOR
       System.out.println ("Entre com a nota do exame "); 
         nota3 = ler.nextInt(); 

	//CALCULO
         mediaF = nota3 + notaM / 2 ; 
    	
	//TOMADA DE DECISÃO
        if (mediaF>6); 
            System.out.print ("Aprovado"); 
        } else 
            System.out.print ("Reprovado") 
     } 
   ler.Close (); 
  } 
}