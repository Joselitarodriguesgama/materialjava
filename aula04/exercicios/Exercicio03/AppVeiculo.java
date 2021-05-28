package exercicios.Exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v = new Veiculo("Gol" , "VW" , 12.5);

        v.exibir();
        System.out.println("Consumo: " + v.obterConsumo());
    }
    
}
