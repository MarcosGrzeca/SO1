/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import jdk.nashorn.internal.objects.NativeArray;

/**
 *
 * @author Marcos Grzeça
 */
public class SO1 extends JFrame{

    static Semaphore sfd = new Semaphore(1);
    static Semaphore se5000 = new Semaphore(1);
    static Semaphore SC = new Semaphore(0);
    static Semaphore SD = new Semaphore(0);
    static Semaphore SE = new Semaphore(0);
    static Semaphore SF = new Semaphore(0);
    static Semaphore SG = new Semaphore(0);
    static Semaphore SH = new Semaphore(0);
    static Panel panel;
    
    static List<Aviao> avioes;
    
    static Fila e5000;
    static Fila e12000;
    static Fila e18000;
    static Fila e10000;
    static Fila e15000;
    static Fila e20000;
    static Fila pp;
    static Fila pd;
    static Fila fd;
    
    
    public void inicializarThreads() {
          /*Fila e5000 = new Fila("E5000", 1, panel);
          Fila e12000 = new Fila("E12000", 1, panel);
          Fila e18000 = new Fila("E18000", 1, panel);
          Fila e10000 = new Fila("E10000", 0, panel);
          Fila e15000 = new Fila("E15000", 0, panel);
          Fila e20000 = new Fila("E20000", 0, panel);
          Fila pp = new Fila("PP", 2, panel);
          Fila pd = new Fila("PD", 3, panel);
          Fila fd = new Fila("FD", 4, panel);
          
          e5000.start();
          e12000.start();
          e18000.start();
          e10000.start();
          e15000.start();
          e20000.start();
          pp.start();
          pd.start();
          fd.start();

          */
        
        
        e5000 = new Fila("E5000", 1, panel);
        e12000 = new Fila("E12000", 1, panel);
        e18000 = new Fila("E18000", 1, panel);
        e10000 = new Fila("E10000", 0, panel);
        e15000 = new Fila("E15000", 0, panel);
        e20000 = new Fila("E20000", 0, panel);
        pp = new Fila("PP", 2, panel);
        pd = new Fila("PD", 3, panel);
        fd = new Fila("FD", 4, panel);
        
        for (int i = 0; i < 5; i++) {
            Aviao aviao = new Aviao("FD", i, fd);
            avioes.add(aviao);
            aviao.start();
        }
          
        
        /*while (true) {
            try {
                //Atualizar tela
                for (Aviao next : fd.avioes) {
                    System.out.println(next.getNumero());
                }
                Thread.sleep(2000); //Atualização a cada segundo
              } catch (InterruptedException ex) {}
        }*/
        
        
        
        while (true) {
            try {
                Thread.sleep(2000); //Atualização a cada segundo
                System.out.println("FD-------------------------------------------------------------------------");
                //Atualizar tela
                for (Aviao item : fd.getAvioes()) {
                   System.out.println(item.getNumero());
                }
                System.out.println("AVIOES E5000 ---------------");
                //Atualizar tela
                for (Aviao item : e5000.getAvioes()) {
                   System.out.println(item.getNumero());
                }
              } catch (InterruptedException ex) {}
        }
        
        //pd.avioes;
        
        
          
        /*  while (true) {
              //panel.setTextJTable("111");
              
              try {
                  //Atualizar tela
                  Thread.sleep(1000); //Atualização a cada segundo
              } catch (InterruptedException ex) {
                  Thread.sleep(1000); //Atualização a cada segundo
              } catch (InterruptedException ex) {
                  Logger.getLogger(SO1.class.getName()).log(Level.SEVERE, null, ex);
              }
              System.out.println(t1.getVetor());
          }
         */
    }
    
    public static void main(String[] args) {
        avioes = new ArrayList<Aviao>();
    
        // TODO code application logic here
        panel = new Panel();
        panel.setVisible(true);
        
        //frame.set
        SO1 so = new SO1();
        so.inicializarThreads();
        //inicializarThreads();   
    }   
}