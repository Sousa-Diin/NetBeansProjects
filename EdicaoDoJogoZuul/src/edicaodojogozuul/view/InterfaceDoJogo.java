
package edicaodojogozuul.view;

import edicaodojogozuul.model.Comando;
import edicaodojogozuul.model.Jogo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Wildes Sousa
 */
public class InterfaceDoJogo implements Interacao{
    
    private Jogo jogo;
       
    
    private final JFrame telaPrincipal;
    
    private JPanel panelDisplay;
    private JPanel panelComandos;
    private JPanel panelCenas;
    private JPanel panelInOutDate;
    private JPanel panelInstrucoes;
    private JPanel panelCmdSetaUp;
    private JPanel panelCmdSetaCenter;
    private JPanel panelCmdSetaDown;
    
    private JButton irNorte;
    private JButton irSul;
    private JButton irOeste;
    private JButton irLeste;
    private JButton irNordeste;
    private JButton lutar;
    
    private JTextField recebeComando;
    
    private JLabel rotuloImageCenas;
    private JLabel rotuloDisplay;
    private JLabel rotuloComandos;
    private JLabel rotuloDicas;
    
    private JMenuItem itemMenuAjuda;
    private JMenuItem itemMenuComandos;
    private JMenuItem itemMenuEstatisticas;
    
    
   
