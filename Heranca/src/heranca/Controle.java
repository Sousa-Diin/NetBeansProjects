
package heranca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author devsousa
 */
class Controle {
    private ArrayList<Item> itens;

    public Controle() {
        itens = new ArrayList<>();
    }
    
    public void adicionarItem(Item i ){
        itens.add(i);
    }
    
    public void removerItem(){
        System.out.println("Entre com [artista/diretor] para remocão: ");
        Scanner sc = new Scanner(System.in);
        String resposta = sc.nextLine();
        
        itens.remove(buscarItem(resposta));
        
    }
    public Item buscarItem(String id){
        for(Item i : itens){
            if(i instanceof Cd){
                if(((Cd)i).getArtista().equals(id)){
                    return i;
                }
            }else if(i instanceof DVD){
                if (((DVD)i).getDiretor().equals(id)){
                    return i;
                }
            }
        }
        return null;
    }
    
    public void listarItem(){
       // String saida ="";
        for(Item i : itens){
            System.out.println(i.getDescricao());
        }
       // return saida + "\n Tamanho da lista: " + itens.size() ;
    }
}
