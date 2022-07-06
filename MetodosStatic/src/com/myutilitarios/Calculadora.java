package com.myutilitarios;

import java.util.Scanner;
/**
 *
 * @author wildes
 */
 public class Calculadora {
  
    public static double somar(){
        
        Scanner scanner = new Scanner(System.in);
        int opcao, n1, n2;
        double resultado = 0.0;
        
        System.out.println("##########CALCULADORA#########");
        System.out.println("\nQual operacão vc deseja realizar");
        System.out.println("1-[+]\n2-[-]\n3-[x]\n4-[/]\n");
        
        System.out.println("op ->");opcao = scanner.nextInt();
        
        System.out.print("\nPrimeiro número: ");
        n1 = scanner.nextInt();
        
        System.out.print("\nSegundo número: ");
        n2 = scanner.nextInt();
        switch(opcao){
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = n1 / n2;
                break;
            default:
                System.out.println("opcão invalida");
                
        }
        
        return resultado;
    }
}
