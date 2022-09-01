
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public class DirecaoHidraulica extends Acessorios{

    public DirecaoHidraulica(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return 1500 + getVeiculo().preco();
    }
    
}
