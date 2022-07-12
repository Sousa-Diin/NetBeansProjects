package dll;

/** * @author devsousa */
public class Jogador {

	private String nome;
	private int score;
	private int chances;
	
	//construct default
	public Jogador(){}
	
	public Jogador(String nome){
	
		this.nome = nome;
		this.chances = 30;
		score = 100;	
	
	}
	
	private void setScore(){}
	
	public int getScore(){
		return score;
	}
	
	
	public String getNome(){
		return nome;
	}
	
	/*private int setChaces(){
		
	}*/
	
	public int getChances(){
            return chances;
	}
        
        
	/*
	private atualiazaScore(){
		
	
	}
	
	public void entrar(){
	
		
	}
	
	public  String sair(){
		
	}*/

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + "\n, score=" + score + "\n, chances=" + chances + '}';
    }
}
