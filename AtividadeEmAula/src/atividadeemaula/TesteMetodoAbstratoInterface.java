
package atividadeemaula;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wildes Sousa
 */
public class TesteMetodoAbstratoInterface {

    /**
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        // TODO code application logic here
        List<Imposto> contribuinte = new ArrayList<>();
        
        contribuinte.add(new Carro(30000));
        contribuinte.add(new Aposentado(72, 2100));
        
        for(Imposto i : contribuinte){
            System.out.println(i.toString());
        }
        
       
    }
}
