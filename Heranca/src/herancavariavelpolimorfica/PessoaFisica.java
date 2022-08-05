
package herancavariavelpolimorfica;

/**
 *
 * @author devsousa
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String estadoCivil;

    public PessoaFisica(String cpf, String estadoCivil, String nome, String endereco, String email) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    
    @Override
    public String toString(){
        //String descricao = super.getDescricao();
        return "\nCpf: " + getCpf() + "\nEstado Civil: " + getEstadoCivil();
    }
}
