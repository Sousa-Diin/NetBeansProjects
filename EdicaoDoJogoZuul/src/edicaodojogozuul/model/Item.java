
package edicaodojogozuul.model;


/**
 * Esta classe eh parte da aplicacao "Labirinto de Hogwarts.
 * "Labirinto de Hogwarts" eh um jogo de aventura muito simples e divertido, baseado em texto.  
 * 
 *  A classe Item é composicão da classe jogador e ambiente
 * 
 * @version 2011.07.31 (2016.02.01)
 * 
 * @author modificado por Wildes Sousa 
 * @version  2022 v1.22-1
 */
public class Item {
    /**
     * Atributos da classe
     * 
     */
    private int durabilidade;
    private String artefato;
   

    public Item(String artefato, int durabilidade) {
        this.durabilidade = durabilidade;
        this.artefato = artefato;
    }

    /**
     * 
     * @return durabilidade do item
     */
    public int getDurabilidade() {
        return durabilidade;
    }

     /**
     * 
     * @return nome do artefato
     */
    public String getArtefato() {
        return artefato;
    }
    /**
     * Método responsavel por atualiazar a durabilidade dos itens
     * @param durabilidade 
     */
    //mudanca 30/08 excluir => correcões
    private void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
    /**
     * Método que decrementa a durabilidade do varinha
     */
    public void decrementaVarinha(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()-1);
        }
    }
    /**
     * Método que decrementa a durabilidade do item
     */
    public void decrementaItem(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()- getDurabilidade());
        }
    }

    @Override
    public String toString() {
        return String.format("\n|%-12s | %-12d|\n", getArtefato(), getDurabilidade() );
    }    
}
