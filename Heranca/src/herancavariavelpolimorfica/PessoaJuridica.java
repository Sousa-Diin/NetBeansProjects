
package herancavariavelpolimorfica;

/**
 *
 * @author devsousa
 */
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private int ie;

    public PessoaJuridica(String cnpj, int ie, String nome, String endereco, String email) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.ie = ie;
    }

    public String getCnpj() {
        return cnpj;
    }

    public int getIe() {
        return ie;
    }

    
    @Override
    public String toString(){
        //String descricao = super.getDescricao();
        return super.toString() + "\nCnpj: " + getCnpj()+ "\nInscrição estadual: " + getIe();
    }

    
    
}
