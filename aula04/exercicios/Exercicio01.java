package exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        boolean resultado ;
    
resultado = ehPar(12);

if(resultado == true) {
    System.out.println("O número é par");
} else {
    System.out.println("O número é ímpar");
}

    }

static boolean ehPar(int numero) {
    boolean res;
    if(numero % 2 == 0) {
        res = true;
    } else {
        res = false;
    }
    return res;
}

    }
    
}
