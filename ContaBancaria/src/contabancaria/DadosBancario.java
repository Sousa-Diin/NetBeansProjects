
package contabancaria;

import java.util.ArrayList;

public class DadosBancario {
  
    ArrayList<Cliente> clientes = new ArrayList();
    
    public void cadastraCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public String contaClientes(){
        return clientes.size() + " ";
    }
}
