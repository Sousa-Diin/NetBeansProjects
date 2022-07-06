package encapsulamentoemcolecao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {
    private int codigo;
    private ArrayList<ContaBancaria> contas;

    
    public Agencia(int codigo) {
        this.codigo = codigo;
        contas = new ArrayList<> ();
    }
    
    public void adicionarConta (ContaBancaria cb){
        if(!contaCadastrada(cb.getNumero())){
            contas.add(cb);
        }
    }

    private boolean contaCadastrada(int numero) {
        for(ContaBancaria c : contas){
            if(c.getNumero()== numero)
                return true;
        }
            return false;
    }
    /** ERRO
     *  fere o principio do encapsulamento de Coleções
      #public ArrayList<ContaBancaria> getContas(){
      #  return contas;
    }*/
    
    /** O método unmodifiableList retorna uma lista (do tipo List).
     * apenas leituras 
     */
    public List<ContaBancaria> getContas(){
        return Collections.unmodifiableList(contas);
    }
    
    
    
    
}
