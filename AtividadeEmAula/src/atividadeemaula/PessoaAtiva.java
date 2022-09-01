
package atividadeemaula;

/**
 *
 * @author Wildes Sousa
 */
public class PessoaAtiva extends Pessoa {
    private int numero_dependente;

    public PessoaAtiva(int numero_dependente, double salario) {
        super(salario);
        this.numero_dependente = numero_dependente;
       
    }

    public int getNumero_dependente() {
        return numero_dependente;
    }


    @Override
    public double getImpostoPago() {
        return 0;
    }

    
    
}
