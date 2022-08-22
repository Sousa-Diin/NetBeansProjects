
package edicaodojogozuul.model;

import java.util.Random;


/**
 *
 * @author devsousa
 */
public class AmbienteComum extends Ambiente{
    private int inimigos;
    private boolean varinha;

    public AmbienteComum(String descricao, String id,boolean sorteio) {
        super(descricao, id);
        criarInimigos();
        varinha = sorteio;
        
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
        return "\nVocê esta "+ super.getDescricao() + "\nQuatidade de inimigos: " + getInimigos() + "\nContem a varinha: " + getVarinha() + '\n';
    }
    
    
}
