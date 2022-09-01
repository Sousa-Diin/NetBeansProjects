
package edicaodojogozuul.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Wildes Sousa
 */
/**
 * Classe Ambiente - um ambiente em um jogo adventure.
 *
 * Esta classe eh parte da aplicacao "Labirinto de Hogwarts.
 * "Labirinto de Hogwarts" eh um jogo de aventura muito simples e divertido, baseado em texto.  
 *
 * Um "Ambiente" representa uma localizacao no cenario do jogo. Ele eh
 * conectado aos outros ambientes atraves de saidas. As saidas sao
 * nomeadas como norte, sul, leste, oeste e nordeste. Para cada direcao, o ambiente
 * guarda uma referencia para o ambiente vizinho, ou null se nao ha
 * saida naquela direcao.
 * 
 * Inspirado no jogo word of zuul de Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 * 
 * @author modificado por Wildes Sousa 
 * @version  2022 v1.22-1
 */
public abstract class Ambiente 
{
    private String descricao;
    private HashMap<String,Ambiente> saidas;
    private String id;

    /**
     * Cria um ambiente com a "descricao" passada.Inicialmente, ele
     *  nao tem saidas. "descricao" eh algo como "uma cozinha" ou"
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or"um jardim aberto".
     * 
     * @param descricao A descricao do ambiente.
     * @param id
     */
    public Ambiente(String descricao, String id) 
    {
        this.descricao = descricao;
        this.id = id;
        saidas = new HashMap<>();
    }
    /**
     * Método responsavél por retornar as saídas possiveis do ambiente
     * @param direcao
     * @return se há saida retorna a referencia do ambiente apontado, caso não haja retorna <null>
     */
    protected Ambiente getAmbiente(String direcao){
        return saidas.get(direcao);
    }    
    /**
     * Método responsavel por identificar um ambiente expecifico
     * @return String - com ID do ambiente
     */
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

    /**
     * Método sobrescrito da classe Object
     * @return retorna uma descricao do ambiente
     */
    @Override
    public String toString() {
        return "\nVocê está " + getDescricao() + ", id: " + getId() + '\n';
    }
    /**
     * Método responsavel por exibir as saidas do ambiente
     * @return 
     */
    protected String getSaidas(){
        String textoSaida = " ";
        for(String direcao : saidas.keySet()){
            textoSaida += direcao + " ";
        }
        return textoSaida;
    }/**
     * 
     * @return retorna uma lista de ambientes 
     */
    protected ArrayList<Ambiente> getAmbiente(){
        return new ArrayList<>(saidas.values());
    }
}
