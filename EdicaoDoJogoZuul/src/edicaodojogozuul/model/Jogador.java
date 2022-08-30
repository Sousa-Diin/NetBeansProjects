
package edicaodojogozuul.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wildes Sousa
 */
public class Jogador {
    private int vida;
    private  List<Item> mochila;

    public Jogador() {
        vida = 10;
        mochila = new ArrayList<>();
        addItens();
    }
    
    public void decrementaVida(){
        tiraVida();
    }
    
    private void tiraVida(){
        vida--;
    }

    protected void setVida(int vida) {
        this.vida += vida;
    }

    public int getVida() {
        return vida;
    }
    
    
    
    public char usarItem(String artefato){           
        char codigo_da_acao = '/';
        Item item_escolhido = buscarItemEspecifico(artefato);
        if(item_escolhido.getArtefato() == null){
            return codigo_da_acao;
        }else{
            switch (item_escolhido.getArtefato()) {
            
            case "mapa": // Mostra todos os inimigos 
                codigo_da_acao = 'm';
                removerItem(item_escolhido.getArtefato());
                break;
            case "pedra": // Elimina todos os inimigos que restaram nos ambientes após ter regatado os amigos
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
                // Nada ha fazer
                break;
            }
        }
        
        return codigo_da_acao;
    }
    /**
     * @return void - responsavél por adicionar os intens possiveis do jogo
     * Itens possiveis
     * > mapa do maroto
     * > capa da invisibilidade
     * > vassoura voadoura
     * > pedra filosofal
     * > vira-tempo
     */
    private void addItens(){
        mochila.add(new Item("mapa"));
        mochila.add(new Item("capa"));
       /* mochila.add(new Item("vassoura"));*/
        mochila.add(new Item("pedra"));
        mochila.add(new Item("vira-tempo"));
                
    }
    
    public void pegarVarinha(boolean varinha){
        
        if(varinha){
             mochila.add(new Item("varinha"));
        }
       
    }
    
    public void removerItem(String item){
        Item i = buscarItemEspecifico(item);
        if(i.getDurabilidade()>= 0){
            mochila.remove(i);
        }
        
    }
    
    public boolean temItem(String item){
        return buscarItem(item);
    }
    
   
    
    public boolean temVarinha(){
        
        return (buscarItem("varinha"));  
    }
    
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