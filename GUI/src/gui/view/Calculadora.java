
package gui.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author devsousa
 */
public class Calculadora {
    
    private JLabel rotuloN1;
    private JLabel rotuloN2;
    private JFrame janela;
    
    private JButton somar;
    private JButton subtrair;
    private JButton multiplicar;
    private JButton dividir;
    
    public Calculadora(){
        janela = new JFrame("Calculadora");
        
        montaraJanela();
    }
    
    private void montaraJanela(){
        janela.setSize(500,100);
    }

    public void exibir(){
        janela.setVisible(true);
    }

}
