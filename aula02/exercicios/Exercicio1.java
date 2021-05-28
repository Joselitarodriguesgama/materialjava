package exercicios;

import java.util.Scanner;

public class Exercicio 2 -1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        double metade;
        System.out.println("Digite o número");
        numero = entrada.nextInt();
        if (numero > 20) {
            metade = (double)numero / 2;
            System.out.printf("Metade = %f\n", metade);

            entrada.close();


    }
}
