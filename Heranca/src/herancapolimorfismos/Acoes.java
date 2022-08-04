
package herancapolimorfismos;

/**
 *
 * @author devsousa
 */
public class Acoes extends Aplicacao {
    private double abertura;
    private double fechamento;

    public Acoes( double valor_aplicado, double abertura, double fechamento) {
        super(valor_aplicado);
        this.abertura = abertura;
        this.fechamento = fechamento;
    }

   

    @Override
    protected double calcularRetorno(int tempo) {
        double tot_cota = getValor_aplicado();
        return  Math.pow((fechamento / abertura),tempo) * tot_cota ;
    }
    
}
