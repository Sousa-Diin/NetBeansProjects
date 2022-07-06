
package carrinhodemo;

import java.util.Scanner;

public class CarrinhoDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner javain = new Scanner(System.in);//Objeto entrada de dados
        
        Carrinho carrinho = new Carrinho("Luiz", 24,6,2017);//Instancia da classe 'Carrinho'

       
        //Laco p/ percorrer o vetor de insersão
        for(int i = 0;i < 5;i++ ){
            System.out.println("Entre com " + (i+1) + "/5: " );

            carrinho.inserirItem(javain.nextLine());
        }

        carrinho.exibe();//Mostra Info

   
        //Usando novo Método qtd de Itens
        System.out.print("\nEntre com uma quantidade para adição: ");
        int qtd = javain.nextInt();
        
        //Limpar o buffer do teclado
        javain.nextLine();

        Carrinho carrinho1 = new Carrinho("Wildes", 23,6,2022,qtd); //Nova instancia da Class

        // Novo Laco que percorre o vetor atributo 
        for(int i = 0;i < qtd;i++ ){
            System.out.println("Entre um item:" + (i+1) + "/" + qtd + ": " );

            carrinho1.inserirItem(javain.nextLine());//Vetor recebe novo dados 
        }

        carrinho1.exibe();
        System.out.println("Compra concluida com sucesso.\nVolte sempre!");
       
    }
    
}
