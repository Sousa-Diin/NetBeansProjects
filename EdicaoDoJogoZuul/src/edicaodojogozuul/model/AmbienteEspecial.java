
package edicaodojogozuul.model;

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
    /**
     * 
     * @param jogador
     * @return True se o jagador tiver a Varinha das varinhas
     */
    public boolean habilitarEnrtada(Jogador jogador){
        if(jogador.temItem("varinha")){
            return true;
        }
        return true;
    }
    
    @Override
    public String getDescricao(){
        return super.getDescricao() + "\nLorde Valdemor está aqui ";
    }

    
}
