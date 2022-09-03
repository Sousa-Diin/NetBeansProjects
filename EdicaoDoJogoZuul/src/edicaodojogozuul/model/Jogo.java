
package edicaodojogozuul.model;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author devsousa
 */
/**
 *
 * Esta classe eh parte da aplicacao "Labirinto de Hogwarts.
 * "Labirinto de Hogwarts" eh um jogo de aventura muito simples e divertido, baseado em texto.  
 * 
 *  O jogador pode caminhar entre cenarios distintos .  Ele realmente
 *  precisa ser estendido para fazer algo interessante!
 * 
 *  Para jogar esse jogo, crie uma instancia dessa classe e chame o metodo
 *  "jogar".
 * 
 *  Essa classe principal cria e inicializa todas as outras: ela cria os
 *  ambientes, cria o analisador e comeca o jogo. Ela tambeme avalia e 
 *  executa os comandos que o analisador retorna.
 * 
 * Inspirado no jogo word of zuul de Michael Kölling and David J. Barnes (traduzido por Julio Cesar Alves)
 * @version 2011.07.31 (2016.02.01)
 * 
 * @author modificado por Wildes Sousa 
 * @version  2022 v1.22-1
 */

public class Jogo 
{
    public static int score = 0 ;
    private final Analisador analisador;
    private final Jogador harry;
    private Ambiente ambienteAtual,
            proximoAmbiente = null,
            saltaAmbiente = null,
            ambienteFinal = null;            
    
    private boolean valdemor_derrotado;
    private boolean fim_de_jogo;
        
    /**
     * Cria o jogo e incializa seu mapa interno.
     */
    public Jogo() 
    {
        criarAmbientes();
        analisador = new Analisador();
        fim_de_jogo = false;
        harry = new Jogador();
        valdemor_derrotado = false;
        score++;
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
                break;//ERRO #10
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
        camera_secreta = new AmbienteEspecial("na câmara secreta","ae");
        torre_das_escadarias = new AmbienteNeutro("na torre das escadarias","an");
        grifinoria = new AmbienteComum("na casa grifinória", "ac",amb3);
        sala_precisa = new AmbienteNeutro("na sala precisa", "an");
        sonserina = new AmbienteComum("na casa sonserina", "ac", amb2);
        lufa_lufa = new AmbienteNeutro("na casa lufa-lufa", "an");
        corvinal = new AmbienteComum("na casa corvinal", "ac", amb1);
        banheiro_murta = new AmbienteComum("no banheiro da murta", "ac", amb4);
        quintal_pricinpal = new AmbienteNeutro("no quintal principal, entre para a escola pra continuar.", "anq");
        
        
        // inicializa as saidas dos ambientes
        quintal_pricinpal.ajustarSaidas("leste",entrada_principal);
        /*quintal_pricinpal.ajustarSaidas("oeste",null);
        quintal_pricinpal.ajustarSaidas("norte",null);
        quintal_pricinpal.ajustarSaidas("sul",null);*/

        
        entrada_principal.ajustarSaidas(null, quintal_pricinpal);
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
        ambienteFinal = quintal_pricinpal; // termina o jogo no quintal principal
        saltaAmbiente = banheiro_murta; // salta para o ambiente 'bamheiro da murta'
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
        while ((! terminado) && !fim_de_jogo) {
            Comando comando = analisador.pegarComando();
            terminado = processarComando(comando);
        }
        System.out.println("Obrigado por jogar. Ate mais!");
    }

    /**
     * Exibe as Boas Vindas e
     * Imprime a mensagem de abertura para o jogador.
     */
    public void imprimirBoasVindas()
    {
        int tot_inimigos = AmbienteComum.getTotInimigos();
        System.out.println();
        System.out.println("|\t\tBem-vindo ao Labirinto de Hogwarts!\t\t\t|");
        System.out.println("|O Labirinto de Hogwarts eh um novo jogo de aventura, em que o Jogador  |\n|precisa resgatar seus amigos que lorde Valdemor capturou.\t\t|\n"
                + "-------------------------------------------------------------------------");
        System.out.println("\n\n\t\t\t\tCOMANDOS\t\t\t\t|\n|Digite [ajuda] se voce precisar de ajuda.\t\t\t\t|");
        System.out.println("|\t\t\t\t\t\t\t\t\t|\n| [observar]; [mochila]; [ir <direcão>]; [pegar] e [usar <item>]\t|");
        System.out.println("\n");
        mostrarComandosInstrucoes();
        System.out.printf("\n|-----------------------------------------------------------------------|\n"
                 + "| DICAS  |Eih Harry cuidado! adiante você encontrará [" +tot_inimigos + "] comensais...|\n"
                 + "|-----------------------------------------------------------------------|\n\n"
                + "\t\t\t....INICIANDO O JOGO.....\n");
        imprimirLocalizacaoAtual();
   
    }

