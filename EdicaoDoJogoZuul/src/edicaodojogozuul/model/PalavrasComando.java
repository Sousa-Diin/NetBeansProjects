
package edicaodojogozuul.model;

/**
 
 * Esta classe eh parte da aplicacao "Labirinto de Hogwarts".
 * "Labirinto de Hogwarts" eh um jogo de aventura muito simples e divertido, baseado em texto.  
 * 
 * Essa classe guarda uma enumeracao de todos os comandos conhecidos do
 * jogo. Ela eh usada no reconhecimento de comandos como eles sao digitados.
 *
 * Inspirado no jogo word of zuul de Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 * 
 * @author modificado por Wildes Sousa 
 * @version  2022 v1.22-1
 */

public class PalavrasComando
{
    // um vetor constante que guarda todas as palavras de comandos validas
    private static final String[] comandosValidos = {
        "ir", "sair", "ajuda", "observar", "pegar", "usar", "mochila"
    };

    /**
     * Construtor - inicializa as palavras de comando.
     */
    protected String PalavrasComando()
    {
        String comandos = "";
        for(String cmd : comandosValidos){
            comandos += cmd + " ";
        }
        return comandos;
    }

    /**
     * Verifica se uma dada String eh uma palavra de comando valida. 
     * @return true se a string dada eh um comando valido,
     * false se nao eh.
     */
    protected boolean ehComando(String umaString)
    {
        for(int i = 0; i < comandosValidos.length; i++) {
            if(comandosValidos[i].equals(umaString))
                return true;
        }
        // se chegamos aqui, a string nao foi encontrada nos comandos.
        return false;
    }
}
