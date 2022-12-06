//Exercício7
import java.ultil.Scanner; 
public class VelhoENovo { 
   public static void main (String [] args) { 

   Scanner ler = new Scanner (System.in)

	//NESSE PROGRAMA O USUARIO INFORMA OS VALORES, É ARMAZENADO A VARIAVEL DA 1° VEZ, APÓS É LIDO OS VALORES DO 2° USUARIO, HÁ UMA VERIFICAÇÃO EM RELAÇÃO HÁ IDADE, CONFORME UM É MAIOR E O OUTRO MENOR VAI SENDO ARMAZENADO NAS VARIAVEIS E DEPOIS COM O 3° USUARIO E ASSIM SUCESSIVAMENTE.  

   //VARIAVEIS
   int nome, idade , nomeMaior , nomeMenor , idadeMaior , idadeMenor; 

    //PEDINDO PARA INFORMAR OS VALORES
    System.out.println ("Entre com o nome do primeiro usuário"); 
     nome1= ler.nextInt(); 
    System.out.println ("Entre com idade do primeiro usuário") ; 
      idade1 = ler.nextInt(); 
  
nomeMaior = nome; 
idadeMaior = idade ; 
nomeMenor = nome ; 
idadeMenorr = idade ; 

     System.out.println ("Entre com o nome do segundo usuário"); 
      nome2= ler.nextInt(); 
     System.out.println ("Entre com idade do segundo usuário") ; 
      idade2 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do terceiro usuário"); 
      nome3= ler.nextInt(); 
    System.out.println ("Entre com idade do terceiro usuário") ; 
      idade3 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do quarto usuário"); 
     nome4= ler.nextInt(); 
    System.out.println ("Entre com idade do quarto usuário") ; 
      idade4 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.println ("Entre com o nome do quinto usuário"); 
     nome5= ler.nextInt(); 
    System.out.println ("Entre com idade do quinto usuário") ; 
      idade5 = ler.nextInt(); 
      if (idade < idadeMenor); 
      } else (idade > idadeMaior); 

nomeMaior = nome ; 
idadeMaior = idade; 
nomeMenor = nome; 
idadeMenor = idade; 

    System.out.print ("O usuário "+nomeMaior+" é o mais velho com "+idadeMaior+" anos") ; 
    System.out.print ("O usuário "+nomeMenor+" é o mais novo com "+idadeMenor+" anos"); 
   } 
   ler.Close (); 
 } 
}