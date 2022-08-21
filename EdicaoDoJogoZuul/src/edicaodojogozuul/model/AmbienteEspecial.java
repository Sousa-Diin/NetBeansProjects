
package edicaodojogozuul.model;
import edicaodojogozuul.view.Arena;

/**
 *
 * @author devsousa
 */
public class AmbienteEspecial extends Ambiente {
    private int vidaValdemor = 1; // cria um novo jogador
    

    public AmbienteEspecial(int vidaValdemor, String descricao, String id) {
        super(descricao, id);
        this.vidaValdemor += vidaValdemor;
        
    }
    
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "\nLorde Valdemor está aqui ";
    }

    
}
