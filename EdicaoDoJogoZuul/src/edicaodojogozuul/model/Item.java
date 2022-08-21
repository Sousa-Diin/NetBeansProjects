
package edicaodojogozuul.model;

/**
 *
 * @author devsousa
 */
public class Item {
    private int durabilidade;
    private String artefato;
   

    

    /**
     * 
     * @param artefato 
     */
    public Item(String artefato) {
        definirArtefato(artefato);
       
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public String getArtefato() {
        return artefato;
    }
    /**
     * @return - decrementa a durabilidade do item
     */
    public void setDurabilidade() {
        durabilidade -= 2;
    }
    
    public void ajustarDurabilidade(int valor){
        durabilidade = valor;
    }
    
    /**
     * 
     * @param Durabilidade e nome do artefato 
     */
    private void definirArtefato(String umArtefado){
         switch (umArtefado) {
            case "varinha":
                durabilidade = 20;
                this.artefato = umArtefado;
                break;
            case "mapa":
                durabilidade = 1;
                this.artefato = umArtefado;
                break;
            case "pedra":
                durabilidade = 1;
                this.artefato = umArtefado;
                break;
            case "capa":
                durabilidade = 2;
                this.artefato = umArtefado;
                break;
            case "vassoura":
                durabilidade = 1;
                this.artefato = umArtefado;
                break;
            case "vira_tempo":
                durabilidade = 1;
                this.artefato = umArtefado;
                break;
            default:
                durabilidade = 0;
                this.artefato = null;
                break;
        }
    }
    
    
    
}
