
package edicaodojogozuul.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Wildes Sousa
 */
public class Jogador {
    private int vida;
    private List<Item> mochila;

    public Jogador() {
        vida = 3;
        mochila = new ArrayList<>();
    }
    
    public void usarItem(String umItem){
        
        Item itemAUsar = buscarItem(umItem);
            
   
        if(itemAUsar.getArtefato().equals("varinha")){
           // executa metodo
            System.out.println("Usando Varinha");
        }
    }
    /**
     * 
     * @param umItem
     * @return - String item adicionado  e ou  capacidade maxima atingida
     */
    private String pegarItem(Item umItem){
   
        if(mochila.size() < 5){
            mochila.add(umItem);
            return "\nItem adicionado\n";
          
        }
        return "\nCapacidade maxima atingida.\n";     
        
    }
    
    /**
     * 
     * @param umItem
     * @return item - caso o mesmo exista ou caso contrario null
     */
    public Item buscarItem(String umItem){
        for(Item i: mochila){
           if(i.getArtefato().equals(umItem));
           return i;
        }
        return null;
    }
    
    /**
     * 
     * @param umItem
     * @return boollean - verdedairo se a mochila contém o item caso contrario false 
     */
    public boolean temItem(String umItem){
        for(Item i: mochila){
           if(i.getArtefato().equals(umItem));
           return true;
        }
        return false;
    }
    
    /**
     * 
     * @return  List - Uma lista de itens
     */
    public List<Item> getItens(){
        return Collections.unmodifiableList(mochila);
       
    }
    
}
