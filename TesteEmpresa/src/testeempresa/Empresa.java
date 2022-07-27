
package testeempresa;

import java.util.ArrayList;



/**
 *
 * @author devsousa
 */
public class Empresa {
    
    private String nome;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        funcionarios = new ArrayList<>();
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    public void admitirFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public void gerarFolhaDePagamento() {
    for(Funcionario f: funcionarios) {
        System.out.println(f);
    }
 }
    
}
