//Exerc�cio7
import java.ultil.Scanner; 
public class VelhoENovo { 
   public static void main (String [] args) { 

   Scanner ler = new Scanner (System.in)

	//NESSE PROGRAMA O USUARIO INFORMA OS VALORES, � ARMAZENADO A VARIAVEL DA 1� VEZ, AP�S � LIDO OS VALORES DO 2� USUARIO, H� UMA VERIFICA��O EM RELA��O H� IDADE, CONFORME UM � MAIOR E O OUTRO MENOR VAI SENDO ARMAZENADO NAS VARIAVEIS E DEPOIS COM O 3� USUARIO E ASSIM SUCESSIVAMENTE.  

   //VARIAVEIS
   int nome, idade , nomeMaior , nomeMenor , idadeMaior , idadeMenor; 

    //PEDINDO PARA INFORMAR OS VALORES
    System.out.println ("Entre com o nome do primeiro usu�rio"); 
     nome1= ler.nextInt(); 
    System.out.println ("Entre com idade do primeiro usu�rio") ; 
      idade1 = ler.nextInt(); 
  
nomeMaior = nome; 
idadeMaior = idade ; 
nomeMenor = nome ; 
idadeMenorr = idade ; 

     System.out.println ("Entre com o nome do segundo usu�rio"); 
      nome2= ler.nextInt(); 
     System.out.println ("Entre com idade do segundo usu�rio") ; 
      idade2 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do terceiro usu�rio"); 
      nome3= ler.nextInt(); 
    System.out.println ("Entre com idade do terceiro usu�rio") ; 
      idade3 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do quarto usu�rio"); 
     nome4= ler.nextInt(); 
    System.out.println ("Entre com idade do quarto usu�rio") ; 
      idade4 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do quinto usu�rio"); 
     nome5= ler.nextInt(); 
    System.out.println ("Entre com idade do quinto usu�rio") ; 
      idade5 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.print ("O usu�rio "+nomeMaior+" � o mais velho com "+idadeMaior+" anos") ; 
    System.out.print ("O usu�rio "+nomeMenor+" � o mais novo com "+idadeMenor+" anos"); 
   } 
   ler.Close (); 
 } 
}