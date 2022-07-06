package sigcloneproject;

//import java.util.Scanner;

/** @author wildes  */
public class  Endereco {
    
    // who has an address -> Pessoa or immobile
    // Atributos
    private String pais;
    private String estado;
    private String municipio;
    private String bairro;
    private String longradouro;
    private String cep;
    private int numero;


    //Métodos de acesso
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLongradouro() {
        return longradouro;
    }

    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
   /* 
    public String setAlteraDadosPessoais(){
        
        Scanner entrada = new Scanner(System.in);
        char op =(char) entrada.nextInt();
        entrada.nextLine();
        switch(op){
            case '1':
                setPais(entrada.nextLine());
                break;
            case '2':
                break;
            case '3':
                break;
            case '4':
                break;
            case '5':
                break;
            case '6':
                break;
            default:
                System.out.println("opcão invalida.");
        }
        return  String.format("opcão invalida.");
    }*/


    public String imprimir() {
        return "Endereco{" + "pais=" + pais + 
                "\n, estado=" + estado + "\n, municipio=" + municipio + 
                "\n, bairro=" + bairro + "\n, longradouro=" + longradouro + 
                "\n, cep=" + cep + "\n, numero=" + numero + '}';
    }   
}
