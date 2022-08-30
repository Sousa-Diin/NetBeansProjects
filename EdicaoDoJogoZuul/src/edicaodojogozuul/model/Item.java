
package edicaodojogozuul.model;


/**
 Esta classe eh parte da aplicacao "Labirinto de Hogwarts.
 * "Labirinto de Hogwarts" eh um jogo de aventura muito simples e divertido, baseado em texto.  
 * 
 *  A classe Item é composicão da classe jogador ao instancia-la é passada por parametro um item
 *  a classe item analiza o artefato e configura a durabilidade de cada.
 *  
 * Inspirado no jogo word of zuul de Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 * 
 * @author modificado por Wildes Sousa 
 * @version  2022 v1.22-1
 */
public class Item {
    private int durabilidade;
    private String artefato;
   

    public Item(String artefato) {
        durabilidade = definirDurabilidadeArtefato(artefato);
        this.artefato = artefato;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public String getArtefato() {
        return artefato;
    }

    private void setDurabilidade(int durabilidade) {
        this.durabilidade = durabilidade;
    }
    
    public void decrementaVarinha(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()-1);
        }
    }
    
    public void decrementaItem(){
        if(getDurabilidade()> 0){
            setDurabilidade(getDurabilidade()- getDurabilidade());
        }
    }
    
    /**
     * 
     * @param umArtefado
     * @return int - define qual será a durabilidade do artefato em questao
     */
    private int definirDurabilidadeArtefato(String umArtefato){
        
         switch (umArtefato) {
            
            case "mapa":
                setDurabilidade(1);
                break;
            case "pedra":
                setDurabilidade(1);
                break;
            case "capa":
                setDurabilidade(2);
                break;
            case "vassoura":
                setDurabilidade(1);
                break;
            case "vira-tempo":
                setDurabilidade(3);
                break;
            default:
                setDurabilidade(20);/* */
                break;
        }
        return getDurabilidade();
    }  

    @Override
    public String toString() {
        return String.format("\n|%-12s | %-12d|\n", getArtefato(), getDurabilidade() );
    }    
}
