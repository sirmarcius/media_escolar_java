/*
* Faça um programa que dê o conteito do aluno conforme sua nota média.
* 
* Entrada: 4 notas
* Saída: média das notas e o conceito
* 
*/

import java.util.Scanner;

public class MediaEscolar {
    
    private static final int _4 = 4;

    public static void main(final String[] args) {
        final Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3, nota4;
        int media, i, contAluno = 0;
        
        for(i = 0; i < 3; i++){
            
            contAluno++;
            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            
            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();

            // recebe a 4º nota
            System.out.println("Aluno " + contAluno + ", digite sua 4ª nota");
            nota4 = ent.nextInt();
            
            // calcula a média
            media = (nota1 + nota2 + nota3 + nota4) / _4;
            System.out.println("A média do aluno " + contAluno + " é " + media);
            
            // mostra a nota do aluno
            if( (media >= 0) && (media <4) ){
                System.out.println("Nota E");
            } else if(media < 5){
                System.out.println("Nota D");
            } else if(media < 7){
                System.out.println("Nota C");
            } else if(media < 8){
                System.out.println("Nota B");
            } else if(media <= 10){
                System.out.println("Nota A");
            }
        }       
    }
}
