package pilha;
/** @author wildes */
public class AbaDeNavegacao {
    
    private String url;
    private static AbaDeNavegacao novaAba;

    public AbaDeNavegacao(String url) {
        this.url = url;
    }

    //Métodos acessores
    public String getUrl() {
        return url;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    public static AbaDeNavegacao getNovaAba(String site) {
        return novaAba = new AbaDeNavegacao(site);
    }


    @Override
    public String toString() {
        return "PaginaDeNavegacao{" + "url=" + url + '}';
    }
    
    
}
