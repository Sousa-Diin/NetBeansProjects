
package heranca;

/**
 *
 * @author devsousa
 */
public class DVD extends Item {

    private String diretor;

    public DVD(String diretor, String titulo, int tempo_reproducao, boolean tenho_copia) {
        super(titulo, tempo_reproducao, tenho_copia);
        this.diretor = diretor;
    }

        

    public String getDiretor() {
        return diretor;
    }
    
    @Override
    public String getDescricao(){
        String saida = super.getDescricao();
        return saida += "Diretor: " + getDiretor() + "\n";
    }
    
}
