/*
* Faça um programa que dê o conteito do aluno conforme sua nota média.
* 
* Entrada: 4 notas
* Saída: média das notas
* 
*/

import java.util.Scanner;

public class MediaEscolar {
    
    private static final int _4 = 4;

    public static void main(final String[] args) {
        final Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        int media;
                
            // recebe a 1º nota
            System.out.println("Digite a 1ª nota");
            nota1 = ent.nextInt();
            
            // recebe a 2º nota
            System.out.println("Digite a 2ª nota");
            nota2 = ent.nextInt();
            
            // recebe a 3º nota
            System.out.println("Digite a 3ª nota");
            nota3 = ent.nextInt();

            // recebe a 4º nota
            System.out.println("Digite a 4ª nota");
            nota4 = ent.nextInt();
            
            // calcula a média
            media = (nota1 + nota2 + nota3 + nota4) / _4;
            System.out.println("A média do aluno é: " + media + "\n");
            
            // mostra a nota do aluno
            if( (media >= 7)){
                System.out.println("Aluno Aprovado!");
            } else if(media == 6){
                System.out.println("Aluno em Recuperação!");
            } else if(media == 6.5){
                System.out.println("Aluno em Recuperação!");
            } else if(media == 5.5){
                System.out.println("Aluno Reprovado!");
            } else if(media <= 5){
                System.out.println("Aluno Reprovado!");
            }
        }       
    }





