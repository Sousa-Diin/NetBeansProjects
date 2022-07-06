package pilha;

import java.util.Deque;
import java.util.LinkedList;

/** @author wildes */
public class Principal {
    public static void main(String[] args){
       
        Deque https = new LinkedList<>();
        
        //cria e inicia a primeira navegação
        AbaDeNavegacao nav = new AbaDeNavegacao("Como programmar em Java");
        https.addFirst(nav);
        
        https.offerFirst(new AbaDeNavegacao("youtube.com"));
        
        //System.out.println("Site: " + https.getFirst());
        
        //cria uma nova aba de navegação [+]
        https.offerFirst(AbaDeNavegacao.getNovaAba("Campus Virtual Ufla"));
        
        //Remoções
        /*String site = https.removeFirst().toString();
        System.out.println("O último site visitado foi: " + site);
        site = https.removeFirst().toString();
        System.out.println("Antes dele foi: " + site);
        site = https.removeFirst().toString();
        System.out.println("Antes dele foi: " + site);
        */    
        
        //Loop para remover as urls
        while(!https.isEmpty()){
           String remocao = https.removeFirst()+"";
            System.out.println("Links removidos\n" + remocao);
        }
    }
}
