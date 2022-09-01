
package edicaodojogozuul.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Entidade que interage com o jogo, tornando a usabilidade do jogo mais interesante 
 * @author Wildes Sousa
 */
public class Jogador {
    private int vida;
    private  List<Item> mochila;

    /**
     * Cria uma lista para guardar os itens do jogador,
     * adiciona os itens iniciais e seta a vida inicial do jogador
     */
    public Jogador() {
        vida = 10;
        mochila = new ArrayList<>();
        addItens();
    }
  
    /**
     * atualiza a vida do jogador
     */
    public void decrementaVida(){
        tiraVida();
    }
   
    /**
     * decrementa a vida do jogador
     */
    private void tiraVida(){
        vida--;
    }

    /**
     * Ajusta a vida do jogador
     * @param vida 
     */
    protected void setVida(int vida) {
        this.vida += vida;
    }

    /**
     * Retorna a vida do jogador
     * @return vida
     */
    public int getVida() {
        return vida;
    }
    
    
    
    public char usarItem(String artefato){           
        char codigo_da_acao = '/';
        Item item_escolhido = buscarItemEspecifico(artefato);
        if(item_escolhido.getArtefato() == null){// tratar erro #23
             codigo_da_acao= '/';
        }else {
            switch (item_escolhido.getArtefato()) {
            
            case "mapa": // Mostra o mapa do jogo e todos os inimigos 
                codigo_da_acao = 'm';
                removerItem(item_escolhido.getArtefato());
                break;
            case "pedra": // Leva o jogador para saida do ambiente
                codigo_da_acao = 'p';
                removerItem(item_escolhido.getArtefato());
                break;
            case "capa": // Sai do comodo que contém os dementadores sem decrementar a vida
               codigo_da_acao = 'c';
               removerItem(item_escolhido.getArtefato());
                break;
            case "vassoura": // Item da proxima missão
                codigo_da_acao = 'v';
                removerItem(item_escolhido.getArtefato());
                break;
            case "vira-tempo": // Adiciona vida do jogador = 3
                codigo_da_acao = 't';
                removerItem(item_escolhido.getArtefato());
                break;
            case "varinha": // Adiciona vida do jogador = 3
                codigo_da_acao = '*';
                buscarItemEspecifico(item_escolhido.getArtefato()).decrementaVarinha();
                break;
            default:
                codigo_da_acao = 'n';
                break;
            }
        }
        
        return codigo_da_acao;
    }
    /**
     * @return void - responsavél por adicionar os intens possiveis do jogo
     * que são:
     * > mapa do maroto
     * > capa da invisibilidade
     * > vassoura voadoura
     * > pedra filosofal
     * > vira-tempo
     * > varinha
     */
    private void addItens(){
        mochila.add(new Item("mapa",1));
        mochila.add(new Item("capa",2));
       /* mochila.add(new Item("vassoura",1)); proxima fase*/
        mochila.add(new Item("pedra",1));
        mochila.add(new Item("vira-tempo",3));
                
    }
    /**
     * Método que cria e adiciona a varinha na mochila 
     * caso o ambiente a contenha 
     * @param varinha 
     */
    public void pegarVarinha(boolean varinha){
        
        if(varinha){
             mochila.add(new Item("varinha",20));
        }
       
    }
    /**
     * Recebe uma <String> item 
     * caso o item exista na mochila o mesmo e removido
     * @param item 
     */
    public void removerItem(String item){
        Item i = buscarItemEspecifico(item);
        if(i.getDurabilidade()>= 0){
            mochila.remove(i);
        }
        
    }
    /**
     * 
     * @param item
     * @return <boolean> retorna vardadeiro caso o Item existir na mochila
     */
    public boolean temItem(String item){
        return buscarItem(item);
    }
    /**
     * 
     * @return boolean - verdadeiro caso a varinha esteja na <ArrayList> mochila
     */    
    public boolean temVarinha(){
        
        return (buscarItem("varinha"));  
    }
    /**
     * 
     * @param item
     * @return 
     */
    private boolean buscarItem(String item){
        
        for(Item i : mochila){
            if(i.getArtefato().equals(item))
                return true;
        }
        return false;
    }
    /**
     * 
     * @param item
     * @return Item - retorna um item expecifico da mochila
     */
    public Item buscarItemEspecifico(String item){
        
        for(Item i : mochila){
            if(i.getArtefato().equals(item))
                return i;
        }
        return null;
    }
    /**
     * 
     * @return String - retorna uma lista de itens d
     */
    private String buscarItem(){
        String item = "";
        for(Item i : mochila){
            item += i + " ";
        }
        return item;
    }
   /**
    * 
    * @return String - retorna uma lista de intens do player
    */
    public String exibeItem(){
        return buscarItem();
    }
    
}