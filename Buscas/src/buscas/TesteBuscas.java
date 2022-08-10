
package buscas;

/**
 *
 * @author devsousa
 */
public class TesteBuscas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DiarioTurma diario = new DiarioTurma();
        
        diario.adicionarAluno(new Aluno("wildes augusto", "automacao"));
        diario.adicionarAluno(new Aluno("bruno souza", "automacao"));
        diario.adicionarAluno(new Aluno("bruno alon", "automacao"));
        diario.adicionarAluno(new Aluno("caio rocha", "automacao"));
        diario.adicionarAluno(new Aluno("wider fernando", "automacao"));
        diario.adicionarAluno(new Aluno("carlos pereira", "automacao"));
        diario.adicionarAluno(new Aluno("alex andrade", "automacao"));
        diario.adicionarAluno(new Aluno("alessandro menezes", "automacao"));
        diario.adicionarAluno(new Aluno("alessandro chargas", "automacao"));
        diario.adicionarAluno(new Aluno("wildes sousa", "automacao"));
        
        
        diario.listar();
        System.out.println("\nBUSCAS PELA PRIMEIRA LETRA DO NOME \n");
        diario.buscarPorLetra("c");
        
        System.out.println("\n\nBUSCAS PELO PRIMEIRO NOME \n");
        diario.buscarPrimeiroNome("b");
    }
    
}
