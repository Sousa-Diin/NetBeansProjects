
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public abstract class Acessorios extends Veiculo{
    private Veiculo v;

    public Acessorios(Veiculo v) {
        super(v.getDescricao());
        this.v = v;
        
        
    }

    public Veiculo getVeiculo() {
        return v;
    }
    
}
