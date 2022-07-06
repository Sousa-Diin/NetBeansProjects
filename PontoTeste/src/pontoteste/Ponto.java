
package pontoteste;

public class Ponto {
   public float x;
   public float y;
   
   //Construtor
    Ponto (float x, float y){
        this.x = x;
        this.y = y;
    }
    
    String getPonto (){
        return String.format(" As coordenadas (x,y) do ponto são: (%.1f ; %.1f)\n" , this.x ,this.y );
    }
    
    double calculaDistancia (double x, double y){
       
        return Math.pow((Math.pow(this.x - x,2) + Math.pow(this.y -y,2)), 0.5);
    }
}
