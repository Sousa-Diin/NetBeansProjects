
package contabancaria;

public class Cliente {
    private String banco;//nome do Banco
    private String titular;//nome do correntista 
    private String tipoConta;//Corrente ou Poupança
    private String agencia;/*número da agencia*/
    private String conta;/*número da comnta */
    private String dvConta;//digito de verificação da conta
    
    //construtor Padrão
    public Cliente(){
        
    }
    
    //Contrutor c/ parametros full
    public Cliente(String banco, String titular,String tipoConta, String agencia, String conta, String dvConta){
        this.banco = banco;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.agencia = agencia;
        this.conta = conta;
        this.dvConta = dvConta;
    }

    //método acessores
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTilular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getDvConta() {
        return dvConta;
    }

    public void setDvConta(String dvConta) {
        this.dvConta = dvConta;
    }  
    
}
