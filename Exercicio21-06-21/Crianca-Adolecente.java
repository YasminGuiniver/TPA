//Exerc�cio 1 

import java.ultil.Scanner ;
public class Idade { 
    public static void main (String [] args );
    Scanner ler = new Scanner (System.in) ;
     

    //VARIAVEIS
    int anoN, anoA, id;


    //PEDINDO PARA INFORMAR OS VALORES
     System.out.println ("Digite o seu ano de nascimento"); 
       anoN=ler.nextInt ();
     System.out.println ("Digite o ano atual"); 
       anoA= ler.nextInt();

       //CALCULO 
       id = anoA - anoN ; 
   
     //APRESENTANDO A IDADE
     System.out.println ("Sua idade � "+id);

   
     //TOMADA DE DECIS�O
     if (id<=10) { 
        System.out.println ("Voc� � uma crian�a ") ;
      } else if (id<=10 ou <18) { 
         System.out.println ("Voc� � um (a) adolescente") ;
      }else if ( id >=18 ou <60) { 
           System.out.println ("Voc� � um (a) adulto") ; 
      } else { 
           System.out.println ("Voc� � um (a) idoso (a)"); 
            } 
    ler.Close (); 
  }
}