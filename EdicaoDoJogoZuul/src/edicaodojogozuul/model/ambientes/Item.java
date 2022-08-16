
package edicaodojogozuul.model.ambientes;

/**
 *
 * @author devsousa
 */
public abstract class Item{
    private String nome;
    private boolean disponivel;

    public Item(String nome, boolean disponivel) {
        this.nome = nome;
        this.disponivel = disponivel;
    }
    
    
}
