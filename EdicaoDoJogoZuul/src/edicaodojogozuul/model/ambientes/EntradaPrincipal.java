
package edicaodojogozuul.model.ambientes;

import edicaodojogozuul.model.Ambiente;

/**
 *
 * @author devsousa
 * @author Wildes Sousa
 */
public class EntradaPrincipal extends Ambiente{
    private boolean varinha;

    public EntradaPrincipal(String descricao, boolean varinha) {
        super(descricao);
        this.varinha = varinha; 
    }
    
    
    
}
