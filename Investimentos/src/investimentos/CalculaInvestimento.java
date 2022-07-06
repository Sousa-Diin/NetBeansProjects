package investimentos;
public class CalculaInvestimento {
    
    //Atributos
    String tipo;
    String investidor;
    int valor;
    
    
    //Construtor Poupança
    CalculaInvestimento(int umValor, String umTipo, String umInvestidor ){
       valor= umValor;
       tipo = umTipo;
       investidor = umInvestidor;
    }
    
    //Construtor Renda Variavel
    CalculaInvestimento(String umTipo, String umInvestidor, int umValor){
      tipo = umTipo;
      investidor = umInvestidor;
      valor= umValor;
    }
    
    //Métodos de consultas
    String getTipo(){
        return tipo;
    }
    
    String getInvestidor(){
        return investidor;
    }
    
    int getValor(){
        return valor;
    }
    
    void exibeInvestidores(){
        System.out.println("TABELAS DE INVESTIDORES");
        System.out.println("");
        System.out.println("Nome investidor: "+ this.getInvestidor());
        System.out.println("Tipo de investimento: " + this.getTipo());
        System.out.println("Valor investido: "+ this.getValor());
        
    }
}
