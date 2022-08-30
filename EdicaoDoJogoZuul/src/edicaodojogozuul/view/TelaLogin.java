
package edicaodojogozuul.view;


import java.awt.TextField;
import javax.swing.BoxLayout;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


/**
 *
 * @author devsousa
 */
public class TelaLogin {
    private JFrame janela;
    private JLabel lblLogin;
    private JLabel lblSenha;
    private TextField txtLogin;
    private JPasswordField pwfSenha;
    private JButton btnEntrar;

    public TelaLogin() {
        janela = new JFrame("Tela de Login");
        lblLogin = new JLabel("Login:");
        txtLogin = new TextField();
        lblSenha = new JLabel("Senha:", new ImageIcon("/edicaojogozuul.img/arrow_up.png") ,SwingConstants.LEFT);
        btnEntrar = new JButton("Entrar");
        pwfSenha = new JPasswordField();
        montarJanela();
    }

    private void montarJanela() {
        janela.setSize(400, 300);
        //janela.setLayout(new FlowLayout()); // Eixo horizontal
        janela.setLayout(new BoxLayout(janela.getContentPane(),BoxLayout.Y_AXIS));
        lblSenha.setForeground(new java.awt.Color(0, 0, 255));
        
        janela.add(lblLogin);
        janela.add(txtLogin);
        janela.add(lblSenha);
        janela.add(pwfSenha);
        janela.add(btnEntrar);
        
        janela.pack();
       
        
    }
    
    public void exibir(){
        janela.setVisible(true);
    }
    
}
