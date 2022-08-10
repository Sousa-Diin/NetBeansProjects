
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
        
        
        Item dvd1,dvd = new DVD("Michael","Moowalk", 2,false);
        
        Controle controle = new Controle();
        
        //controle.adicionarItem(new Cd("Ruck",10,"Roupa nova", 2,true ));
        controle.adicionarItem(new DVD("Michael","Moowalk", 2,true));
        controle.adicionarItem(new Cd("Bee Gens",1000,"As melhores", 50,true ));
        //controle.adicionarItem();
        controle.adicionarItem(dvd);
        
        dvd = new Cd("Ruck",10,"Roupa nova", 2,true  );
        controle.adicionarItem(dvd);
        dvd1 = new Cd("Ruck",10,"Roupa nova", 2,false  );
        controle.adicionarItem(dvd1);
        
        System.out.println("Teste de igualdade\n");
        if(dvd.equals(dvd1)){
            System.out.println(dvd.getDescricao()+"é igual a: \n\n"+ dvd1.getDescricao());
            System.out.println("Código HASH: \n" + dvd.hashCode() + " = " + dvd1.hashCode());
        }else{
            System.out.println("Código HASH: \n" + dvd.hashCode() + " = " + dvd1.hashCode());
            System.out.println("Objetos diferentes.\n");
            
        }
        controle.listarItem();
        controle.removerItem();
        //System.out.println( controle.listarItem());
        controle.listarItem();
        
        
    }
    
}
