
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

    /**
     * 
     * @param obj
     * @return boolean 
     */
    @Override
    public boolean equals (Object obj){
        if(this == obj){
            return true;
        }
        else if (!(obj instanceof Cd)){
            return false;
        }
        else{
            Cd objAcomparar = (Cd)obj;
            return super.getTitulo().equals(objAcomparar.getTitulo()) &&  numero_faixas == objAcomparar.getNumero_faixas()
                    && artista.equals(objAcomparar.getArtista()) && super.getTempo_reproducao() == objAcomparar.getTempo_reproducao();
        }
    }
    
    @Override
    public int hashCode(){
        int hash = 27;
        hash = 32* hash + numero_faixas + super.getTempo_reproducao()
                + artista.hashCode() + super.getTitulo().hashCode();
        return hash;
    }
    
    @Override
    public String getDescricao(){
        
        return super.getDescricao() + "Artista: " + getArtista() + "\n" + "Numero de faixas: "
                + getNumero_faixas() + "\n";
    }
}
