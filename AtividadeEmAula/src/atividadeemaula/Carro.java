
package atividadeemaula;

/**
 *
 * @author Wildes Sousa
 */
public  class Carro implements Imposto{
    private double valor;

    public Carro(double valor) {
        this.valor = valor;
       
    }

    @Override
    public double getImpostoPago() {
        return valor * 1.03;
    }

    @Override
    public String toString() {
        return "Carro: " + "\nValor do imposto: " + getImpostoPago() + '\n';
    }
    
    
}
