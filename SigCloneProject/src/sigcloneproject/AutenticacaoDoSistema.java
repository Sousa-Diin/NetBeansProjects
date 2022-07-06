package sigcloneproject;

import java.util.Scanner;

/** @author wildes */
public class AutenticacaoDoSistema {
    
    private String login;
    private String password;
    private boolean status = false;

    //default
    public AutenticacaoDoSistema(){
        
    }
    //Method for create and authenticate
    public AutenticacaoDoSistema(String login, String password) {
        this.login = login;
        this.password = password;
        status = true;
    }
    
    
    
    //method for remember Login
    
    
    private String getPassword(){
        return password;
    }
    
    private void setPassword (String newPassword){
        password = newPassword;
    }
    
    public String setRecuperarSenha(String cpf){
     
       boolean confirma = true;
       while(cpf.equals("11870274644") && confirma){//ERRO! não entra no laço
            String newPass, confPass;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite uma nova senha: ");
            newPass = entrada.nextLine();

            System.out.print("\nConfirmar senha: ");
            confPass = entrada.nextLine();

                if (newPass.equals(confPass)){
                    setPassword(confPass);
                    return String.format("\nSenha alterada com sucesso ");
                    
                }else{
                    confirma = false;
                } 
       }        
       return String.format("\nNão foi possivel confiramar a autenticidade.");
       //OR
       /**publica um codigo randomico por email
       * For example enter with some email and 
       * receve a code of confimation for create
       * a new password
       */
    }
    
    public void setCancelLogin (){
        
        login = "loginCancelado";
        password = "passworsCancelado";
        status = false;
        
    }

    @Override
    public String toString() {
        return "AutenticacaoDoSistema{" + "login criado com sucesso" + 
                "\n,login=" + login + "\n, Ativo= " + status + '}';
    }
}
