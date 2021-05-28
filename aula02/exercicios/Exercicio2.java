package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1,  nota2, media;

        System.out.println("Nota1");
        nota1 = entrada.nextDouble();

        System.out.println("Nota2");
        nota2 =entrada.nextDouble();

        media = nota1 * 0.4 + nota2 * 0.6;

        if(media >= 6) {
            System.out.println("Aprovado com ");

    }
    
}
