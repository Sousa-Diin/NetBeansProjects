
package carrinhodemo;

public class Carrinho {
    
    private String cliente;
    private String[] carrinho;
    private int dia;
    private int mes;
    private int ano;
    private int contadorItens;
    
    public Carrinho(String cliente, int dia, int mes, int ano){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[5];
        contadorItens = 0;
    }
    //Construtor que permite a entrada de mais produtos
    public Carrinho (String cliente, int dia, int mes, int ano, int qtd){
        this.cliente = cliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        carrinho = new String[qtd];
        contadorItens = 0;
    }
    public String getCliente(){
        return cliente;
    }

    public void inserirItem(String produto){
        carrinho[contadorItens] = produto;
        contadorItens++;
    }
    
    public void exibe(){
        
        System.out.println("\nCliente: " + getCliente());
        System.out.printf("Data da compra: %d/%d/%d\n", dia, mes, ano);
        System.out.print("Item dos carrinho: ");
        for(int s = 0; s < 5; s++){
             System.out.print(carrinho[s]+ " ");
        }
        System.out.println("");
       
        
        
    }
    
   
}
