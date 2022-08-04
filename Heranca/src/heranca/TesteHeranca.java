
package heranca;

/**
 *
 * @author devsousa
 */
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Item dvd = new DVD("Michael","Moowalk", 2,true);
        
        Controle controle = new Controle();
        
        controle.adicionarItem(new Cd("Ruck",10,"Roupa nova", 2,true ));
        controle.adicionarItem(new DVD("Michael","Moowalk", 2,true));
        controle.adicionarItem(new Cd("Bee Gens",1000,"As melhores", 50,true ));
        controle.adicionarItem(dvd);
        
        System.out.println( controle.listarItem());
       
        controle.removerItem();
        System.out.println( controle.listarItem());
        
        
    }
    
}
