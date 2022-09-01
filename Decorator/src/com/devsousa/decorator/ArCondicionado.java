
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public class ArCondicionado extends Acessorios{

    public ArCondicionado(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return 2500 + getVeiculo().preco();
    }
    
}
