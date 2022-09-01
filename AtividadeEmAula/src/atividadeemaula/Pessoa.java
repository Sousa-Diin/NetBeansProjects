
package atividadeemaula;

/**
 *
 * @author devsousa
 */
public abstract class Pessoa implements Imposto{
    
    private double salario;

    public Pessoa( double salario) {
        
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public abstract double getImpostoPago();        
    
    
}
