package dll;

/**  @author devsousa */
public class MeuJogo {
    
    public static void main(String[] args){
	
		Jogador jogador = new Jogador("Wildes");
		Sala sala = new Sala(jogador);
		
		System.out.println("Óla, jogador: " + jogador + " você está na [Sala].");
		
		sala.abrir("chaveTest");
                
		
		
		
	}
}
