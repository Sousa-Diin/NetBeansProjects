
package atividadeemaula;

/**
 *
 * @author Wildes Sousa
 */
public class Aposentado extends Pessoa {

    private int idade;

    public Aposentado(int idade, double salario) {
        super(salario);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
    
    

    @Override
    public double getImpostoPago() {
        if(idade >= 75){
            return super.getSalario() * 0.08;
        }
        else if(idade <= 110)
           return super.getSalario()* 0.02;
        return super.getSalario();
    }

    @Override
    public String toString() {
        return "Aposentado \nIdade: " + getIdade() + "\tImposto pago: "+ getImpostoPago();
    }
   
    
    
}
