
package edicaodojogozuul.model.ambientes;

import edicaodojogozuul.model.Ambiente;

/**
 *
 * @author devsousa
 * @author Wildes Sousa
 */
public class EntradaPrincipal extends Ambiente{
    private boolean varinha;

    public EntradaPrincipal(boolean varinha, String descricao, String id) {
        super(descricao, id);
          this.varinha = varinha;
    }

    
    public String descricao(){
        return super.getDescricao() + String.format("Varinha das varinhas\nDisponivél: %b", varinha);
    }
    
    
}
