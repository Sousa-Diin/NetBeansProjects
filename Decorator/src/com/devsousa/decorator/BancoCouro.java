
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public class BancoCouro extends Acessorios{

    public BancoCouro(Veiculo v) {
        super(v);
    }

    @Override
    public double preco() {
        return getVeiculo().preco() + 8000;
    }
    
}
