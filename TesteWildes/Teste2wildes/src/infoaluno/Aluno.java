package infoaluno;

import java.util.ArrayList;

/** @author aluno */
public class Aluno {
    
    private String nome;
    private String cat;
    private ArrayList <Integer> notas;
    private boolean verificaCat;
    private static int totAlunos = 0; // atributo da classe

    //construtor default
    public Aluno(){
        totAlunos++;
    }
    
    public Aluno(String nome, String cat) {
        
        this.nome = nome;
        this.cat = cat;
        notas = new ArrayList();
        totAlunos++;
        if (cat.equals("bolsista")){
            verificaCat = true;
        }
        else if (cat.equals("não bolsista")){
            verificaCat = true;
        }
        else{
            verificaCat = false;            
        }
        
    }
    //For teste
    public void setCat(String cat) {
        this.cat = cat;
    }
    //Return atributo da classe
    public static int getTotAlunos() {
        return totAlunos;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public String getCat() {
        return cat;
    }
    
    public void inserirNota(int nota){
       
       notas.add(nota);
        
    }
    
    //Teste
    public int exibeNotas(int item){
       
       return notas.get(item);     
      
    }

    public double rendimento() {
        double somaNota = 0;
        int i;
        for (i = 0; i < notas.size();i++){
             somaNota += notas.get(i);
        }
        return (somaNota / i);
    }
    
    public String studentSituation(){
       
        if(verificaCat){
           if(cat.equals("bolsista") && rendimento() >= 75)
            return "Regular";        
            if(cat.equals("não bolsista") && rendimento() >= 70)
                return "Regular";

            return "Desligado"; 
        }else{
             return "Desculpe não foi possivel exibir a situacão do aluno."
                + "\n\tERRO! categoria digitada foi [ " + cat + "], verifique se digitou correto.";
        }
           
    }    
    
}
