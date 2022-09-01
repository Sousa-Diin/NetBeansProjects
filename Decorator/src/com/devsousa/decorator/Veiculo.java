
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public abstract class Veiculo {
    private String descricao;
    
    public Veiculo(String descricao) {
        this.descricao = descricao;
    }

    //Ou usa o construtor ou set
    /*public void setDescricao(String descricao) {
        this.descricao = descricao;
    }*/

    public String getDescricao() {
        return descricao;
    }
    
    
    
    public abstract double preco();
}
