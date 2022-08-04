
package herancapolimorfismos;

/**
 *
 * @author devsousa
 */
public abstract class Aplicacao {
    private double valor_aplicado;

    public Aplicacao(double valor_aplicado) {
        this.valor_aplicado = valor_aplicado;
    }

    protected double getValor_aplicado() {
        return valor_aplicado;
    }

    protected abstract double calcularRetorno(int tempo);
     
}
