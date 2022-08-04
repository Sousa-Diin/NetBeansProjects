
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
        for(Item i : itens){
            itens.remove(i.getTitulo().equals(resposta));
        }
    }
    
    public String listarItem(){
        String saida ="";
        for(Item i : itens){
            saida = i.getDescricao();
        }
        return saida + "\n Tamanho da lista: " + itens.size() ;
    }
}
