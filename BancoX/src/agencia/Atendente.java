
package agencia;

/**
 *
 * @author <h2>Wildes Sousa</h2>
 * @version <b>v1.22-2</b>
 * 
 */
public class Atendente {
    /**
     * @@value int - variavel que será incrementada ao longo da simulação
     */
    private  int proximo_atendimento;
    
    /**
     * 
     * @param duracao_atendimento 
     * @return void - <p> Atualiza variavél resposavel pelo proximo atendimento</p>
     */
    public void atenderCliente(int duracao_atendimento){
        proximo_atendimento += duracao_atendimento;
        
    }
    
    /** 
     * 
     * @param tempo_atual_simulacao
     * @return boolean - <p> Verifica se é possivel atender o poximo cliente retornando verdadeiro - True  </p>
     */
    public boolean estaDisponivel(int tempo_atual_simulacao){
        return proximo_atendimento <= tempo_atual_simulacao;
    }
}
