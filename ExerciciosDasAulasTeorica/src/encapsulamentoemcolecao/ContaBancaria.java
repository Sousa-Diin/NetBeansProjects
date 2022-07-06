package encapsulamentoemcolecao;
class ContaBancaria {
    private int numero;
    private String nome;
    private float saldo;

    //Construtor Padrão
    public ContaBancaria(){}
    
    public ContaBancaria(int numero, String nome, float saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
    
    //@Override
    public String Saldo() {
        return String.format("R$%.2f", saldo);
    }
    
    public void depositar(float quantia){
       saldo += quantia; 
    }
    
    public void sacar(float quantia){
        if(getSaldo()>= quantia){
            saldo -= quantia;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
}
