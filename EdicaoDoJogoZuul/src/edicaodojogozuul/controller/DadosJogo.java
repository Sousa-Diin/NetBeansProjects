
package edicaodojogozuul.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author devsousa
 */
public final class DadosJogo {
    private static List<Integer> acumulaVitorias;
    private static List<Integer> qtdVezesJogadas;

    public DadosJogo() {
        acumulaVitorias = new ArrayList<>();
        qtdVezesJogadas = new ArrayList<>();
    }
    
    public static int getVitorias(){
       return 0; 
    }

    public static List getQtdVezesJogadas() {
        return Collections.unmodifiableList(qtdVezesJogadas);
    }
    
    
}
