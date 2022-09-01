
package com.devsousa.decorator;

/**
 *
 * @author devsousa
 */
public class RodaLigaLeve extends Acessorios{

    private int aro;

    public RodaLigaLeve(int aro, Veiculo v) {
        super(v);
        this.aro = aro;
    }

    public int getAro() {
        return aro;
    }
  
    @Override
    public double preco(){
        double valor_final = getVeiculo().preco();
        if(aro == 13){
            valor_final += 2100;
        }else if(aro == 17){
            valor_final += 3200;
        }else if(aro == 20){
            valor_final += 4090;
        }else{
            valor_final += 5100;
        }
        return valor_final;
    }    
    
}
