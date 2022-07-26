
package revisao.hashtable;

/**
 *
 * @author devsousa
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private int idade;
    private double salario;

    public Funcionario() {
    }

    
    
    public Funcionario(String nome,String cpf, int idade, double salario) {
        this.nome = nome;
        this.cpf =  cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format("\nNome.....: %s\nCPF......: %s\nIdade....: %d\nSalario..: R$%.2f \n",nome,cpf,idade,salario);

    }
    
    
    
    public void ListarFuncionario(){
        System.out.printf("%s\t %s\t %d\t R$%.2f \n",nome, cpf, idade, salario );
    }
    
}
