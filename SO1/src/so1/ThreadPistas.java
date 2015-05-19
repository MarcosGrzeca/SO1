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
public class ThreadPistas extends Thread{

    public String name;
    public Integer tipo;
    /*
    Tipo 0 - Estrada de pouso
    Tipo 1 - Estrada de decolagem
    Tipo 2 - Pista de pouso
    Tipo 3 - Pista de decolagem
    
    */
    
    ThreadPistas(String name) {
        this.name = name;
    }
    
    public void run()
    {
      try
       {
           System.out.println("TESTE");
       }
      catch(Exception e )
       {
         e.printStackTrace();
       }
    }
    
    
    
}
