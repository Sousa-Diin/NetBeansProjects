
package edicaodojogozuul.model;

/**
 * A classe ambiente neutro herda de ambiente 
 * nela não há inimigos e nem item serve apenas de trasicão 
 * pra tornar o jogo mias amigavel e justo
 *
 * @author Wildes Sousa
 */
public class AmbienteNeutro extends Ambiente{

    public AmbienteNeutro(String descricao, String id) {
        super(descricao, id);
    }
    
}
