package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novosalario;
        System.out.println("Salario atual");
        salario = entrada.nextDouble();

        novosalario = (salario + salario * 0.25);
        System.out.println("O novo salario é " + novosalario);

        entrada.close();

    }

}
