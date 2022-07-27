
package testeempresa;

/**
 *
 * @author devsousa
 */
public class TesteEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa = new Empresa("EmpresaX","123456789/1000");
        Funcionario func1 = new FuncionarioComissionado("Luiz","123456789-10",100.0,160.5);
        Funcionario func2 = new FuncionarioHorista("Zé","987654321-00",60, 50.0);

        empresa.admitirFuncionario(func1);
        empresa.admitirFuncionario(func2);
        

        empresa.gerarFolhaDePagamento();
    }
    
}
