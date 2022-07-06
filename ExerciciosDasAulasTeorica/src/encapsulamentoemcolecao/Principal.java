package encapsulamentoemcolecao;

import java.util.ArrayList;
import java.util.List;

/** @author wildes */
public class Principal {
 
    public static void main(String[] args) {
        
        Agencia ag = new Agencia(3456);
        
        
        ContaBancaria conta1 = new ContaBancaria(0743, "Wildes",2594);
        ContaBancaria conta2 = new ContaBancaria(7249, "Ricardo",3584);
        ContaBancaria conta3 = new ContaBancaria(0751, "Alex",4206);
        
        ag.adicionarConta(conta1);
        ag.adicionarConta(conta2);
        ag.adicionarConta(conta3);
        ag.adicionarConta(conta3);//Tratamento Ok
        
       /*
        *Encapsulamento de Coleção
        *Lembrar sempre de proteger e respeitar o encapsulamento
        
       ArrayList<ContaBancaria> contas = ag.getContas();
       contas.add(conta2);*/
        
       
        
       
        System.out.println("Contas cadastradas: ");
        for(ContaBancaria c : ag.getContas()){
            System.out.format("Nome: %s \nSaldo: R$%.2f\n\n", c.getNome(), c.getSaldo());
      
        }
        
        //System.out.println("\nSaldo: " + conta1.Saldo());
        
        conta2.sacar(1500);
        System.out.printf("Nome: %s\nSaldo atual: R$%.2f\n", conta2.getNome() , conta2.getSaldo());
        
        conta1.sacar(1250);
        System.out.println("Nome: " + conta1.getNome() + "\nSaldo atual: " + conta1.Saldo());
    }
    
}
