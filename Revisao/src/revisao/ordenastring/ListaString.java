
package revisao.ordenastring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author devsousa
 */
public class ListaString {
    private String palavras;
    private ArrayList<String> listaPalavras;

    public ListaString() {
        listaPalavras = new ArrayList<>();
    }
    
    public void adicionarPalavra(){
      
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com 10 palavras: ");
        for(int palavra = 0; palavra < 10; palavra++){
            System.out.println("\n" + palavra + " Palavra:");
            listaPalavras.add(sc.nextLine());
        }
        
    }
    
    Comparator<String> condicao = new Comparator<>(){
        @Override
        public int compare(String str, String str1) {
            return str.compareTo(str1);
        }
        
    };
    
    public void showListaPalavras(){
        listaPalavras.sort(condicao);
        System.out.println("\n\nITEMS ORDENADOS");
        for (String s : listaPalavras){
            System.out.println(s + " ");
        }
    }
}
