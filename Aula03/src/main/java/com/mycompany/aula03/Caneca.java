
package com.mycompany.aula03;

public class Caneca {
    
    public String descricao;
    public String cor;
    private String material;
    private float value;
    protected boolean empty;
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setDescricao(String desc){
        this.descricao = desc;
    }
    
    public String getCor (){
        return this.cor;
    }
    
    public void setCor (String c){
        this.cor = c;
    }
    
    public String getMaterial (){
        return this.material;
    }
    
    public void setMaterial (String m){
        this.material = m;
    }
    
    public float getValue (){
        return this.value;
    }
    
    public void setValue (float v){
        this.value = v;
    }
    
    public boolean getEmpty (){
        return this.empty;
    }
    
    public void steEmpty (boolean e){
        this.empty = e;
    }
    
    public void exibe (){
        System.out.println("SOBRE A CANECA:");
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Cor: " + this.cor);
        System.out.println("Material: " + this.material);
        System.out.println("Value: " + this.value);
        System.out.println("Empty: " + this.empty);
    }
    
}
