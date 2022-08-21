
package edicaodojogozuul.model;

import java.util.Random;


/**
 *
 * @author devsousa
 */
public class AmbienteComum extends Ambiente{
    private int inimigos;
    private boolean varinha;

    public AmbienteComum(String descricao, String id) {
        super(descricao, id);
        criarInimigos();
        varinha = false;
        
    }
    
    private void criarInimigos(){
        Random gerar = new Random();
        inimigos = gerar.nextInt(4);
    }

    public int getInimigos() {
        return inimigos;
    }

    public boolean getVarinha() {
        return varinha;
    }  

    @Override
    public String toString() {
        return "\nVocê esta "+ super.getDescricao() + "\nInimigos: " + getInimigos() + "\nVarinha: " + getVarinha() + '\n';
    }
    
    
}
