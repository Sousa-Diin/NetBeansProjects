
package edicaodojogozuul.model;

/**
 *
 * @author Wildes Sousa
 */

/**
 * 
 * @author Wildes Sousa
 * Classe Utilitaria do Jogo
 * 
 * @return void - Exibe instruções e comandos do jogo
 * 
 */
public final class Instrucoes {

    /**
     * @return Void - Retorna os comandos do jogo e exemplos de uso
     */
    public static void exibirComandos(){
        
        System.out.println("		    COMANDOS E INSTRUÇOES ");
        System.out.println("		    CONTROLOS DEFINIDOS*");
        System.out.println("");
        System.out.println("_______________________________________________________");
        System.out.println("SAIR DO AMBIENTE........................: ir [OPÇÃO] ");
        System.out.println("EXEMPLO:");
        System.out.println("usage...................................: ir leste");
        System.out.println("SAIDAS POSSIVEIS => LESTE, OESTE, NORTE, SUL, NORDESTE;");
        System.out.println("_______________________________________________________");
        System.out.println("OBSERVAR AMBIENTE.......................: obseravr");
        System.out.println("usage...................................: observar");
        System.out.println("_______________________________________________________");
        System.out.println("VER MOCHILA.............................: mochila ");
        System.out.println("usage...................................: mochila");
        System.out.println("_______________________________________________________");
        System.out.println("PEGAR...................................: pegar");
        System.out.println("usage...................................: pegar");
        System.out.println("PS: Pega a varinha caso esteja no ambiete");
        System.out.println("_______________________________________________________");
        System.out.println("USAR ITEM...............................: usar [OPÇÃO]  ");
        System.out.println("EXEMPLO:");
        System.out.println("ABRIR MAPA..............................: usar mapa");
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        System.out.println("ATAQUE..................................: L  ");
        System.out.println("EXEMPLO:");
        System.out.println("LUTAR COM VALDEMOR......................: l");
        System.out.println("_______________________________________________________");
        System.out.println("_______________________________________________________");
        System.out.println("USAR ITEM...............................: usar [OPÇÃO]  ");
        System.out.println("EXEMPLO:");
        System.out.println("ABRIR MAPA..............................: usar mapa");
        System.out.println("_______________________________________________________");
        System.out.println("");						
        System.out.println(" *Os controlos nesta lista são as opções definidas/recomendadas. Portanto não pode ser alterados.");
        System.out.println("__________________________________________________________________________________________________________");
        
    }
    /**
     * @return void - retorna as estatísticas do jogo, bem com, itens e suas utilidades 
     *                e estrategias do mesmo.
     */
    public static void exibirEstatisticas(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("		   ESTATÍSTICA E EQUIPAMENTOS ");
        System.out.println("");
        System.out.println("PREPARA-TE PARA A AVENTURA");
        System.out.println("");
        System.out.println("O jogador inicia com <10> vidas e <4> item que poderam auxilia-lo no jogo, os itens são:");
        System.out.println("	> mapa do maroto............... exibir mapa do jogo;");
        System.out.println("	> capa invisivél............... passar pelos ambientes sem decrementar a vida;");
        System.out.println("	> pedra filosófal.............. ajudar na saida do castelo após ter derrotado valdemor;");
        System.out.println("	> vassoura voadoura............ dar saltos pelos ambientes. Ps: segunda fase,");
        System.out.println("	> vira tempo................... adicinar <3> vidas ao jogador.");
        System.out.println("	");
        System.out.println(" WARNING: caso a vida do jogador chegue em 3 o vira-tempo e acinado de for automatica,");
        System.out.println(" 		  apartir dai uma nova lógica e estabelecida, podendo o jogador ficar com 1 ou 3 vidas ");
        System.out.println("		  nesse caso ao se deparar com novos inimigos caso não sejam abatidos seus itens são perdido");
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("			    LUTA FINAL");
        System.out.println("	");									  
        System.out.println(" A entrada do jogador no ambiente omde os seus amigos estão sendo mantidos preso pelo Valdemor só vai ");
        System.out.println(" ser permitido de posse da varinha das varinhas. E sua vida será a quantidade de chances de combate.");
        System.out.println(" ");
        System.out.println(" 			  ULTIMA MISSÃO");
        System.out.println(" Caso o jogador ganhe a luta a saida do jogo será liberada, o jogador tera duas formas de sair sendo elas:");
        System.out.println(" ");
        System.out.println(" 	> usando a pedra filosofal, que dará um salto para o ambiente em questão, terminando o jogo;");
        System.out.println(" 	> voltar pelos ambientes, e chegar ao Quintal Principal.");
        System.out.println(" 	");
        System.out.println(" 			  FIM DE JOGO!!!");
        System.out.println("  ");
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("© 2011 - 2016 Todos os direitos reservados.Michael Kölling and David J. Barnes ");
        System.out.println("© 2022 - (Modificado por Wildes Sousa)");
        System.out.println("@version 2.1-22");
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("________________________________________________________________________________________");
        
    }
    /**
     * @return void - Exibe na tela o mapa do jogo caso o jogador esteja de posse do item responsavél pelo mesmo.
     */
    public static void exibirMapa(){
         System.out.println("\n____________________________________________________________________________________________________ "); 
            System.out.println("|                      |                       |                         |                          |");
            System.out.println(":                      ¨                       ¨                         ¨                          |");
            System.out.println(":       ENTRADA                TORRE                 CASA CORVINAL              SALA PRECISA        |");
            System.out.println("T       PRINCIPAL      T        DAS            T                         T                          |");
            System.out.println("|                      |     ESCADARIAS        |                         |                          |");
            System.out.println("|                      |__________       ______|_________________________|__________________       _|"); System.out.println("|                      |                           |                        |                       |"); System.out.println("|                      |                           |                        |                       |");
            System.out.println("|______________________|                           |                        |                       |");
            System.out.println("|                      |                           ¨          CASA          ¨      BANHEIRO         |");
            System.out.println("|                      ¨          SALÃO                     SONSERINA                 DA            |");
            System.out.println("|                               PRINCIPAL          T                        T        MURTA          |");
            System.out.println("|         CASA                                     |                        |                       |");
            System.out.println("|      GRIFINORIA      T                           |________________________|________        _______|");
            System.out.println("|                      |                           |                         |       ********       |");
            System.out.println("|                      |                           |         CASA            |        CAMÂRA        |");
            System.out.println("|                      |                                   LUFA-LUFA         |        SECRETA       |");
            System.out.println("|                      |                                                     |                      |");
            System.out.println("|______________________|___________________________T_________________________|______________________|");
            System.out.println("");
            System.out.println("  |   ");         
            System.out.println("  ¨    PORTAS");
            System.out.println("  ");
            System.out.println("  T\n");

    }
    
}
