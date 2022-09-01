
package edicaodojogozuul.model;

import java.util.Random;


/**
 * Este classe herda da classe ambiente(progenitora)
 * a mesma é responsavel por gerar inimigos e conter um item especial
 * @author Wildes Sousa
 */
public class AmbienteComum extends Ambiente {
    private static int totInimigos;
    private int inimigos;
    private boolean varinha;
    //private Item varinha;
    

    /**
     * Construtor da classe
     * 
     * Responsavel por criar os inimigos de forma aleatoria podendo conter de 0 a 3 em cada 
     * e ou conter a varinha da varinhas
     * @param descricao
     * @param id
     * @param sorteio 
     */
    public AmbienteComum(String descricao, String id,boolean sorteio) {
        super(descricao, id);
        criarInimigos();
        varinha = sorteio;
        totInimigos += getInimigos();
        //varinha = new Item();
        
    }
    /**
     * Método que cria os inimigos
     */
    private void criarInimigos(){
        Random sorteia = new Random();
        inimigos = sorteia.nextInt(4);
    }

    public static int getTotInimigos() {
        return totInimigos;
    }

    /**
     * 
     * @return int - retorna a quantidade de inimigos 
     */
    public  int getInimigos() {
        return inimigos;
    }

    /**
     * Método responsavel por atualizar os inimigos de cada ambiente
     * decrementa em um
     * @param inimigos 
     */
    private void setInimigos(int inimigos) {
        this.inimigos -= inimigos;
    }
    

    /**
     * 
     * @return boolean - retorna verdadeiro caso a varinha esteja no local
     */
    public boolean getVarinha() {
        return varinha;
    }  
    /**
     * Método responsavel por atualiza o status da varinha 
     */
    private void setVarinha(){
        varinha = false;
    }
    /**
     * 
     * @return boolean - retorna false quando o item e retirado
     */
    public boolean deixarVarinha(){
        setVarinha();
        return getVarinha();
    }
    /**
     * Método que decrementa os inimigos
     */
    public void destruirInimigos(){
       // setInimigos(getInimigos()- getInimigos());
        setInimigos(1);
    }
    
   
    @Override
    public String toString() {
        String resp =  (getVarinha()) ? "sim" : "não";
        return String.format("\n******STATUS DO AMBIENTE******\n\n%-6s | %d\n%-21s | %s\n","Quatidade de inimigos", getInimigos(), "Contém varinha", resp);
    }

    
}
