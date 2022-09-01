
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public class Passeio extends Veiculo{

    public Passeio(String descricao) {
        super(descricao);
    }
    
    @Override
    public double preco() {
         return 30000.0;
    }
    
    
}
