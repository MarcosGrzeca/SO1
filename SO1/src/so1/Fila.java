/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Fila{

    public String name;
    public Integer tipo;
    public TelaSimulador panel;
    public List<Aviao> avioes;

    /*
    Tipo 0 - Estrada de pouso
    Tipo 1 - Estrada de decolagem
    Tipo 2 - Pista de pouso
    Tipo 3 - Pista de decolagem
    Tipo 4 - Fila decolagem
    
    */
    
    Fila(String name, Integer tipo, TelaSimulador panel) {
        this.panel = panel;
        this.tipo = tipo;
        this.name = name;
        this.avioes = new ArrayList<Aviao>();
    }
    
    public void inserirAviao(Aviao aviao) {
       avioes.add(aviao);
    }
    
    public String getName() {
       return this.name;
    }
    
    public void removerPrimeiroAviao() {
        if (avioes.isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            avioes.remove(0);
        }
    }
    
    public Integer getNumeroPrimeiroAviao() {
        if (avioes.isEmpty()) {
               return -1;
        }
        return avioes.get(0).getNumero();        
    }
    
    public List<Aviao> getAvioes() {
        return this.avioes;
    }
    
    public boolean temEspaco()
    {
        if (this.avioes.size() < ControleDasThreads.nroAvioesPorFila){
            return true;
        }
        else{
            return false;
        }
    }
}