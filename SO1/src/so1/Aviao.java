package so1;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    String  getNumberTxt()
    {
        return String.valueOf(numero);
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
            try {
                Thread.sleep(3000);
                if (this.filaAtual.getNumeroPrimeiroAviao() == this.numero) {
                   if (this.filaAtual.getName().equalsIgnoreCase("fd")) {
                        ControleDasThreads.sfd.down();
                        ControleDasThreads.spd.down();
                        this.filaAtual.removerPrimeiroAviao();
                        System.out.println("DECOLANDO");
                        this.filaAtual = ControleDasThreads.pd;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.sfd.up();
                        //SO1.spd.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("pd") && ControleDasThreads.e5000.temEspaco()) {
                        Thread.sleep(1000);
                        //SO1.spd.down();
                        ControleDasThreads.se5000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e5000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se5000.up();
                        Thread.sleep(1000);
                        ControleDasThreads.spd.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e5000")&& ControleDasThreads.e12000.temEspaco()) {
                        ControleDasThreads.se12000.down();
                        ControleDasThreads.se5000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e12000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se5000.up();
                        ControleDasThreads.se12000.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e12000")&& ControleDasThreads.e18000.temEspaco()) {
                        ControleDasThreads.se18000.down();
                        ControleDasThreads.se12000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e18000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se12000.up();
                        ControleDasThreads.se18000.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e18000")&& ControleDasThreads.e20000.temEspaco()) {
                        ControleDasThreads.se20000.down();
                        ControleDasThreads.se18000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e20000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se18000.up();
                       //Thread.sleep(2000);
                        ControleDasThreads.se20000.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e20000")&& ControleDasThreads.e15000.temEspaco()) {
                        ControleDasThreads.se15000.down();
                        ControleDasThreads.se20000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e15000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se20000.up();
                        ControleDasThreads.se15000.up();                        
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e15000")&& ControleDasThreads.e10000.temEspaco()) {
                        ControleDasThreads.se10000.down();
                        ControleDasThreads.se15000.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.e10000;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.se15000.up();                        
                        ControleDasThreads.se10000.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("e10000")) {
                        ControleDasThreads.se10000.down();
                        ControleDasThreads.spp.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.pp;
                        this.filaAtual.inserirAviao(this);
                        //SO1.spp.up();                        
                        ControleDasThreads.se10000.up();
                    } else if (this.filaAtual.getName().equalsIgnoreCase("pp")&& ControleDasThreads.fd.temEspaco()) {
                        Thread.sleep(1000);
                        
                        //SO1.spp.down();
                        this.filaAtual.removerPrimeiroAviao();
                        this.filaAtual = ControleDasThreads.fd;
                        this.filaAtual.inserirAviao(this);
                        ControleDasThreads.spp.up();                        
                        ControleDasThreads.sfd.up();
                    }
                } else {
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Aviao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }     
}