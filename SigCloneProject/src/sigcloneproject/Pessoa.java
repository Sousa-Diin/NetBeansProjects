package sigcloneproject;


/**  @author wildes */
// CLASSE PROGENITORA
public abstract class Pessoa {
    
    //Especificação de {Reitor; Docente; Discente; Funcionario; Terceirizado ...}
    // Atributos 
     
    protected String nome;
    protected int idade;
    protected char sexo;
    protected String cpf;
    protected String rg;
    protected String tel;
    protected Endereco endereco;
    protected String email;
    
    //construct default
    public Pessoa(){
        endereco = new Endereco();
    }

    public Pessoa(String nome, int idade, char sexo, String cpf, String rg, String tel, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.email = email;
        endereco = new Endereco();
    }
    
    public Pessoa(String nome, int idade, char sexo, String cpf, String rg, String tel, String email, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.tel = tel;
        this.email = email;
        this.endereco = endereco;
    }
    
    
    
    //métodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Impressão de dados

    public String imprimirDadosPessoais() {
        return "Pessoa{" + "nome=" + nome + "\n, idade=" + idade + 
                "\n, sexo=" + sexo + "\n, cpf=" + cpf + "\n, rg=" + rg +
                "\n, tel=" + tel + "\n, endereco=" + endereco.imprimir() + 
                "\n, email=" + email + '}';
    }
    
    
}
