/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class ThreadPistas extends Thread{

    public String name;
    public Integer tipo;
    public Vetor vetor;
    /*
    Tipo 0 - Estrada de pouso
    Tipo 1 - Estrada de decolagem
    Tipo 2 - Pista de pouso
    Tipo 3 - Pista de decolagem
    
    */
    
    ThreadPistas(String name) {
        this.name = name;
        vetor = new Vetor();
    }
    
    public Vetor getVetor() {
        return this.vetor;
    }
 
    public void run()
    {
       while (true) {
        try
         {
             System.out.println(this.name);
         }
        catch(Exception e )
         {
           e.printStackTrace();
         }
           try {
            Thread.sleep(3000); //Atualização a cada segundo
           } catch (InterruptedException ex) {
               Logger.getLogger(ThreadPistas.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
    }
    
    
    
}
