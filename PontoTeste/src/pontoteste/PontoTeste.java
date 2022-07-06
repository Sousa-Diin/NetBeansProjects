
package pontoteste;


public class PontoTeste {

    public static void main(String[] args) {
       
        Ponto ponto = new Ponto(1.5f,2.5f);
        
        System.out.printf(ponto.getPonto());
      
        
        System.out.printf("A distância entre os pontos são: %.2f\n",ponto.calculaDistancia(3.5,5.5));
        
        
        
    }
    
}
