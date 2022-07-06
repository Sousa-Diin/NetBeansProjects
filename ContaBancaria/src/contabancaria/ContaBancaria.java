
package contabancaria;

import java.util.ArrayList;
import java.util.Scanner;
public class ContaBancaria {

    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList();
       // Scanner javain = new Scanner(System.in);
        
        Cliente cliente = new Cliente("Itau","wildes","poupanca","1473", "0743","3");
        Cliente cliente1 = new Cliente("Caixa","Wildes","corrente","129", "0743","0");
        
        
        clientes.add(cliente);
        clientes.add(cliente1);
        
        
        int investidor = 0;
        int correntista = 0;
        int poupista = 0;
        
        
        for(Cliente jout: clientes){
            System.out.println("Banco: " + jout.getBanco() + "\nTitular: " + jout.getTilular()+"\nTipo da conta: "+ jout.getTipoConta() + "\n");
            
            if(jout.getBanco().equals("poupanca")){
                investidor += 1;
            }
            
            if(jout.getBanco().equals("corrente")){
                correntista += 1;
            }
            else{
                
                investidor +=1;
            }
        }
        
        
        System.out.println("Total de clientes    : " + clientes.size() + "\n");
        System.out.println("Total de correntistas: " + correntista + "\n");
        System.out.println("Total de poupistas   : " + poupista + "\n");
        System.out.println("Total de investidor   : " + investidor + "\n");
        
        //Remove indice do Array
        /*clientes.remove(cliente);
        
        for(Cliente c: clientes){
            System.out.println("Banco: " + c.getBanco() + "\nTitular: " + c.getTilular()+"\nTipo da conta: "+ c.getTipoConta() + "\n");
        }*/
        
    }

    
}
