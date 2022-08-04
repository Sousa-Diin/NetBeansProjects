
package heranca;

/**
 *
 * @author devsousa
 */
public class Cd extends Item {
    
    private String artista;
    private int numero_faixas;

    public Cd(String artista, int numero_faixas, String titulo, int tempo_reproducao, boolean tenho_copia) {
        super(titulo, tempo_reproducao, tenho_copia);
        this.artista = artista;
        this.numero_faixas = numero_faixas;
    }


    public String getArtista() {
        return artista;
    }

    public int getNumero_faixas() {
        return numero_faixas;
    }

    
    @Override
    public String getDescricao(){
        String saida = super.getDescricao();
        return saida += "Artista: " + getArtista() + "\n" + "Numero de faixas: "
                + getNumero_faixas() + "\n";
    }
}
