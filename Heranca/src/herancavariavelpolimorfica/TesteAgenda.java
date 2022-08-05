
package herancavariavelpolimorfica;

import java.util.Scanner;

/**
 *
 * @author devsousa
 */
public class TesteAgenda {
    private static Scanner ent = new Scanner(System.in);
    private static Agenda agenda = new Agenda();
    
    public static void main(String[] args) {
        //Agenda agenda = new Agenda();
        
        int opcao = 0;
        while(opcao != 4){
            mostrarMenu();
            opcao = ent.nextInt();
            ent.nextLine();
            executarOpcao(opcao);
        }
        
        
    }
    
     private static void mostrarMenu(){
        System.out.println("########### SISTEMA DE CADASTRO ###########");
        System.out.println("1 - Cadastrar novo contato");
        System.out.println("2 - Remover contato");
        System.out.println("3 - Listar todos os contatos");
        System.out.println("4 - Sair");
        System.out.println("Escolha o número correspondente a uma das opções anteriores:");
    }
    
    private static void executarOpcao(int opcao){
        switch(opcao){
            case 1:
                cadastrarContato();
                
                break;
            case 2:
                removerContato();
                break;
            case 3:
                listarContato();
                break;
            case 4://Sair
        }
    }
    
    private static void cadastrarContato(){
        System.out.print("\nEntre com os dados para PF ou PJ\n1 - PF\n2 - PJ\nopção -> ");
        int opcao = ent.nextInt();
        String nome, endereco, email, chave, estadoCivil;
        switch(opcao){
            case 1:
                ent.nextLine();
                System.out.print("\nNome: ");
                nome = ent.nextLine();
                System.out.print("\nEndereço: ");
                endereco = ent.nextLine();
                System.out.print("\nEmail: ");
                email = ent.nextLine();
                System.out.print("\nCPF: ");
                chave = ent.nextLine();
                System.out.print("\nEstado Civil: ");
                estadoCivil = ent.nextLine();
                agenda.adicionarContato(new PessoaFisica(chave, estadoCivil, nome, endereco, email));
                break;
            case 2:
                ent.nextLine();
                System.out.print("\nNome: ");
                nome = ent.nextLine();
                System.out.print("\nEndereço: ");
                endereco = ent.nextLine();
                System.out.print("\nEmail: ");
                email = ent.nextLine();
                System.out.print("\nCPF: ");
                chave = ent.nextLine();
                System.out.print("\nIinscrição estadual: ");
                opcao = ent.nextInt();
                agenda.adicionarContato(new PessoaJuridica(chave, opcao, nome, endereco, email));
                ent.nextLine();
                break;
            
        }
    }
    
    private static void removerContato(){
        System.out.print("\nEntre com uma chave para remoção, CPF/CNPJ: ");
        String chave = ent.nextLine();
        agenda.removerContato(chave);
    }
    
    private static void listarContato(){
        agenda.exibirContatos();
    }
    
}
