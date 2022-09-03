
package com.devsousa.singleton;

/**
 *
 * @author Wildes Soua
 */
public class MinhaClasse {
    private static MinhaClasse instanciaUnica;
    private String name;
    private int id;

    /**Bug no PP sington remember always of let constructor private*/
    public MinhaClasse() {}
    
    //private MinhaClasse(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void getDescricao(){
        System.out.printf("%n%-10s %-6s%n\n%-10s %-6d","Nome","ID",getName(),getId());
    }

    public static MinhaClasse getInstance() {
        if(instanciaUnica == null){
            instanciaUnica = new MinhaClasse();
        }
        return instanciaUnica;
    }
    
    
}
