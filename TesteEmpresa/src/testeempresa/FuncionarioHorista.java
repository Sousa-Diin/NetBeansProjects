
package testeempresa;

/**
 *
 * @author devsousa
 */
public class FuncionarioHorista extends Funcionario {
    private double salarioHora;
    private double horasTrabalhadas;
    
    

    FuncionarioHorista(String nome, String cpf, int salarioHora, double horasTrabalhadas) {
        super (nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
       
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    
    @Override
    public double calcularSalario(){
        return (salarioHora * horasTrabalhadas);
    }

   
    
}
