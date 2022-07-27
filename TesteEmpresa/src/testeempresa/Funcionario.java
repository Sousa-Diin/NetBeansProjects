
package testeempresa;

/**
 *
 * @author devsousa
 */
public abstract class Funcionario {
    private String nome;
    private String cpf;
   

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }
    
    

    protected String getNome() {
        return nome;
    }

    protected String getCpf() {
        return cpf;
    }

    
    protected abstract double calcularSalario();
    
    @Override
    public String toString() {
        return "Nome: "+ getNome()+"\nCPF: "+getCpf()+"\nSalario: " + calcularSalario();
    }
    
    
}
