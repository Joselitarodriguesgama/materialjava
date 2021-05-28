package exercicios.Exercicio03;

public class Veiculo {
    // atributos
    String modelo, marca;
    double consumo;

    //métodos
    Veículo(String mo, String ma, double co ) {
       this. modelo = modelo;
        this.marca = marca;
        this.consumo = consumo;
    }
    
     void exibir() {
         System.out.printf("Marca: %s Modelo: %s\n" , marca, modelo);
     }

     double obterConsumo() {
         return consumo;
         
     }
