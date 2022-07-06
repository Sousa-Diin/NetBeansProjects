
package horarioteste;

public class Horario {
    
    public int horas;
    public int minutos;
    public int segundos;
    
    public Horario(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Horario(int segundos){
        horas = segundos / 3600;
        minutos = (segundos % 3600)/60;
        this.segundos = (segundos % 3600) %60;
        
    }
    
    public void exibe(){
        System.out.printf("São: %dh: %dm: %ds \n\n", this.horas, this.minutos, this.segundos);
    }
  
    
}
