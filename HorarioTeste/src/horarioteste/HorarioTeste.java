
package horarioteste;

public class HorarioTeste {

    public static void main(String[] args) {
        
        Horario horas = new Horario(10,15,43);
        horas.exibe();
        
        horas = new Horario(7265);
        horas.exibe();
        
        horas = new Horario(3600);
        horas.exibe();
        
        horas = new Horario(3521);
        horas.exibe();
        
        horas = new Horario(59);
        horas.exibe();
        
        
    }
    
}
