
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
   
    public static void main(String[] args) {
        Date relogio = new Date();
        Locale currentLocale = Locale.getDefault();
      
        Toolkit tela = Toolkit.getDefaultToolkit();
        
        
        Dimension tamTela = tela.getScreenSize();
        currentLocale.getDisplayLanguage();
        
        System.out.println("A hora atual é: ");
        System.out.println(relogio.toString());
        
        System.out.println("Esse dispositivo eseá configurado na linguagem : " + currentLocale);
        
        System.out.println("O tamanho da tela deste dispositivo é: " + tamTela.width + " X " + tamTela.height);
    }
    
}
