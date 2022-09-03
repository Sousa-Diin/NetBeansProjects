
package com.devsousa.singleton;

/**
 *
 * @author Wildes Sousa
 */
public class TesteMinhaClasse {
    public static void main(String[] args) {
        MinhaClasse mc, mc1;
        mc = MinhaClasse.getInstance();
        
        
        mc1 =MinhaClasse.getInstance();
        mc1.setName("Joao"); mc1.setId(7);
        mc.setName("wildes"); mc.setId(28);
        mc.getDescricao();  System.out.println("Hashcode: " +mc.hashCode());
        mc1.getDescricao(); System.out.println("Hashcode: " +mc1.hashCode());
        
        MinhaClasse teste = new MinhaClasse();
            
        teste.setName("Teste"); teste.setId(52);
        teste.getDescricao();
        System.out.println("Hashcode: " + teste.hashCode());
        
        MinhaClasse teste1 = new MinhaClasse();
            
        teste1.setName("Teste1");teste1.setId(101);
        teste1.getDescricao();
        System.out.println("Hashcode: " + teste1.hashCode());
    }
}
