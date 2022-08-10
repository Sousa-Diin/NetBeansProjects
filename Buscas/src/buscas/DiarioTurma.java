
package buscas;

import java.util.ArrayList;

/**
 *
 * @author devsousa
 */
public class DiarioTurma {
    private ArrayList<Aluno> alunos;
    
    public DiarioTurma(){
        alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno a){
        alunos.add(a);
    }
    
    public void buscarPorLetra(String letra){
        System.out.printf("%-21s%-25s%n","Nome","Curso");
        for(Aluno a : alunos){
            if(a.getNome().contains(letra)){
                System.out.println(a + "\n");
            }
        }
        
    }
    
    public void buscarPrimeiroNome(String nome){
        System.out.printf("%-21s%-25s%n","Nome","Curso");
        for(Aluno a : alunos){
            if(a.getNome().contains(nome)){
                System.out.println(a.toString().toUpperCase().trim() + "\n");
            }
        }
    }
    
    public void listar(){
        System.out.print("\nDIARIO DE TURMA\n\n");
        
        System.out.printf("%-21s%-25s%n","Nome","Curso");
        for(Aluno a : alunos){
            System.out.println(a + "\n");
        }
    }
}

