
package edicaodojogozuul.model;

import edicaodojogozuul.model.ambientes.BanheiroMurta;
import edicaodojogozuul.model.ambientes.CameraSecreta;
import edicaodojogozuul.model.ambientes.CasaCorvinal;
import edicaodojogozuul.model.ambientes.CasaGrifinoria;
import edicaodojogozuul.model.ambientes.CasaLufaLufa;
import edicaodojogozuul.model.ambientes.CasaSonserina;
import edicaodojogozuul.model.ambientes.EntradaPrincipal;
import edicaodojogozuul.model.ambientes.QuintalPrincipal;
import edicaodojogozuul.model.ambientes.SalaPrecisa;
import edicaodojogozuul.model.ambientes.SalaoPrincipal;
import edicaodojogozuul.model.ambientes.TorreDasEscadaria;

/**
 *
 * @author devsousa
 */
/**
 *  Essa eh a classe principal da aplicacao "World of Zull".
 *  "World of Zuul" eh um jogo de aventura muito simples, baseado em texto.
 *  Usuarios podem caminhar em um cenario. E eh tudo! Ele realmente
 *  precisa ser estendido para fazer algo interessante!
 * 
 *  Para jogar esse jogo, crie uma instancia dessa classe e chame o metodo
 *  "jogar".
 * 
 *  Essa classe principal cria e inicializa todas as outras: ela cria os
 *  ambientes, cria o analisador e comeca o jogo. Ela tambeme avalia e 
 *  executa os comandos que o analisador retorna.
 * 
 * @author  Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 */

public class Jogo 
{
    private Analisador analisador;
    private Ambiente ambienteAtual;
        
    /**
     * Cria o jogo e incializa seu mapa interno.
     */
    public Jogo() 
    {
        criarAmbientes();
        analisador = new Analisador();
    }

    /**
     * Cria todos os ambientes e liga as saidas deles
     */
    private void criarAmbientes()
    {
        Ambiente entrada_principal, salao_principal, camera_secreta, 
                torre_das_escadarias, grifinoria, sala_precisa, lufa_lufa,
                corvinal, sonserina, banheiro_murta , quintal_pricinpal;
      
        /**
         * Ambientes do Jogo: 

            Entrada Principal
            Salão Principal 
            Câmera Secreta
            Sala Precisa
            Torre das Escadarias
            Casa Grifinória
            Casa Lufa-lufa
            Casa Corvinal
            Casa Sonserina
            Banheiro murta

         */
        // cria os ambientes
        entrada_principal = new EntradaPrincipal("na entrada principal da escola de hogwarts",true);
        salao_principal = new SalaoPrincipal("no salão principal");
        camera_secreta = new CameraSecreta(3,"na câmara secreta");
        torre_das_escadarias = new TorreDasEscadaria("na torre das escadarias");
        grifinoria = new CasaGrifinoria("na casa grifinória");
        sala_precisa = new SalaPrecisa("na sala precisa");
        sonserina = new CasaSonserina("na casa sonserina");
        lufa_lufa = new CasaLufaLufa("na casa lufa-lufa");
        corvinal = new CasaCorvinal("na casa corvinal");
        banheiro_murta = new BanheiroMurta("no banheiro da murta");
        quintal_pricinpal = new QuintalPrincipal("no quintal principal, entre para a escola pra continuar.");
        
        
        // inicializa as saidas dos ambientes
        quintal_pricinpal.ajustarSaidas("leste",entrada_principal);
        
        entrada_principal.ajustarSaidas("oeste", quintal_pricinpal);
        entrada_principal.ajustarSaidas("leste", torre_das_escadarias);
        
        torre_das_escadarias.ajustarSaidas("oeste",entrada_principal);
        torre_das_escadarias.ajustarSaidas("sul", salao_principal);
        torre_das_escadarias.ajustarSaidas("leste",corvinal);
        
        salao_principal.ajustarSaidas("norte", torre_das_escadarias);
        salao_principal.ajustarSaidas("oeste", grifinoria);
        salao_principal.ajustarSaidas("nordeste", sonserina);
        salao_principal.ajustarSaidas("leste", lufa_lufa);
        
        grifinoria.ajustarSaidas("leste", salao_principal);
        
        lufa_lufa.ajustarSaidas("oeste", salao_principal);
        
        corvinal.ajustarSaidas("oeste", torre_das_escadarias);
        corvinal.ajustarSaidas("leste", sala_precisa);
        
        sonserina.ajustarSaidas("oeste", salao_principal);
        sonserina.ajustarSaidas("leste", banheiro_murta);
        
        sala_precisa.ajustarSaidas("oeste", corvinal);
        sala_precisa.ajustarSaidas("sul", banheiro_murta); // possivel mudança p/tornar o jogo mais desafiador
        
        banheiro_murta.ajustarSaidas("norte", sala_precisa);
        banheiro_murta.ajustarSaidas("oeste", sonserina);
        banheiro_murta.ajustarSaidas("sul", camera_secreta);
        
        camera_secreta.ajustarSaidas("norte", banheiro_murta);
        

        ambienteAtual = entrada_principal;  // o jogo comeca na entrada_principal
    }

