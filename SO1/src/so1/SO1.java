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
public class SO1 {

    static Semaphore SA = new Semaphore(0);
    static Semaphore SB = new Semaphore(0);
    static Semaphore SC = new Semaphore(0);
    static Semaphore SD = new Semaphore(0);
    static Semaphore SE = new Semaphore(0);
    static Semaphore SF = new Semaphore(0);
    static Semaphore SG = new Semaphore(0);
    static Semaphore SH = new Semaphore(0);
    
    public void inicializarThreads() {
          ThreadPistas t1 = new ThreadPistas("estrada pouso 20000");
          ThreadPistas t2 = new ThreadPistas("estrada pouso 15000");
          ThreadPistas t3 = new ThreadPistas("estrada pouso 10000");
          ThreadPistas t4 = new ThreadPistas("estrada decolagem 21000");
          ThreadPistas t5 = new ThreadPistas("estrada decolagem 16000");
          ThreadPistas t6 = new ThreadPistas("estrada decolagem 11000");
          ThreadPistas t7 = new ThreadPistas("pista pouso");
          ThreadPistas t8 = new ThreadPistas("pista decolagem");
          t8.start();
          t7.start();
          t6.start();
          t5.start();
          t4.start();
          t3.start();
          t2.start();
          t1.start();
          
          while (true) {
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
        SO1 so = new SO1();
        so.inicializarThreads();
        //inicializarThreads();
    }
    
}
