
package testeempresa;

/**
 *
 * @author devsousa
 */
public class FuncionarioComissionado extends Funcionario {
    private double totalVendas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, String cpf, double totalVendas, double taxaComissao) {
        super(nome, cpf);
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }
    
    

    public double getTotalVendas() {
        return totalVendas;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    
    @Override
    public double calcularSalario(){
        return getTaxaComissao() * getTotalVendas();
    }
    
}
