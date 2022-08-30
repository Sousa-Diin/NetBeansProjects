
package edicaodojogozuul.model;

import java.util.Random;


/**
 *
 * @author devsousa
 */
public class AmbienteComum extends Ambiente {
    private int inimigos;
    private boolean varinha;
    //private Item varinha;
    

    public AmbienteComum(String descricao, String id,boolean sorteio) {
        super(descricao, id);
        criarInimigos();
        varinha = sorteio;
        //varinha = new Item();
        
    }
    
    private void criarInimigos(){
        Random sorteia = new Random();
        inimigos = sorteia.nextInt(4);
    }

    public  int getInimigos() {
        return inimigos;
    }

    private void setInimigos(int inimigos) {
        this.inimigos = inimigos;
    }
    

    public boolean getVarinha() {
        return varinha;
    }  
    
    private void setVarinha(){
        varinha = false;
    }
    
    public boolean deixarVarinha(){
        setVarinha();
        return getVarinha();
    }
    
    public void destruirInimigos(){
        setInimigos(getInimigos()- getInimigos());
    }
    
   
    @Override
    public String toString() {
        String resp =  (getVarinha()) ? "sim" : "não";
        return String.format("\n******STATUS DO AMBIENTE******\n\n%-6s | %d\n%-21s | %s\n","Quatidade de inimigos", getInimigos(), "Contém varinha", resp);
    }

    
}
