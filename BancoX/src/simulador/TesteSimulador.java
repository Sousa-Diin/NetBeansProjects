
package simulador;

/**
 *
 * @author <h2>Wildes Sousa</h2>
 * @version <b>v1.22-2</b>
 */
public class TesteSimulador {
    public static void main(String[] args) {
        
        Simulador simulador = new Simulador(2, 100);
        System.out.println("\tIniciando Simulação!!");
        simulador.simular();
    }
}
