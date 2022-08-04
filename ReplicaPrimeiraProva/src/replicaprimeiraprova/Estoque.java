
package replicaprimeiraprova;

import java.util.ArrayList;

/**
 *
 * @author devsousa
 */
class Estoque {
    private String tipo;
    private ArrayList<Produto> produtos;

    public Estoque(String tipo) {
        this.tipo = tipo;
        produtos = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void gerarRelatorio(){
        
    }
    
}
