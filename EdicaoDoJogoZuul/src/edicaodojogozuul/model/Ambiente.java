
package edicaodojogozuul.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author devsousa
 */
/**
 * Classe Ambiente - um ambiente em um jogo adventure.
 *
 * Esta classe eh parte da aplicacao "World of Zuul".
 * "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.  
 *
 * Um "Ambiente" representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas. As saidas sao
 * nomeadas como norte, sul, leste e oeste. Para cada direcao, o ambiente
 * guarda uma referencia para o ambiente vizinho, ou null se nao ha
 * saida naquela direcao.
 * 
 * @author  Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 */
public abstract class Ambiente 
{
    private String descricao;
    private HashMap<String,Ambiente> saidas;
    private String id;

    /**
     * Cria um ambiente com a "descricao" passada.Inicialmente, ele
 nao tem saidas. "descricao" eh algo como "uma cozinha" ou
 "
 Create a room described "description". Initially, it has
 no exits. "description" is something like "a kitchen" or
 "um jardim aberto".
     * @param descricao A descricao do ambiente.
     * @param id
     */
    public Ambiente(String descricao, String id) 
    {
        this.descricao = descricao;
        this.id = id;
        saidas = new HashMap<>();
    }
    
    protected Ambiente getAmbiente(String direcao){
        return saidas.get(direcao);
    }    

    public String getId() {
        return id;
    }
    

    /**
     * Define as saidas do ambiente. Cada direcao ou leva a um
     * outro ambiente ou eh null (nenhuma saida para la).
     * @param ambiente 
     * @param direcao 
     */
    protected void ajustarSaidas(String direcao, Ambiente ambiente) {
        saidas.put(direcao, ambiente);
    }

    /**
     * @return A descricao do ambiente.
     */
    protected String getDescricao()
    {
        return descricao;
    }

    @Override
    public String toString() {
        return "\nVocê está " + getDescricao() + ", id: " + getId() + '\n';
    }
    
    

    protected String getSaidas(){
        String textoSaida = " ";
        for(String direcao : saidas.keySet()){
            textoSaida += direcao + " ";
        }
        return textoSaida;
    }
    protected ArrayList<Ambiente> getAmbiente(){
        return new ArrayList<>(saidas.values());
    }
}
