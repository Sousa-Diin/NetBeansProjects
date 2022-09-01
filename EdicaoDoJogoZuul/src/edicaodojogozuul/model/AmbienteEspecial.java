
package edicaodojogozuul.model;

/**
 * Esta classe herda de Ambiente
 * denominado ambiente especial e nela que esta a fase final do jogo
 *
 * @author Wildes Sousa
 */
public class AmbienteEspecial extends Ambiente {
    private int vidaValdemor; 

    public AmbienteEspecial(/*int vidaJogador,*/ String descricao, String id) {
        super(descricao, id);
               
    }

    /**
     * 
     * @return vida_valdemor
     */
    public int getVidaValdemor() {
        return vidaValdemor;
    }
    
    

    @Override
    public String toString() {
        return "\t\t##YOU 'RE AT THE DANGEROUS PLACE##\n";
    }
    
    
    

    
}
