
package agencia;

/**
 *
 * @author <h2>Wildes Sousa</h2>
 * @version <b>v1.22-2</b>
 */
public class Cliente {
    /**
     * @value  int - armazena o tempo que cada cliente chegou na fila
     * @value int - armazena a duracao do tempo de atendimento
     */
    private int tempo_chegada;
    private int duracao_atendimento;

    /**
     * 
     * @param - tempo_chegada - <h3>valor inicializado pelo Simulador.</h3>
     * @param duracao_atendimento - <h3>valor inicializado pelo Simulador.</h3>
     */
    public Cliente(int tempo_chegada, int duracao_atendimento) {
        this.tempo_chegada = tempo_chegada;
        this.duracao_atendimento = duracao_atendimento;
    }

    /**
     * 
     * @return - <b>int</b> - <h3>retorna o tempo aleatorio de chegada do cliente gerado na Class Simulador</h3>.
     */
    public int getTempo_chegada() {
        return tempo_chegada;
    }

    /**
     * 
     * @return - <b>int</b> - <h3>retorna uma duração de atendimento do cliente gerado na Class Simulador</h3>.
     */
    public int getDuracao_atendimento() {
        return duracao_atendimento;
    }
    
    
}
