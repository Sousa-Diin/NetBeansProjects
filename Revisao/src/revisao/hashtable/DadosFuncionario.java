
package revisao.hashtable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.SortedMap;


/**
 *
 * @author devsousa
 */
public class DadosFuncionario {
    private HashMap<String,Funcionario> dadosFuncionario;
    private String chavePrimaria;
    private Funcionario objFuncionario;

    public DadosFuncionario() {
        dadosFuncionario = new HashMap<>();
    }

    public DadosFuncionario(String chavePrimaria, Funcionario funcionario) {
        this.chavePrimaria = chavePrimaria;
        objFuncionario = funcionario;
        dadosFuncionario = new HashMap<>();
    }

    public boolean cadastrarFuncionario(Funcionario f){
        if(!verificaFuncionario(f.getCpf())){
            dadosFuncionario.put(f.getCpf(), f);
            return true;
        }
        return false;    
    }
    
    private boolean verificaFuncionario(String key){
        return dadosFuncionario.get(key) != null;
       
    }

    @Override
    public String toString() {
        return "DadosFuncionario{" + "chavePrimaria=" + chavePrimaria + ", objFuncionario=" + objFuncionario.getCpf() + '}';
    }
    
    
    
    /**
     * 
     * @return Coleção de Funcionarios
     */
    public List<Funcionario> listarFuncionarios(){
        return new ArrayList<Funcionario> (dadosFuncionario.values());
    }
    
    public Funcionario buscarFuncionario(String key){
        return dadosFuncionario.get(key);
    }
    
    //A intensão é entregar uma tabela hash ordenada
    Comparator<Funcionario> condicao = new Comparator<>(){
       @Override
       public int compare(Funcionario strKey, Funcionario strKey1){
           return strKey.getCpf().compareTo(strKey1.getCpf());
       } 
    };
    
    public void exibirfichaFunc(){
        
        for(String chave : dadosFuncionario.keySet()){
            
            dadosFuncionario.get(chave).ListarFuncionario(); 
        }
    }
   
}
