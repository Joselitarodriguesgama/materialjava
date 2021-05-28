package exercicios.Exercicio04;

public class Relogio {
    private int hora, minuto, segundo); {

public Relogio(int hora, int minuto, int segundo) {
    setHora(hora);
    setMinuto = minuto;
    setSegundo = segundo;
}   

   public void setHora(int novaHora) {
       if(novaHora >= 0 && novaHora < 24) {
           hora = novaHora;
       }
       
   } 
public int getHora() {
    return hora;
  }
    
}
    }
    
}
