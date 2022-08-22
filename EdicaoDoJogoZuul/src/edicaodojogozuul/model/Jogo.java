
package edicaodojogozuul.model;

import java.util.Random;
import java.util.Scanner;


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
    private Ambiente ambienteAtual,  proximoAmbiente = null;
    private Jogador harry;
    private boolean fim;
    private String cmd;
    /**
     * Atributo responsavél pela duracão da simulacão
     */
    private int tempo_luta;    
        
    /**
     * Cria o jogo e incializa seu mapa interno.
     */
    public Jogo() 
    {
        criarAmbientes();
        analisador = new Analisador();
        fim = false;
        cmd = "";
    }

    public String getAmbienteAtual() {
        return ambienteAtual.getDescricao() + "\n";
        
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
         * Defini em qual ambiente vai estar a varinha
         */
        boolean 
                amb0 = false,
                amb1 = false,
                amb2 = false,
                amb3 = false,
                amb4 = false;
        switch(sortearVarinha()){
            case 0 : 
                amb0 = true;
                break;
            case 1 : 
                amb1 = true;
                break;
            case 2 : 
                amb2 = true;
                break;
            case 3 : 
                amb3 = true;
                break;
            case 4 : 
                amb4 = true;
                break;
        }
      
        // cria os ambientes
        entrada_principal = new AmbienteNeutro("na entrada principal da escola de hogwarts","an");
        salao_principal = new AmbienteComum("no salão principal","ac",amb0);
        camera_secreta = new AmbienteEspecial(3,"na câmara secreta","ae");
        torre_das_escadarias = new AmbienteNeutro("na torre das escadarias","an");
        grifinoria = new AmbienteComum("na casa grifinória", "ac",amb3);
        sala_precisa = new AmbienteNeutro("na sala precisa", "an");
        sonserina = new AmbienteComum("na casa sonserina", "ac", amb4);
        lufa_lufa = new AmbienteNeutro("na casa lufa-lufa", "an");
        corvinal = new AmbienteComum("na casa corvinal", "ac", amb1);
        banheiro_murta = new AmbienteComum("no banheiro da murta", "ac", amb2);
        quintal_pricinpal = new AmbienteNeutro("no quintal principal, entre para a escola pra continuar.", "an");
        
        
        // inicializa as saidas dos ambientes
        quintal_pricinpal.ajustarSaidas("leste",entrada_principal);
        /*quintal_pricinpal.ajustarSaidas("oeste",null);
        quintal_pricinpal.ajustarSaidas("norte",null);
        quintal_pricinpal.ajustarSaidas("sul",null);*/

        
        entrada_principal.ajustarSaidas("oeste", quintal_pricinpal);
        entrada_principal.ajustarSaidas("leste", torre_das_escadarias);
        /*entrada_principal.ajustarSaidas("norte", null);
        entrada_principal.ajustarSaidas("sul", null);*/
        
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
        sala_precisa.ajustarSaidas("sul", banheiro_murta); // possivel mudança a/tornar o jogo mais desafiador
        
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
        while ((! terminado) && !fim) {
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
        
        imprimirLocalizacaoAtual();
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
            observar();
        }
        else if(palavraDeComando.equals("pegar")){
            pegarItem();
        }
        else if(palavraDeComando.equals("usar")){
            usarItem();
        }
        else if(palavraDeComando.equals("lutar")){
            cmd = "lutar";
        }

        return querSair;
    }
    
    /**
     * @return - String de tudo que há no abiente
     */
    private void observar(){
         
        proximoAmbiente = ambienteAtual;
        // usar metodo instaceo
        if(proximoAmbiente.getId().equals("ac")){
           System.out.println(proximoAmbiente);// mostrar tudo que tem no ambiente comum
        }
        else if(proximoAmbiente.getId().equals("ae")){
           System.out.println(proximoAmbiente);// mostrar tudo que tem no ambiente especial
        }
        else{
            System.out.println("Ambiente vazio.");
        }
    }

    private void imprimirLocalizacaoAtual(){
        System.out.println("Voce esta " + ambienteAtual.getDescricao());
        /*System.out.println("Inimigos: " + ambienteAtual.get);*/
        System.out.println("Saidas: " + ambienteAtual.getSaidas());
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
        System.out.printf("Suas palavras de comando sao: \n%s\n",analisador.getPalavrasDeComando().PalavrasComando());
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
           return; /* funciona como se fosse o `else`.*/
        }

        
        String direcao = comando.getSegundaPalavra();
        // proximoAmbiente = null;
        

        // Tenta sair do ambiente atual
        
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
            return;
        }
        
        if(ambienteAtual.getAmbiente(direcao).getId().equals("ae")){
            
                        
            ambienteAtual = buscarAmbiente("ae");
            System.out.println(":WARNING: Você chegou na Câmera Secreta, certique-se está com a varinha... ");
            System.out.print("\nIniciar confronto S/n -> ");
            //String cmd = comando.getPalavraDeComando();
            switch(cmd){
                case "lutar" :
                case "s" :
                    String vencedor = rounds(2);
        
                    if(vencedor.equals("Jogador")){
                        System.out.println("Harry você venceu Valdemor.\nParabéns para concluir o jogo vá para o Quintal Principal");
                       // proximoAmbiente = ambienteAtual.getAmbiente("norte");
                    }
                    else{
                        System.out.println("Que pena você perdeu :(");
                        this.fim = true;
                    }
                    break;
                case "n" :
                case "N" :
                    break;
            }
            
            
        }else

        if (proximoAmbiente == null) {
            System.out.println("Nao ha passagem!");
        }
        else {
            ambienteAtual = proximoAmbiente;
                
            imprimirLocalizacaoAtual();
            System.out.println();
        }
        
    }
    
        /**
     * 
     * @param id
     * @return Ambiente Especial ou Ambiente Comum
     */
    private Ambiente buscarAmbiente(String id){
        for(Ambiente a  : ambienteAtual.getAmbiente()){
           if(a instanceof AmbienteComum){
               if(((AmbienteComum) a).getId().equals(id)){
                   return a;
               }
           }else if (a instanceof AmbienteEspecial){
               if(((AmbienteEspecial) a).getId().equals(id))
               return a;
           }else{
               return a;
           }
            
        
        }
        return null;
    }
     /**
     * 
     * @return String - retorna o [nome do vencedor]
     * gera uma quantidade de socos aleatorio para cada lutador 
     * com base em um detenminado tempo de luta passado no construtor da classe
     * e ao final da simulacão retorna qual lutador socou mais.
     */
    
    private String simularLuta(){
        
       Random socos = new Random();
       
       int socosJogador = 0; 
       int socosAdversario = 0;
       String ganhador = "";
       
       int inicio = 0;
       while(inicio < tempo_luta ){
           socosJogador += socos.nextInt(8)+1;
           socosAdversario += socos.nextInt(8)+1;
           
           ganhador = (socosJogador > socosAdversario) ? "Jogador" : "Maquina" ;
           inicio++;
       }
        return ganhador;
    }
    /**
     * 
     * @param vidas
     * @return String - retorna o resultado final de cada round (nome do ganhador) -> Jogador or Maquina
     * @@code if (qtdVitoriaJogador > vitoriaMaquina) {return jogador;}
     */
    
    public String rounds(int vidas){
        
        String vencedorRounds;
        String winner;
        String ent;
        
        int rounds = vidas;
        int r= 1;
        
        int jogador = 0;
        int maquina = 0;
        
        Scanner sc = new Scanner(System.in);
        
        while(rounds > 0 ){
            System.out.println("Time: " + rounds);
            System.out.println("Round " + r++);
            System.out.print("\nPara lutar digite [L]");
            System.out.print("\nLutar -> ");
            ent = sc.nextLine();
            
            switch(ent){
                case "l":
                case "L":
                        /**
                         * @return - String (vencedor)
                         */
                        vencedorRounds = simularLuta();
                        
                        if (vencedorRounds.equals("Jogador")){
                            jogador++; //contabiliza a quanidade de rounds ganhos
                        }
                        else{
                            maquina++;
                        }
                        break;
                default:
                    System.out.println("Comando invalido...\n\tDa proxima vez tente l ou L. ");
                    vencedorRounds = "aguandando comando válido\n";
                    rounds++; // caso o comando seja invalido retorna a tentativa anterior
                    r--;// caso o comando seja invalido retorna ao round atual
            }
            
            System.out.printf("####Placar####\nJ: %d \t|\tM: %d\n", jogador, maquina);// vitorias dos lutadores
            
            System.out.println("Winner -> " + vencedorRounds + "\n"); //Se o comando for válido exibe o vencedor do round atual
            rounds--;
        }
        winner = jogador > maquina ? "Jogador" : "Maquina"; // retorna o vencedor por meio das qts de conquistas(rounds)
        return  winner;
    }   
    /**
     * 
     * @return int que corresponde ao ambiente que guardara a varinha
     */
    private int sortearVarinha(){
        Random sorteia = new Random();
        return sorteia.nextInt(5);
        
    }
    
    private void pegarItem(){
        
    }
    
    private void usarItem(){
        
    }
    
    private String lutaFinal(){
        return "S";
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
