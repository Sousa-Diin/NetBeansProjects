
package replicaprimeiraprova;

/**
 *
 * @author devsousa
 */
public class EstoqueTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estoque estoque = new Estoque("Fluxo");
        
        estoque.cadastrarProduto(new Produto("sabonete","Palmolivi",40));
    }
    
}