    /**
     * Dado um comando, processa-o (ou seja, executa-o)
     * @param comando O Comando a ser processado.
     * @return true se o comando finaliza o jogo.
     */
    public boolean processarComando(Comando comando) 
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
            if(!harry.temVarinha()){
                pegarVarinha();
                System.out.println("item salvo... para ver digite > mochila");
            }
            System.out.println("Não há mais itens a ser pego.");
        } 
        else if(palavraDeComando.equals("usar")){
            usarItem(comando);
        }
        else if(palavraDeComando.equals("lutar")){
            //proximo nivél do jogo
            System.out.println("Comando indisponivél.");
        }
        else if(palavraDeComando.equals("mochila")){
            System.out.printf("\nVIDAS => [ %d ]\n", harry.getVida());
            System.out.printf("\n|%-12s | %-6s|\n", "ARTEFATO",  "DURABILIDADE");
            System.out.println(" ---------------------------");
            atualizaItemEspecial();
            System.out.println(harry.exibeItem());
               
        }

        return querSair;
    }
    
    /**
     * @return - String de tudo que há no abiente
     */
    public void observar(){
         
        proximoAmbiente = ambienteAtual;
        // usar metodo instaceo
        if(proximoAmbiente.getId().equals("ac")){
            
           System.out.println(proximoAmbiente);// mostrar tudo que tem no ambiente comum
           System.out.println("Voce esta " + ambienteAtual.getDescricao());
           System.out.println("Saidas: " + ambienteAtual.getSaidas());
        }
        else if(proximoAmbiente.getId().equals("ae")){
           System.out.println(proximoAmbiente.toString());// mostrar tudo que tem no ambiente especial
           System.out.println("Voce esta " + ambienteAtual.getDescricao());
           System.out.println("Saidas: " + ambienteAtual.getSaidas());
        }
        else{
            System.out.println("\n******STATUS DO AMBIENTE******\n\nAmbiente vazio.\n");
            System.out.println("Voce esta " + ambienteAtual.getDescricao());
            System.out.println("Saidas: " + ambienteAtual.getSaidas());
        }
        
        if (!valdemor_derrotado){
            if(ambienteAtual instanceof AmbienteEspecial){              
                System.out.printf(stringFormatada("Valdemor está aqui...  :("));
            }
            else{
                System.out.println(stringFormatada("Valdemor não está aqui."));
               //System.out.printf("\n|%-10s |%-10s\n","DICAS", "Valdemor não está aqui.|"); 
            }
        }
        else{
            System.out.println(stringFormatada(" Valdemor foi derrotado...\t\t|\n    \t\tVá para o quintal principal ou use a pedra"));
              //System.out.printf("\n|%-10s |%-10s\n","DICAS", "Valdemor foi derrotado...|");  
        }
    }
    /**
     * Formata a string passado por parametro
     * @param str
     * @return String
     */
    private String stringFormatada(String str){
        return String.format("\n|%-10s | %-10s |\n","DICAS:", str);
    }

    /**
     * Mostra a localizacão atual do ambiente
     */
    public void imprimirLocalizacaoAtual(){
        if(valdemor_derrotado){
            if(ambienteAtual instanceof AmbienteNeutro){
                if(((AmbienteNeutro)ambienteAtual).getId().equals("anq")){
                    System.out.println("Voce esta " + ambienteAtual.getDescricao());
                }
            }
        }
        else{
            System.out.println("Voce esta " + ambienteAtual.getDescricao());
            System.out.println("Saidas: " + ambienteAtual.getSaidas()); 
        }
     
    }
    // Implementacoes dos comandos do usuario

    /**
     * Printe informacoes de ajuda.
     * Aqui nos imprimimos algo bobo e enigmatico e a lista de 
     * palavras de comando
     */
    public void imprimirAjuda() 
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
            ajustaVida(proximoAmbiente);
            abilitaSaidaCastelo();
            proximoAmbiente = identificaCameraSecreta(ambienteAtual);
           
        }
        if(direcao.equals("leste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("leste");
            ajustaVida(proximoAmbiente);
            abilitaSaidaCastelo(); 
            proximoAmbiente = identificaCameraSecreta(ambienteAtual);
        }
        if(direcao.equals("sul")) {
            proximoAmbiente = ambienteAtual.getAmbiente("sul");
            ajustaVida(proximoAmbiente);
            abilitaSaidaCastelo();
            proximoAmbiente = identificaCameraSecreta(ambienteAtual);
        }
        if(direcao.equals("oeste")) {
            proximoAmbiente = ambienteAtual.getAmbiente("oeste");
            ajustaVida(proximoAmbiente);
            abilitaSaidaCastelo();
            proximoAmbiente = identificaCameraSecreta(ambienteAtual);
        }
        /**
         * @author Wildes Sousa
         * cria saida para - CSS nordeste
         * Obs comentar a linhas 310-313 para o jogo ficar mais emocionante
         * tornando assim um verdadeiro labirinto
         */
        if(direcao.equals("nordeste")){
            proximoAmbiente = ambienteAtual.getAmbiente("nordeste");
            ajustaVida(proximoAmbiente);
            abilitaSaidaCastelo();
            proximoAmbiente = identificaCameraSecreta(ambienteAtual);
        }
        
        if (proximoAmbiente == null) {
            System.out.println("Nao ha passagem!");
            return;
        }
        else {
            ambienteAtual = proximoAmbiente;
                     
            imprimirLocalizacaoAtual();
            System.out.println();
        }
        
    }
    
     /**
     * Faz a busca dos ambientes 
     * @param id
     * @return Ambiente
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
     * Método que verificar se o jogador chegou no ambiente da luta,
     * se o mesmo esta de posse da varinha e se o valdemor esta vivo
     * caso todas as condicões estabelecidas acima seja verdadeira a 
     * entrado do jogador e liberado no momento que ele tenta sair do 
     * ambiente
     * @param lugar
     * @return Ambiente
     */
    private Ambiente identificaCameraSecreta(Ambiente lugar){//ERRO #19
        if(lugar instanceof AmbienteEspecial){
            System.out.println(":WARNING: Você chegou na Câmera Secreta");
            if(harry.temVarinha()){
                if(!valdemor_derrotado){
                    System.out.print("\n#########Iniciando confronto##########\n");
                    String vencedor = rounds(harry.getVida());
        
                    if(vencedor.equals("Jogador")){
                        System.out.println("\n\tHarry você venceu Valdemor.\n\t\tParabéns!!! \nPara concluir missão, use a pedra vilosofal com ela você sairá mais rapido do castelo.\n");
                        valdemor_derrotado = true; 
                        //Colocar em um if pra reduzir repeticoes
                        System.out.println((harry.getVida() >= 5 && harry.temItem("pedra"))? "\n####Seu <Item> - pedra foi acionado automaticamente####\n" : "");
                        return (harry.getVida()>= 5 && harry.temItem("pedra")) ? ambienteFinal: saltaAmbiente;
                    }
                    else{
                        System.out.println("\nQue pena você perdeu :(");
                        this.fim_de_jogo = true;
                    }
                    
                }else{System.out.println("Você já lutou ");}
            }else if(valdemor_derrotado){
                System.out.println("Você já lutou com valdemor. Você não esta mais com a varinha.");
            }else{System.out.println("Vish,você não está com a varinha. Intem necessario para este Ambiente.");}
        }
        return proximoAmbiente; // Warning 
    }
    
     /**
     * 
     * @return String - retorna o [nome do vencedor] 
     * gerado após uma sequencia de golpes aleatorio para cada lutador 
     * e ao final da simulacão retorna qual lutador teve um numero elevado de golpes.
     */
    
    private String simularLuta(){
        
       Random socos = new Random();
       
       int socosJogador = 0; 
       int socosAdversario = 0;
       String ganhador = "";
       
       int inicio = 0;
       while(inicio < 3 ){
           socosJogador += socos.nextInt(5);
           socosAdversario += socos.nextInt(4);
           
           ganhador = (socosJogador > socosAdversario) ? "Jogador" : "Maquina" ;
           inicio++;
       }
        return ganhador;
    }
    /**
     * 
     * @param vidas
     * @return String - Jogador or Maquina resultado final de cada round (nome do ganhador) 
     * método desenvolvido pra proporcionar uma interacão mais realista ao jogador. Podendo o mesmo 
     * acionar comando 
     * @code if (qtdVitoriaJogador > vitoriaMaquina) {return jogador;}
     */
    
    private String rounds(int vidas){
        
        String vencedorRounds = "";
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
            System.out.print("\nPara lutar digite [l]");
            System.out.print("\n> ");
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
                            harry.decrementaVida();
                        }
                        break;
                case "v":
                case "V":
                    System.out.println("\n[VIDAS : " + harry.getVida() + "]\n");
                    rounds++;
                    r--;
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
        return  winner;//ERRO #25
    }   
    /**
     * 
     * @return int que corresponde ao ambiente que guardara a varinha
     */
    private int sortearVarinha(){
        Random sorteia = new Random();
        return sorteia.nextInt(5);
        
    }
    /**
     * Este método é responsavel por verificar se o valdemor foi derrotado,
     * se o jogador chegou ao destino final(Saida do castelo) e concluir o jogo.
     * 
     */
    private void abilitaSaidaCastelo(){
        if(valdemor_derrotado){
            if(ambienteAtual instanceof AmbienteNeutro){
                if(((AmbienteNeutro)ambienteAtual).getId().equals("anq")){
                    if(valdemor_derrotado){
                        System.out.println("\n\t\t!!!JOGO CONCLUIDO!!!");
                        fim_de_jogo = true;
                        score +=1; 
                    }else{//AJUSTE #01
                        
                    }
                }
            }
        }
    }
    /**
     * Caso o ambiente atual seja um supertipo AmbienteComum 
     * e tem a varinha o mesmo deixa o item que por sua vez e guardado na mochila 
     * do jogador
     */
    public void pegarVarinha(){
        if(ambienteAtual.getId().equals("ac")){
            if(((AmbienteComum)ambienteAtual).getVarinha()){
                harry.pegarVarinha(!((AmbienteComum)ambienteAtual).deixarVarinha());
            }
        }
    }
    /**
     * Caso a durabilidade da varinha chegue a zero atualiza o status ao exibir no display
     */
    private void atualizaItemEspecial(){
        if (harry.temItem("varinha")){
            if(harry.buscarItemEspecifico("varinha").getDurabilidade() == 0){
                harry.removerItem("varinha");
            }
        }
    }
    /**
     * Método que executa o comando digitado pelo jogador
     * e recebe um código <char> do jogador caso tenha o item em sua mochila. Apartir daí executa o método condizente ao comando
     * requisitado
     * @param comando 
     */
    private void usarItem(Comando comando){
        if(!comando.temSegundaPalavra()) {
            // se nao ha segunda palavra, nao sabemos oque pegar...
            System.out.println("usar oque?");
           return;
        }

        
        String artefato = comando.getSegundaPalavra();
        switch (harry.usarItem(artefato)) {
            case 'c': //capa - 2
                System.out.println("Usando a capa...");//AJUSTE #05
                break;
            case 'm': //mapa - 1
                System.out.println("\t\t\t\t\tMAPA DO JOGO");
                Instrucoes.exibirMapa();
                break;
            case 'p': //pedra - 1 
                if(valdemor_derrotado){
                    ambienteAtual = ambienteFinal;
                }else{
                    System.out.println("Usando pedra filosofal");
                }
                break;
            case 'v': //vassoura - 1
                System.out.println("Usando a vassoura");
                break;
            case 't': //vira-tempo - 3
               // Item vida_extra = harry.buscarItemEspecifico("vira-tempo"); VERIFICAR RETORNO 
                //NÃO DEU CERTO PASSAR A BUSCA DO ITEM + SUA DURABILIDADE COMO PARAMETRO
                harry.setVida(3);
                System.out.println("\n####Kit de vida ajustado####\n");
                break;
            case '*': //varinha - 20
                if(harry.buscarItemEspecifico("varinha").getDurabilidade() >= 2){
                    eliminarInimigos(proximoAmbiente);
                    System.out.println("um inimigo abatido...");
                }else{
                    System.out.println("você não tem poder suficiente na varinha");
                }
                
                break;
            case '/': //se comando não existir
                System.out.println("não entendi");
                break;
            default: // `/`. Não faz nada
                System.out.println("você não tem esse item.");
                
        }
    }
    /**
     * Método responsavel por chamar o método destruir inimigos 
     * @param umAmbiente 
     */
    private void eliminarInimigos(Ambiente umAmbiente){
        if(umAmbiente instanceof AmbienteComum){
            ((AmbienteComum) umAmbiente).destruirInimigos();
        }
     }
    /**
     * Método que ajusta a vida do jogador
     * a cada confonto com o inimigo a vida do mesmo e decrementada mais detalhes ver na 
     * classe Instrucoes no method exibirEstatisticas na linha 78 no WARNING
     * @param umAmbiente 
     */ 
    private void ajustaVida(Ambiente umAmbiente){
        if(umAmbiente instanceof AmbienteComum){
            int inimigos = ((AmbienteComum)umAmbiente).getInimigos();
            if(inimigos > 0 && harry.getVida() > 3){
                for(int i = 0; i < inimigos;i++){
                    harry.decrementaVida();
                }
            }
            else if(harry.getVida() <= 3 && harry.temItem("vira-tempo")){
                harry.setVida(3);
                System.out.println("\n****Kit de vida ajustado automaticamente****\n");
                harry.buscarItemEspecifico("vira-tempo").decrementaItem();// devido a modalidade de usar item foi preciso atualisa-lo antes
                harry.removerItem("vira-tempo");
            }else if(inimigos != 0){
                if(harry.temItem("capa")){
                    harry.buscarItemEspecifico("capa").decrementaItem();
                    harry.removerItem("capa");
                }else if(harry.temItem("mapa")){
                    harry.buscarItemEspecifico("mapa").decrementaItem();
                    harry.removerItem("mapa");
                }else if(harry.temItem("vira-tempo")){// verificar redudancia
                    harry.buscarItemEspecifico("vira-tempo").decrementaItem();
                    harry.removerItem("vira-tempo");
                }else{
                    if(harry.temVarinha()){
                        harry.buscarItemEspecifico("varinha").decrementaVarinha();
                    }
                }
            }
        }else{
            /**
             * @author - Wildes Sousa
             * Não faz nada 
             * Apareceu ERRO: Exception in thread "main" java.lang.NullPointerException
             * qnd uma saida nao ajustada é escolhida 
             * date: 24/08 hour 13:24
             */
        }
    }

    /**
     * Método que exibi estatísticas e comando do jogo na abertura do jogo
     */
    private void mostrarComandosInstrucoes(){
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nINFORMAÇÕES ?\n"
                + "1 - Exibir Estatísticas\n2 - Exibir Comandos detalhados\n3 - Historico do jogo\n4 - Iniciar Jogo \n> ");
       
        
        do{
            
            op = sc.nextInt();
            switch (op) {
                case 1:
                    Instrucoes.exibirEstatisticas();
                    break;
                case 2:
                    Instrucoes.exibirComandos();
                    break;
                case 3:
                    System.out.println("Quantidades de vezes jogadas: " + score);
                    break;
                default:
                    System.out.println("\t\t\tVAMOS COMEÇAR");
                    //outraOpcao = false;
                    break;
            }
       System.out.print("\nINFORMAÇÕES ?\n"
                + "1 - Exibir Estatísticas\n2 - Exibir Comandos detalhados\n3 - Historico do jogo\n4 - Iniciar Jogo \n> ");
       
        }while(op != 4  && op >= 1);
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