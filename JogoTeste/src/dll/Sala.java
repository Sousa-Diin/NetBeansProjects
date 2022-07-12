package dll;

/**  @author devsousa */
public  class Sala extends Comodos{

	protected boolean open;
	protected boolean locked;
	protected String suprise;
	protected static String key;
	protected Jogador player;
	
	public Sala(Jogador jogador){
		//todos comodos inicializam c/portas fechadas e ou trancada
		player = new Jogador();
		open = false;
		locked = true;
		suprise = " ";
		key = "chaveTest";		
	
	}
	
	public static String getKey(){
            return key;
	}
	
	public static String abrir (String key){
            if (getKey().equals(key))
		return "Entrando...";
            return "Acess denied!";
	}
	public void fechar(){
            System.out.println("Saindo...");
	}

    @Override
    public String toString() {
        return "Sala{" + "open=" + open + "\n, locked=" + locked + "\n, suprise=" + suprise + "\n, player=" + player + '}';
    }
        
        
}