    /**
     *  Rotina principal do jogo. Fica em loop ate terminar o jogo.
     */
    public void jogar() 
    {            
        imprimirBoasVindas();

        // Entra no loop de comando principal. Aqui nos repetidamente lemos
        // comandos e os executamos ate o jogo terminar.
                
        boolean terminado = false;
        while (! terminado) {
            Comando comando = analisador.pegarComando();
            terminado = processarComando(comando);
        }
        System.out.println("Obrigado por jogar. Ate mais!");
    }

    /**
     * Imprime a mensagem de abertura para o jogador.
     */
    private void imprimirBoasVindas()
    {
        System.out.println();
        System.out.println("Bem-vindo ao Labirinto de Hogwarts!");
        System.out.println("O Labirinto de Hogwarts eh um novo jogo de aventura, em que o Harry(jogador)\nprecisa resgatar seus amigos que lorde Valdemor capturou.");
        System.out.println("Digite 'ajuda' se voce precisar de ajuda.");
        System.out.println();
        
        System.out.println("Voce esta " + ambienteAtual.getDescricao());
    
       
        System.out.println("Saidas: " + ambienteAtual.getSaidas());
    }

    /**
     * Dado um comando, processa-o (ou seja, executa-o)
     * @param comando O Comando a ser processado.
     * @return true se o comando finaliza o jogo.
     */
    private boolean processarComando(Comando comando) 
    {
        boolean querSair = false;

        if(comando.ehDesconhecido()) {
            System.out.println("Eu nao entendi o que voce disse...");
            return false;
        }

        String palavraDeComando = comando.getPalavraDeComando();
        if (palavraDeComando.equals("ajuda")) {
            imprimirAjuda();
        }
        else if (palavraDeComando.equals("ir")) {
            irParaAmbiente(comando);
        }
        else if (palavraDeComando.equals("sair")) {
            querSair = sair(comando);
        }
        else if(palavraDeComando.equals("observar")){
            ambienteAtual.getDescricao(); // mostrar tudo que tem no ambiente
        }

        return querSair;
    }

    // Implementacoes dos comandos do usuario

    /**
     * Printe informacoes de ajuda.
     * Aqui nos imprimimos algo bobo e enigmatico e a lista de 
     * palavras de comando
     */
    private void imprimirAjuda() 
    {
        System.out.println("Voce esta perdido. Voce esta sozinho. Voce caminha");
        System.out.println("por hogwarts.");
        System.out.println();
        System.out.println("Suas palavras de comando sao:");
        System.out.println("   ir sair ajuda");
        System.out.println(analisador.getPalavrasDeComando());
    }

    /** 
     * Tenta ir em uma direcao. Se existe uma saida entra no 
     * novo ambiente, caso contrario imprime mensagem de erro.
     */
    private void irParaAmbiente(Comando comando) 
    {
        if(!comando.temSegundaPalavra()) {
            // se nao ha segunda palavra, nao sabemos pra onde ir...
            System.out.println("Ir pra onde?");
           // return; /* funciona como se fosse o `else`.
        }else{

        String direcao = comando.getSegundaPalavra();

        // Tenta sair do ambiente atual
        Ambiente proximoAmbiente = null;
        if(direcao.equals("norte")) {
            proximoAmbiente = ambienteAtual.getAmbiente("norte");
        }
        if(direcao.equals("leste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("leste");
        }
        if(direcao.equals("sul")) {
            proximoAmbiente = ambienteAtual.getAmbiente("sul");
        }
        if(direcao.equals("oeste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("oeste");
        }
        /**
         * @author Wildes Sousa
         * cria saida para - CSS nordeste
         */
        if(direcao.equals("nordeste")){
            proximoAmbiente = ambienteAtual.getAmbiente("nordeste");
        }

        if (proximoAmbiente == null) {
            System.out.println("Nao ha passagem!");
        }
        else {
            ambienteAtual = proximoAmbiente;
            
            System.out.println("Voce esta " + ambienteAtual.getDescricao());
            
            System.out.print("Saidas: ");
            if(ambienteAtual.getAmbiente("norte") != null) {
                System.out.print("norte ");
            }
            if(ambienteAtual.getAmbiente("leste") != null) {
                System.out.print("leste ");
            }
            if(ambienteAtual.getAmbiente("sul") != null) {
                System.out.print("sul ");
            }
            if(ambienteAtual.getAmbiente("oeste") != null) {
                System.out.print("oeste ");
            }
            /**
             * Aqui tem possibilidade de omitir a saida 
             * dai a Casa Sonserina ficaria escondida podendo entrar apenas pelo 
             * banheiro da murta e sair pelo lado oeste Salão Principal
             */
            if(ambienteAtual.getAmbiente("nordeste")!= null){
                System.out.println("nordeste");
            }
            System.out.println();
        }
        }
    }

    /** 
     * "Sair" foi digitado. Verifica o resto do comando pra ver
     * se nos queremos realmente sair do jogo.
     * @return true, se este comando sai do jogo, false, caso contrario
     */
    private boolean sair(Comando comando) 
    {
        if(comando.temSegundaPalavra()) {
            System.out.println("Sair o que?");
            return false;
        }
        else {
            return true;  // sinaliza que nos queremos sair
        }
    }
}
