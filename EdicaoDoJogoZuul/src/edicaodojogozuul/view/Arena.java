/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edicaodojogozuul.view;

/**
 *
 * @author Wildes Sousa
 */
public interface Arena {
    /**
     * 
     * @return String - Por meio de comparacões devolve o nome do vencedor da luta -> [Jogador or Maquina]
     */
    public abstract String lutar();
    void sair();
}
