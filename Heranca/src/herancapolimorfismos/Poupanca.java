
package herancapolimorfismos;

/**
 *
 * @author devsousa
 */
public class Poupanca extends Aplicacao {

    private double selic;
    private double tr;

    public Poupanca(double valor_aplicado, double selic, double tr) {
        super(valor_aplicado);
        this.selic = selic;
        this.tr = tr;
    }

    @Override
    protected double calcularRetorno(int tempo) {
        double montante = getValor_aplicado();
        return montante *= (Math.pow((1 + ((0.7 * selic) + tr)/100 ), tempo));
    }
    
    
    
}
