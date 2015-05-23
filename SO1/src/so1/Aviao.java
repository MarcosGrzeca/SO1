/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.util.logging.Level;
import java.util.logging.Logger;
import static so1.SO1.e5000;

/**
 *
 * @author Marcos
 */
public class Aviao extends Thread{

    protected String posicao;
    /*
    PP - Pista de pouso
    PD - Pista de decolagem
    E5000 - Estrada 5000 (Decolagem)
    E12000 - Estrada 12000 (Decolagem)
    E18000 - Estrada 18000 (Decolagem)
    
    E10000 - Estrada 10000 (Pouso)
    E15000 - Estrada 15000 (Pouso)
    E20000 - Estrada 20000 (Pouso)
    
    */
    protected int numero;
    protected Fila filaAtual;
    
    Aviao(String posicao, int numero, Fila filaAtual) {
        this.posicao = posicao;
        this.numero = numero;
        this.filaAtual = filaAtual;
        this.filaAtual.inserirAviao(this);
    }
    
    int getNumero() {
       return this.numero; 
    }
    
    String getPosicao() {
       return this.posicao; 
    }
    
    void setPosicao(String posicao) {
       this.posicao = posicao; 
    }
    
    
    public void run()
    {
        while (true) {
    //        System.out.println(this.numero);
            try {
                Thread.sleep(3000);
                if (this.filaAtual.getNumeroPrimeiroAviao() == this.numero) {
                   if (this.filaAtual.getName().equalsIgnoreCase("fd")) {
                        SO1.sfd.down();
                        SO1.spd.down();
                        this.filaAtual.removerPrimeiroAviao();
                        Thread.sleep(2000);
                        this.filaAtual = SO1.pd;
                        this.filaAtual.inserirAviao(this);
                        SO1.spd.up();
                        SO1.sfd.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("pd")) {
                        SO1.spd.down();
                        SO1.se5000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = SO1.e5000;
                        this.filaAtual.inserirAviao(this);
                        SO1.se5000.up();
                        SO1.spd.up();
                    }
                    
                   // this.filaAtual.removerPrimeiroAviao();
                    
                } else {
                   // System.out.println(this.numero + " NAO REMOVIDO");
                }
                
                //System.out.println(this.filaAtual.getNumeroPrimeiroAviao() + " NAO REMOVIDO");
                //Verificar se é primeiro da fila
                //Reserva recursos
                //Move fila
                //Libera recursos
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }     
}