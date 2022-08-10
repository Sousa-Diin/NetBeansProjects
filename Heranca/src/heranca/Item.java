
package heranca;

/**
 *
 * @author devsousa
 */
public abstract class Item {
    private String titulo;
    private int tempo_reproducao;
    private boolean tenho_copia;
    private String comentario;

    public Item(String titulo, int tempo_reproducao, boolean tenho_copia) {
        this.titulo = titulo;
        this.tempo_reproducao = tempo_reproducao;
        this.tenho_copia = tenho_copia;
        this.comentario ="";
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo_reproducao() {
        return tempo_reproducao;
    }

    public boolean getTenho_copia() {
        return tenho_copia;
    }

    private void setComentario(String comentario) {
        this.comentario = comentario;
    }
    

    public String getComentario() {
        return comentario;
    }
    
    public String getDescricao(){
        String saida;
        if (getTenho_copia()){
            saida = "sim";
        }else{
          saida = "não";  
        }
        
        return "Titulo: " + getTitulo() + "\n" + "Tempo de reproducão: "
                + getTempo_reproducao() + "\n" + "Tem Cópia: " + saida + "\n"
                + "Comentario: " + getComentario() + "\n";
    }
    
}
