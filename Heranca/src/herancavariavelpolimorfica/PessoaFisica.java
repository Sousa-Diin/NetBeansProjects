
package herancavariavelpolimorfica;

import java.util.Objects;

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
    public boolean equals(Object obj){
        if(this == obj){ // compara se a referencia são iguais 
            return true;
        }
        else if (!(obj instanceof PessoaFisica)){
            return false;
        }
        PessoaFisica obj_comparacao = (PessoaFisica)obj;
        return obj_comparacao.cpf.equals(cpf) && estadoCivil.equals(obj_comparacao.cpf);
    } 

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.cpf);
        hash = 67 * hash + Objects.hashCode(this.estadoCivil);
        return hash;
    }
    
    @Override
    public String toString(){
        String descricao = super.toString();
        return descricao + "\nCpf: " + getCpf() + "\nEstado Civil: " + getEstadoCivil();
    }
}
