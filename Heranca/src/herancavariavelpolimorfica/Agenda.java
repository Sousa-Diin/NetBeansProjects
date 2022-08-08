
package herancavariavelpolimorfica;

import java.util.ArrayList;

/**
 *
 * @author devsousa
 */
public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }
    
    public void adicionarContato(Pessoa p){
        contatos.add(p);
    }
    
    public void removerContato(String chave){
        
        Pessoa pessoa = buscarContato(chave);
        
        if(pessoa != null){
            contatos.remove(pessoa);
            System.out.println("removido com sucesso.");
        }else{
            System.out.println("Entre com ID valido.");
        }
        
    }
    
    private Pessoa buscarContato(String chave){
        for(Pessoa p  : contatos){
           if(p instanceof PessoaFisica){
               if(((PessoaFisica) p).getCpf().equals(chave)){
                   return p;
               }
           }else if (p instanceof PessoaJuridica){
               if(((PessoaJuridica) p).getCnpj().equals(chave))
               return p;
           }
            
        
        }
        return null;
    }
    
    public void exibirContatos(){
        System.out.print("\n#########CONTATOS DA AGENDA#########\n");
        for(Pessoa p : contatos) {  
            System.out.println( p.toString() + "\n");
        }
    }
    
    
}
