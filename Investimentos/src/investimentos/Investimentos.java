package investimentos;

import java.util.Scanner;
public class Investimentos {

    public static void main(String[] args) {
      
        /*CalculaInvestimento cliente1 = new CalculaInvestimento("renda variavel", "Joao",150);
        CalculaInvestimento cliente2 = new CalculaInvestimento(100,"poupanca", "pedro");*/
        
        Scanner entrada= new Scanner(System.in);
        CalculaInvestimento [] clientes;
        
        clientes = new  CalculaInvestimento[5];
        for(int i = 0; i < clientes.length;i++){
            
            System.out.println("Tipo de investimento:");
            clientes[i].tipo = entrada.nextLine();
            
            System.out.println("Nome do investimento: ");
            clientes[i].investidor = entrada.nextLine();
            
            System.out.println("Valor a investir:");
            clientes[i].valor = entrada.nextInt();
            
        }
      
        for(int i = 0; i < 5;i++){
            clientes[i].exibeInvestidores();
           
    }
    
}}
