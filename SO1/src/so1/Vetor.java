/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

/**
 *
 * @author Marcos
 */

public class Vetor {
    public int vetor[]; // declaração do vetor
    
    
    public int getPosicao(int posicao) {
        try {
            return vetor[posicao];   
        } catch (Exception e) {
            return 0;
        }
    }
    
    public void inserirElementoFim(int valor) {
        int indice = 0;
        for(int cont : vetor){
            indice++;
        }
        vetor[indice] = valor;
    }
    
    public void eliminarPrimeiraPosicaoVeotr() {
        int indice = 0;

        for(int cont : vetor){
            if (indice != 0) {
                vetor[cont - 1] = vetor[cont];
            }
            vetor[cont] = 0;
            indice++;
        }
}
    
}
