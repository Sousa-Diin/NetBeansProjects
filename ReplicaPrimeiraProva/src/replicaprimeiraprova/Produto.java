
package replicaprimeiraprova;

/**
 *
 * @author devsousa
 */
public class Produto {
    
    private String nome;
    private String marca;
    private int qtd;

    public Produto(String nome, String marca, int qtd) {
        this.nome = nome;
        this.marca = marca;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getQtd() {
        return qtd;
    }

   
    
    
}