    public InterfaceDoJogo(){
        
        this.jogo = jogo;
        telaPrincipal = new JFrame("LABIRINTO DE HOGWARTS");
        telaPrincipal.setSize(1060, 690);
        telaPrincipal.setMaximumSize(new Dimension(1060,690));
        telaPrincipal.setMinimumSize(new Dimension(980, 670));
        
        recebeComando = new JTextField();
       
        rotuloImageCenas = new JLabel("Mapa");
       
        rotuloDisplay = new JLabel("DISPLAY");
        rotuloComandos = new JLabel("COMANDOS");
        /*Tirar os parametros qnd for compilar em uma IDE
        irSul = new JButton("Sul");
        irNorte = new JButton("Norte");
        irOeste = new JButton("Oeste");
        irNordeste = new JButton("Nordeste");
        irLeste = new JButton("Leste");*/
        irSul = new JButton();
        irNorte = new JButton();
        irOeste = new JButton();
        irNordeste = new JButton();
        irLeste = new JButton();
        lutar = new JButton("L");
        
       
        montarMenu();
        montarTela();
        //montarEntraSaidaDados();
       /**
        * Ações dos botões
        */ 
        itemMenuAjuda.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    formataTexto(rotuloDicas, "Kit vidas [10]");
                    
                }
            }
        );
        itemMenuEstatisticas.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                   formataTexto(rotuloDicas, "opção indisponivel");
                }
            }
        );
        itemMenuComandos.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    Comando comando;
                                         
                        
                    formataTexto(rotuloDicas, "opção indisponivel");
                   
                }
            }
        );
        irNorte.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                   
                    recebeComando.setText("IR NORTE");
                }
            }
        );
        irNordeste.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    recebeComando.setText("IR NORDESTE");
                }
            }
        );
        irSul.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    recebeComando.setText("IR SUL");
                }
            }
        );
        irLeste.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    recebeComando.setText("IR LESTE");
                }
            }
        );
        irOeste.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    recebeComando.setText("IR OESTE");
                }
            }
        );
        
        lutar.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    recebeComando.setText("LUTAR COM VALDEMOR");
                }
            }
        );
            
    }
    
    public JLabel formataTexto(JLabel rotulo, String str){
        rotulo.setFont(new java.awt.Font("SansSerif", 1, 24));
        rotulo.setSize(90, 150);
        rotulo.setText(str); 
        
        return rotulo;
    }
    
    public void montarTela(){
        telaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        telaPrincipal.setLayout(new BorderLayout());
      
        panelInstrucoes = new JPanel();        
        telaPrincipal.add(panelInstrucoes, BorderLayout.NORTH);
        
        panelDisplay = new JPanel();
        rotuloDicas = new JLabel("Dicas");
        panelDisplay.setPreferredSize(new Dimension(250,Integer.MAX_VALUE));
        panelDisplay.setLayout(new BoxLayout(panelDisplay, BoxLayout.Y_AXIS));
        panelDisplay.setBackground(new java.awt.Color(153, 153, 153));
        rotuloDisplay.setForeground(new java.awt.Color(255, 255, 255));
        rotuloDisplay.setFont(new java.awt.Font("SansSerif", 1, 24));
        panelDisplay.add(rotuloDisplay);
        panelDisplay.add(rotuloDicas);
        telaPrincipal.add(panelDisplay, BorderLayout.WEST);
        
        
        panelCenas = new JPanel();
        panelCenas.setLayout(new FlowLayout());
        //Apenas em IDE 
        rotuloImageCenas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/poterOutsideCastell.jpeg")));
        panelCenas.add(rotuloImageCenas);
        telaPrincipal.add(panelCenas, BorderLayout.CENTER);
        
        
        panelComandos = new JPanel();
        panelCmdSetaUp = new JPanel();
        panelCmdSetaCenter = new JPanel();
        panelCmdSetaDown = new JPanel();
        
        
        panelComandos.setBackground(new java.awt.Color(153, 153, 153));
        rotuloComandos.setForeground(new java.awt.Color(255, 255, 255));
        rotuloComandos.setFont(new java.awt.Font("SansSerif", 1, 24));
        
        //Descomentar essa as cincos linhas seguinte qnd for complilar em uma IDE
        irNorte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/arrow_up.png")));
        irNordeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/arrow_right.png")));
        irOeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/arrow_left.png")));
        irLeste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/arrow_right.png")));
        irSul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edicaodojogozuul/img/arrow_down.png")));
        
        panelCmdSetaUp.setLayout(new GridLayout(1, 3));
        panelCmdSetaCenter.setLayout(new GridLayout(1, 3));
        panelCmdSetaDown.setLayout(new GridLayout(1, 3));
        
        panelComandos.add(rotuloComandos);
        
        panelCmdSetaUp.add(irNorte);
        panelComandos.add(panelCmdSetaUp);
        
        panelCmdSetaCenter.add(irOeste);
        panelCmdSetaCenter.add(lutar);
        panelCmdSetaCenter.add(irLeste);
        panelComandos.add(panelCmdSetaCenter);
        
        panelCmdSetaDown.add(irSul);
        panelComandos.add(panelCmdSetaDown);
        
        
       // panelComandos.add(irNordeste);
       
        
        panelComandos.setPreferredSize(new Dimension(250, Integer.MAX_VALUE));
        panelComandos.setLayout(new BoxLayout(panelComandos, BoxLayout.Y_AXIS));
        telaPrincipal.add(panelComandos, BorderLayout.EAST);
        
        panelInOutDate = new JPanel();
        panelInOutDate.setLayout(new FlowLayout());
       
        panelInOutDate.setLayout(new BoxLayout(panelInOutDate, FlowLayout.CENTER));
        panelInOutDate.setPreferredSize(new Dimension(Integer.MAX_VALUE, 200));
        panelInOutDate.add(recebeComando);
        telaPrincipal.add(panelInOutDate, BorderLayout.SOUTH);
        
        
        telaPrincipal.pack();
    }
    
    public void montarMenu(){
        JMenuBar barraMenuInstrucoes = new JMenuBar();
        JMenu menuIntrucoes = new JMenu("INSTRUÇÕES");
        itemMenuAjuda = new JMenuItem("Ajuda");
        itemMenuComandos = new JMenuItem("Comandos");
        itemMenuEstatisticas = new JMenuItem("Estatisticas");
        menuIntrucoes.setForeground(Color.blue);
        
        menuIntrucoes.add(itemMenuAjuda);
        menuIntrucoes.add(itemMenuComandos);
        menuIntrucoes.add(itemMenuEstatisticas);
        
        barraMenuInstrucoes.add(menuIntrucoes);
        telaPrincipal.setJMenuBar(barraMenuInstrucoes);
        
        
    }
    
   /* public void montarEntraSaidaDados(){
        panelInOutDate = new JPanel();
      
        panelInOutDate.setPreferredSize(new Dimension(900, 150));
        inOutComando.setSize(890, 130);
        panelInOutDate.add(inOutComando);
        telaPrincipal.add(panelInOutDate, BorderLayout.SOUTH);
    }*/
    
    public void exibir(){
        telaPrincipal.setVisible(true);
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void observar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void coletar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void lutar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void irAmbiente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void acessorios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void instrucoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
