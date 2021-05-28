package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Infome o valor do salário");
        salario = entrada.nextDouble();
        System.out.println("Informe o valor da prestação");
        prestacao = entrada.nextDouble();

        limite = salario * 0.3;
        if(prestacao<= limite) {
            System.out.println("Emprestimo pode ser concedido");
        } else {
            System.out.println("Não pode ser feito o emprestimo");
            System.out.println("O limite é de " + limite);

            entrada.close();
        
        }
    }
    
}
