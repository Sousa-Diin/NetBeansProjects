
package edicaodojogozuul.model;

/**
 *
 * @author devsousa
 */
public class AmbienteEspecial extends Ambiente {
    private int vidaValdemor; 

    public AmbienteEspecial(/*int vidaJogador,*/ String descricao, String id) {
        super(descricao, id);
               
    }

    public int getVidaValdemor() {
        return vidaValdemor;
    }
    
    

    @Override
    public String toString() {
        return "\t\t##YOU 'RE AT THE DANGEROUS PLACE##\n";
    }
    
    
    

    
}
