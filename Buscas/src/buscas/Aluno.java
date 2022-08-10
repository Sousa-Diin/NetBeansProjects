
package buscas;

/**
 *
 * @author devsousa
 */
class Aluno {
    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        //return "Nome: " + getNome() + "\nCurso: " + getCurso()+ "\n";
        //System.out.printf("%-10s%-6s%-8s%-10s","Nome","Notas","Faltas","Situação");
        return String.format("%-19s  %-25s",getNome(), getCurso());
    }
    
    
}
