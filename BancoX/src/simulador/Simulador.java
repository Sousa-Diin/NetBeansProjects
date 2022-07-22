
package simulador;

import agencia.Atendente;
import agencia.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Classe responsavél por simular um atendimento bancario, que consiste em criar uma fila de clients 
 * e uma lista de atendentes sendo a quantidade de atendentes conrrespondente à qtd. passada na  
 * na criação do Objeto <i>Simulador.</i>
 * @author <h2>Wildes Sousa</h2>
 * @version <b>v1.22-2</b>
 */
public class Simulador {
    
    private int qtd_atendente;
    private int duracao_simulacao;
    private Queue<Cliente> filaClientes;
    private ArrayList<Atendente>listaAtendentes;

    /**
     * 
     * @param qtd_atendente - <p> Quantidade de atendentes definida na criação do Objeto <b>Simulador</b> </p>
     * @param duracao_simulacao - <p> Duração da simulação definida na criação do Objeto <b>Simulador</b> </p>
     * <h3> chamada do método responsável por criar toda a fila de clientes da simulação</h3></br>
     * <h3> chamada do método responsável por criar a lista de atendentes.</h3>
     */
    public Simulador(int qtd_atendente, int duracao_simulacao) {
        this.qtd_atendente = qtd_atendente;
        this.duracao_simulacao = duracao_simulacao;
        filaClientes = new LinkedList<>();
        listaAtendentes = new ArrayList<>();
        criarFilaCliente();
        criarListaAtendente();
    }
    
    /**
     * @return - <b> Fila de Clientes </b> <i> Criterio de parada </i> Ao entrar no loop da criação da 
     * FilaCliente é avaliado se: <i>(tempo_chegado + duracao_atendimento) é menor ou igual a duração da Simulacao</i>
     * 
     */
    private void criarFilaCliente(){
        Random num_gerado = new Random();
        int tempo_chegada = 0;
        int duracao_atendimento = 0;
        
        while((tempo_chegada + duracao_atendimento) <= this.duracao_simulacao){
            tempo_chegada += num_gerado.nextInt(4);
            duracao_atendimento = num_gerado.nextInt(7) + 1;
            
            filaClientes.offer(new Cliente(tempo_chegada, duracao_atendimento)); 
        }
        
    }
    
    /**
     * @return - <b> Lista de Atendentes</b> 
     */
    private void criarListaAtendente(){
        for(int atd = 0; atd < qtd_atendente;atd++){
            listaAtendentes.add(new Atendente());
        }
    }
    
    /**
     * @return - <b> Quantidade de Clientes atendidos duramnte a Simulação</b>
     * 
     */
    public void simular(){
        
        for(int tempo_atual = 0; tempo_atual < duracao_simulacao;tempo_atual++){
            for(int atd = 0; atd < listaAtendentes.size();atd++){
                if(listaAtendentes.get(atd).estaDisponivel(tempo_atual)){
                    if(!filaClientes.isEmpty()){
                        if(filaClientes.peek().getTempo_chegada() <= tempo_atual){
                            listaAtendentes.get(atd).atenderCliente(filaClientes.poll().getDuracao_atendimento());
                            System.out.println("\nCaixa: " + atd);
                        }                     
                    }
                }
            }
            System.out.printf("Tempo atual: %d minutos;\nTamanho atual da fila: %d clientes\n\n",tempo_atual,filaClientes.size());
        }      
    }
}
