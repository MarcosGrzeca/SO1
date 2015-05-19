/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Marcos
 */
public class SO1 extends JFrame{

    static Semaphore SA = new Semaphore(0);
    static Semaphore SB = new Semaphore(0);
    static Semaphore SC = new Semaphore(0);
    static Semaphore SD = new Semaphore(0);
    static Semaphore SE = new Semaphore(0);
    static Semaphore SF = new Semaphore(0);
    static Semaphore SG = new Semaphore(0);
    static Semaphore SH = new Semaphore(0);
    static Panel panel;
    
    public void inicializarThreads() {
          ThreadPistas t1 = new ThreadPistas("estrada pouso 20000", panel);
          ThreadPistas t2 = new ThreadPistas("estrada pouso 15000", panel);
          ThreadPistas t3 = new ThreadPistas("estrada pouso 10000", panel);
          ThreadPistas t4 = new ThreadPistas("estrada decolagem 21000", panel);
          ThreadPistas t5 = new ThreadPistas("estrada decolagem 16000", panel);
          ThreadPistas t6 = new ThreadPistas("estrada decolagem 11000", panel);
          ThreadPistas t7 = new ThreadPistas("pista pouso", panel);
          ThreadPistas t8 = new ThreadPistas("pista decolagem", panel);
          t8.start();
          t7.start();
          t6.start();
          t5.start();
          t4.start();
          t3.start();
          t2.start();
          t1.start();
          
          while (true) {
              //panel.setTextJTable("111");
              
              try {
                  //Atualizar tela
                  Thread.sleep(1000); //Atualização a cada segundo
              } catch (InterruptedException ex) {
                  Logger.getLogger(SO1.class.getName()).log(Level.SEVERE, null, ex);
              }
              System.out.println(t1.getVetor());
          }
         
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        panel = new Panel();
        panel.setVisible(true);
        
        //frame.set
        
        SO1 so = new SO1();
        so.inicializarThreads();
        //inicializarThreads();
        
        
    }
    
}
