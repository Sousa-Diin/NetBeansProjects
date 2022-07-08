package fila;
/** @author wildes */
public class Mamiferos {
    private String nome;
    private String cadeiaAlimentar;
    private boolean domesticavel = false;

    public Mamiferos(String nome, String cadeiaAlimentar) {
        this.nome = nome;
        this.cadeiaAlimentar = cadeiaAlimentar;
        
        if(this.cadeiaAlimentar.equals("presa"))
           this.domesticavel = true; 
        else
            this.domesticavel = false;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCadeiaAlimentar() {
        return cadeiaAlimentar;
    }

    public boolean getDomesticavel() {
        return domesticavel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCadeiaAlimentar(String cadeiaAlimentar) {
        this.cadeiaAlimentar = cadeiaAlimentar;
    }

    @Override
    public String toString() {
        return "Mamiferos{" + "nome=" + nome + "\n, cadeiaAlimentar=" + cadeiaAlimentar + 
                "\n, domesticavel=" + domesticavel + '}';
    }
    
     //@Override
    public String imprimir() {
        return "Mamiferos{" + "nome=" + nome + "\n, cadeiaAlimentar=" + cadeiaAlimentar + 
                "\n, domesticavel=" + domesticavel + '}';
    }
    
    
    
}
