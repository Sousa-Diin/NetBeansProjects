
package edicaodojogozuul.model.ambientes;

import edicaodojogozuul.model.Ambiente;
import edicaodojogozuul.model.SimularLuta;
import edicaodojogozuul.view.Arena;

/**
 *
 * @author devsousa
 */
public class AmbienteEspecial extends Ambiente implements Arena{
      private int vidaValdemor; // cria um novo jogador
    private SimularLuta arena;

    public AmbienteEspecial(int vidaValdemor, SimularLuta arena, String descricao, String id) {
        super(descricao, id);
        this.vidaValdemor = vidaValdemor;
        this.arena = arena;
    }
    
    @Override
    public String lutar() {
        return arena.rounds(vidaValdemor);
    }

    @Override
    public void sair() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "\nLorde Valdemor está aqui ";
    }

    
}
