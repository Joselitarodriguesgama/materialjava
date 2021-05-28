package exercicios.Exercicio04;

public class AppRelogio {
    public static void main(String[] args) {
        Relogio reg = new Relogio(4,5,6);

       // reg.hora = -76;

        reg.setMinuto(-12);
       System.out.println(reg.getHora());
       System.out.println(reg.getMinuto());
       
    }
    
}
