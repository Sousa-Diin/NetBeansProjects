
package revisao.hashtable;

import java.util.Scanner;

/**
 *
 * @author devsousa
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        
        DadosFuncionario dados = new DadosFuncionario();
        String status;
        
        Funcionario objF1 = new Funcionario("Wildes", "111", 21, 9754);
        Funcionario objF2 = new Funcionario("Eliane", "222", 22, 6754);
        Funcionario objF4, objF3 = new Funcionario("Sonia", "333", 45, 3754);
        
        status = (dados.cadastrarFuncionario(objF1)) ? "\nFuncionario cadastrado.\n" : "\nFuncionario já está no banco de dados...\n";
        System.out.println(status);
        status = (dados.cadastrarFuncionario(objF2)) ? "\nFuncionario cadastrado.\n" : "\nFuncionario já está no banco de dados...\n";
        System.out.println(status);
        status = (dados.cadastrarFuncionario(objF1)) ? "\nFuncionario cadastrado.\n" : "\nFuncionario já está no banco de dados...\n";
        System.out.println(status);
        status = (dados.cadastrarFuncionario(objF3)) ? "\nFuncionario cadastrado.\n" : "\nFuncionario já está no banco de dados...\n";
        System.out.println(status);
        dados.cadastrarFuncionario(new Funcionario("Dinho", "123", 21, 12754));
        dados.cadastrarFuncionario(new Funcionario("Lili", "234", 22, 9720));
        dados.cadastrarFuncionario(new Funcionario("Soninha", "321", 45, 7980));
        dados.cadastrarFuncionario(new Funcionario("Shirley", "888", 29, 21456));
        
        System.out.println("DADOS DOS FUNCIONARIOS");
        
        System.out.println("\nAcesso pelo Dados\n\n" + dados.listarFuncionarios());
        /*
        Scanner sc = new Scanner(System.in);
        String chave_primaria;
        
        System.out.println("Entre com um cpf para a busca: ");
        chave_primaria = sc.nextLine();
        
        objF4 = dados.buscarFuncionario(chave_primaria);
        objF4.ListarFuncionario();
        */
        System.out.println("\n\n");
        System.out.printf("\nNome\tCPF\tIdade\t  Salario\n");
        dados.exibirfichaFunc();
       
    }
}
