
package herancapolimorfismos;

/**
 *
 * @author devsousa
 */
public class CDB extends Aplicacao {
    
    private double cdi;

    public CDB(double valor_aplicado, double cdi) {
        super(valor_aplicado);
        this.cdi = cdi;
    } 

    @Override
    protected double calcularRetorno(int tempo) {
        double montante = getValor_aplicado();
        return montante *= Math.pow((1 + (1.2 * cdi )/100), tempo);
    }
    
}
