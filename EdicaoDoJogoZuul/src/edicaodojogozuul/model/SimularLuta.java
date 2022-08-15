
package edicaodojogozuul.model;

import java.util.Random;
import java.util.Scanner;

/**
 * Classe responsavel por simular uma luta e criar os rounds
 * @author Wildes Sousa
 */
public class SimularLuta {

    /**
     * Atributo responsavél pela duracão da simulacão
     */
    private long tempo_luta;    

    /**
     * Recebe um tempo de luta e amarzena no atributo da classe
     * @param tempo_luta 
     */
    public SimularLuta(long tempo_luta) {
        this.tempo_luta = tempo_luta;
        
    }
    /**
     * 
     * @return String - retorna o [nome do vencedor]
     * gera uma quantidade de socos aleatorio para cada lutador 
     * com base em um detenminado tempo de luta passado no construtor da classe
     * e ao final da simulacão retorna qual lutador socou mais.
     */
    
    private String simularLuta(){
        
       Random socos = new Random();
       
       int socosJogador = 0; 
       int socosAdversario = 0;
       String ganhador = "";
       
       int inicio = 0;
       while(inicio < tempo_luta ){
           socosJogador += socos.nextInt(8)+1;
           socosAdversario += socos.nextInt(8)+1;
           
           ganhador = (socosJogador > socosAdversario) ? "Jogador" : "Maquina" ;
           inicio++;
       }
        return ganhador;
    }
    /**
     * 
     * @param vidas
     * @return String - retorna o resultado final de cada round (nome do ganhador) -> Jogador or Maquina
     * @@code if (qtdVitoriaJogador > vitoriaMaquina) {return jogador;}
     */
    
    public String rounds(int vidas){
        
        String vencedorRounds;
        String winner;
        String ent;
        
        int rounds = vidas;
        int r= 1;
        
        int jogador = 0;
        int maquina = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(rounds > 0 ){
            System.out.println("Time: " + rounds);
            System.out.println("Round " + r++);
            System.out.print("\nPara lutar digite [L]");
            System.out.print("\nLutar -> ");
            ent = sc.nextLine();
            
            switch(ent){
                case "l":
                case "L":
                        /**
                         * @return - String (vencedor)
                         */
                        vencedorRounds = simularLuta();
                        
                        if (vencedorRounds.equals("Jogador")){
                            jogador++; //contabiliza a quanidade de rounds ganhos
                        }
                        else{
                            maquina++;
                        }
                        break;
                default:
                    System.out.println("Comando invalido...\n\tDa proxima vez tente l ou L. ");
                    vencedorRounds = "aguandando comando válido\n";
                    rounds++; // caso o comando seja invalido retorna a tentativa anterior
                    r--;// caso o comando seja invalido retorna ao round atual
            }
            
            System.out.printf("####Placar####\nJ: %d \t|\tM: %d\n", jogador, maquina);// vitorias dos lutadores
            
            System.out.println("Winner -> " + vencedorRounds + "\n"); //Se o comando for válido exibe o vencedor do round atual
            rounds--;
        }
        winner = jogador > maquina ? "Jogador" : "Maquina"; // retorna o vencedor por meio das qts de conquistas(rounds)
        return  winner;
    }    
}


