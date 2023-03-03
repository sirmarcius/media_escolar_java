/*
* Faça um programa que dê o conteito do aluno conforme sua nota média.
* 
* Entrada: 3 notas
* Saída: média das notas
* 
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Qual o seu nome? ");
        final var name = ler.nextLine();

        float nota1 = pedirNota(ler, 1);
        float nota2 = pedirNota(ler, 2);
        float nota3 = pedirNota(ler, 3);

        ler.close();

        var media = (nota1 + nota2 + nota3) / 3;

        DecimalFormat formato = new DecimalFormat("0.00");
        String mediaFormatada = formato.format(media);

        System.out.print("Aluno " + name + " a sua média é: " + mediaFormatada + "\n");

        if (media < 6) {
            System.out.print("Aluno Reprovado \n");
        } else if (media >= 6 && media <= 6.9) {
            System.out.print("Aluno em Recuperação \n");
        } else {
            System.out.print("Aluno Aprovado \n");
        }
    }

    private static float pedirNota(Scanner ler, int n) {
        float nota;
        do {
            System.out.print("Qual a nota " + n + "? ");
            nota = ler.nextFloat();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Insira uma nota entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
}


