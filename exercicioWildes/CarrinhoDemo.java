
package carrinhodemo;

import java.util.Scanner;

public class CarrinhoDemo {
 public static void main(String[] args) {
        
     Scanner javain = new Scanner(System.in);
     Carrinho carrinho = new Carrinho("Luiz", 24,6,2017);
     
    /*
   
     for(int i = 0;i < 5;i++ ){
         System.out.println("Entre com " + (i+1) + "/5: " );
         
         carrinho.inserirItem(javain.nextLine());
     }
     
     carrinho.exibe();

*/
     //Usando novo Método
     System.out.print("\nEntre com uma quantidade para adição: ");
     int qtd = javain.nextInt();
     //Limpar o buffer do teclado
     javain.nextLine();
     
     Carrinho carrinho1 = new Carrinho("Luiz", 24,6,2017,qtd);
     
   
     for(int i = 0;i < qtd;i++ ){
         System.out.println("Entre com " + (i+1) + "/" + qtd + ": " );
         
         carrinho1.inserirItem(javain.nextLine());
     }
     
     carrinho1.exibe();
    }
    
}
