/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Fila{

    public String name;
    public Integer tipo;
    public Vetor vetor;
    public Panel panel;
    public List<Aviao> avioes;

    /*
    Tipo 0 - Estrada de pouso
    Tipo 1 - Estrada de decolagem
    Tipo 2 - Pista de pouso
    Tipo 3 - Pista de decolagem
    Tipo 4 - Fila decolagem
    
    */
    
    Fila(String name, Integer tipo, Panel panel) {
        this.panel = panel;
        this.tipo = tipo;
        this.name = name;
        this.avioes = new ArrayList<Aviao>();
    }
    
    public void inserirAviao(Aviao aviao) {
      //  System.out.println("INSERINDO AVION NA FILA " + this.name);
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
    
    /*
    public void run()
    {
       while (true) {
        try
         {
             System.out.println(this.name);
             panel.setTextJTable(this.name);
         }
        catch(Exception e )
         {
           e.printStackTrace();
         }
           try {
            Thread.sleep(3000); //Atualização a cada segundo
           } catch (InterruptedException ex) {
               Logger.getLogger(Fila.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    */
    
    
    public String getAvioesVirgula() {
        String ret = "";
        for (Aviao item : this.getAvioes()) {
            ret += item.getNumero() + " ";
        }   
        return ret;
    }
}