package sigcloneproject;

import java.util.Date;

/** @author wildes  */
public class Discente extends Pessoa {
    private static String matricula;
    private String curso;
    private String senha;
    private AutenticacaoDoSistema meuLogin;
    public static int idDiscente;
    private Date newMatricula;
    
    //construtor padrão
    public Discente(){
        meuLogin = new AutenticacaoDoSistema();
      //  endereco = new Endereco();
    }

    public Discente(String curso, String senha, String nome, int idade, char sexo, String cpf, String rg, String tel, String email) {
        super(nome, idade, sexo, cpf, rg, tel, email);
        idDiscente =0;
        setMatricula("2022" + "22");
        this.curso = curso;
        this.senha = senha;
        meuLogin = new AutenticacaoDoSistema(email,senha);
    }
    
    

    //métodos de acesso

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = (matricula + idDiscente);
         idDiscente++;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public AutenticacaoDoSistema getMeuLogin() {
        return meuLogin;
    }

    public void setMeuLogin(AutenticacaoDoSistema meuLogin) {
        this.meuLogin = meuLogin;
    }

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
    
    
    //Impressão de Dados do Discente

    
    public String dadosDoDiscente() {
        return "Discente{" + "matricula=" + matricula + 
                "\n, curso=" + curso + 
                "\n, senha=" + senha + 
                "\n, meuLogin=" + meuLogin + '}';
    }
    
    
}
