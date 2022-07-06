
package alunoteste;

public class Aluno {
        private String nome;
	private int idade;
	private float ativo;
	
	//Construtor
	public Aluno(String nome, int idade, float ativo){
		this.nome = nome;
		this.idade = idade;
		this.ativo = ativo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public float getAtivo(){
		return this.ativo;
	}
	
	public float setAddAtivo(float valor){
		return ativo += valor;
	}
	
	public void exibe(){
		System.out.println("\nDADOS DO ALUNO");
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.printf("Ativos: R$%.2f\n",getAtivo());
	}
}
