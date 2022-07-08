package fila;

import java.util.LinkedList;
import java.util.Queue;

/** @author wildes */
public class Principal {
    public static void main (String[] args){
        
        Queue<Mamiferos> colecaoDeMamiferos = new LinkedList<>();
        
        Mamiferos m = new Mamiferos("cachorro", "presa");
        Mamiferos m1 = new Mamiferos("onça", "predador");
        Mamiferos m2 = new Mamiferos("camelo", "presa");
        
        colecaoDeMamiferos.offer(m1);
        colecaoDeMamiferos.offer(m);
        colecaoDeMamiferos.offer(m2);
        
        System.out.println("Tamanho da coleção de mamiferos: " + colecaoDeMamiferos.size());
        Mamiferos coletaM = colecaoDeMamiferos.remove();
        System.out.println(colecaoDeMamiferos.peek().getNome());
        
        colecaoDeMamiferos.offer(new Mamiferos("canguru", "predador"));
        colecaoDeMamiferos.offer(new Mamiferos("tigre", "predador"));
        System.out.println("Tamanho da coleção de mamiferos: " + colecaoDeMamiferos.size());
        
        coletaM = colecaoDeMamiferos.poll();
        System.out.println("\n\nRemoção de mamifero: " + coletaM.toString());
        System.out.println("Tamanho da coleção de mamiferos: " + colecaoDeMamiferos.size());
        colecaoDeMamiferos.clear();
        
        System.out.format("\nPrimeiro mamifero: %s\n\nSegundo mamifero: %s\n\nTerceiro mamifero: %s\n\n", m.imprimir(), m1.toString(), m2.toString());
        System.out.println(colecaoDeMamiferos.isEmpty());
        System.out.println("Tamanho da coleção de mamiferos: " + colecaoDeMamiferos.size());

    }
}
