/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.view;

import java.awt.GridLayout;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author devsousa
 */
public class Calculator {
    
    private JFrame windowsCalcuator;
    private JButton btnUm;
    private JButton btnZero;   
    private JButton btnDois;
    private JButton btnTres;
    private JButton btnQuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnSete;
    private JButton btnOito;
    private JButton btnNove;
    
    private JButton btnSomar;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;
    private JButton btnDividir;
    private JButton btnDot;
    private JButton btnApagar;
    private JButton btnResultado;
    private JButton nulo;
    
    private TextField display;
    
    public Calculator(){
        
        windowsCalcuator = new JFrame("CALCULATOR");
        btnUm = new JButton("1");
        btnDois = new JButton("2");
        btnTres = new JButton("3");
        btnQuatro = new JButton("4");
        btnCinco = new JButton("5");
        btnSeis = new JButton("6");
        btnSete = new JButton("7");
        btnOito = new JButton("8");
        btnNove = new JButton("9");
        btnZero = new JButton("0");
        nulo = new JButton("");
        
        btnSomar = new JButton("+");
        btnSubtrair = new JButton("-");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnDot = new JButton(".");
        btnResultado = new JButton("=");
        btnApagar = new JButton("x");


        
        
        montarWindows();
    }
    
    private void montarWindows(){
        
        windowsCalcuator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windowsCalcuator.setLayout(new GridLayout(3,4));
        windowsCalcuator.setSize(500,300);
     
     
        windowsCalcuator.add(btnSete);
        windowsCalcuator.add(btnOito);
        windowsCalcuator.add(btnNove);  
        //windowsCalcuator.add(btnDividir);
        //windowsCalcuator.add(nulo);
        
        windowsCalcuator.add(btnQuatro);
        windowsCalcuator.add(btnCinco);
        windowsCalcuator.add(btnSeis);
       // windowsCalcuator.add(btnMultiplicar);
       
        windowsCalcuator.add(btnUm);
        windowsCalcuator.add(btnDois);
        windowsCalcuator.add(btnTres);
       
       // windowsCalcuator.add(btnZero);
    }
    
    public void show(){
        windowsCalcuator.setVisible(true);
    }

    

    
}
