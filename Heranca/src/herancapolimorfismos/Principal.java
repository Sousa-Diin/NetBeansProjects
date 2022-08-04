
package herancapolimorfismos;

import java.util.Scanner;

/**
 *
 * @author devsousa
 */
public class Principal {
    private static Scanner op = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        
        double capital = 0.0f;
        int periodo = 0, ent = 0;
        
        System.out.print("\nEntre com o valor a ser investido: "); capital = op.nextDouble();
        System.out.print("\nEntre com a duração da aplicação em meses: ");periodo = op.nextInt();
                
        while(ent != 4){
            menu();
            System.out.print("\nopção -> ");ent = op.nextInt();
            op.nextLine();
            simular(ent, capital, periodo);
        }
    }
    
    
    
    public static void menu(){
        
        System.out.println("\n###### SIMULAÇÃO ######\n\n");
        System.out.println("\n1 - Investimento em poupança\n2 - Investimento em CDB\n"
                          + "3 - Investimento em ação\n4 - Sair\n");
    }
    
    public static void simular(int opcao, double capital, int periodo ){
       
        Aplicacao aplicar;
        
        double aux1 = 0;
        double aux2 = 0;
       
        switch(opcao){
            case 1:
                System.out.print("\nEntre com o valor da taxa Selic em porcentagem: ");
                aux1 = op.nextDouble();
                System.out.print("\nEntre com o valor da taxa referencial (TR) em porcentagem: ");
                aux2 = op.nextDouble();
                              
                aplicar = new Poupanca(capital, aux1,aux2);              
                
                System.out.printf("\nValor final para investimento em poupança: R$ %.2f\n", aplicar.calcularRetorno(periodo));
                op.nextLine();
                break;              
                
            case 2:
                System.out.println("\nEntre com o valor da taxa CDI em %: ");
                aux1 = op.nextInt();

                aplicar = new CDB(capital, aux1);
                
                System.out.printf("\nValor final para investimento em CDB: R$ %.2f\n", aplicar.calcularRetorno(periodo));
                op.nextLine();
                break;
                
                
            case 3:
                System.out.println("\nEntre com o preço de abertura da ação: ");
                aux1 = op.nextDouble();
                System.out.println("\nEntre com o preço de fechamento da ação: ");
                aux2 = op.nextDouble();
                aplicar = new Acoes(capital,aux1, aux2);
                
                System.out.printf("\nValor final para investimento em ação: R$ %.2f\n", aplicar.calcularRetorno(periodo));
                op.nextLine();
                break;
                
            case 4://sair
                System.out.println("FIM DA SIMULAÇÃO");
                break;
                
            default:
                System.out.println("\nopção invalida.");
        }
    }
    
  
}
