
package herancavariavelpolimorfica;

/**
 *
 * @author devsousa
 */
public abstract class Pessoa {
     private String nome;
    private String endereco;
    private String email;

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nEndereco: " + getEndereco() + "\nEmail: " + getEmail() ;
    }
    
    
}
