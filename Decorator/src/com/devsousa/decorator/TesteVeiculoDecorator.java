
package com.devsousa.decorator;

/**
 *
 * @author Wildes Sousa
 */
public class TesteVeiculoDecorator {
    public static void main(String[] args) {
        
        Veiculo pas = new Passeio("Carro passeio");
        gerarRelatorio(pas);
        
        pas = new ArCondicionado(pas);
        gerarRelatorio(pas);
        
        pas = new DirecaoHidraulica(pas);
        gerarRelatorio(pas);
        
        pas = new Esportivo("BMW");
        gerarRelatorio(pas);
        pas = new RodaLigaLeve(20, pas);
        gerarRelatorio(pas);
        pas = new ArCondicionado(pas);
        gerarRelatorio(pas);
        
        pas = new DirecaoHidraulica(pas);
        gerarRelatorio(pas);
        
        pas = new BancoCouro(pas);
        gerarRelatorio(pas);
        
        
        
    }
    
    public static void gerarRelatorio(Veiculo v){
        System.out.println("Tipo do veiculo: " + v.getDescricao() + "\tPreço: " + v.preco()+"\n");
    }
}
