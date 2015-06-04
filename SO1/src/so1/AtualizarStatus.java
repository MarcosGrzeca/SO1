package so1;

/**
 *
 * @author Marcos
 */
public class AtualizarStatus extends Thread {
    
    ControleGrafico controleGrafico;

    AtualizarStatus(ControleGrafico controleGrafico) {
        this.controleGrafico = controleGrafico;
    }
    
    public void run() {
        while (true) {
            try {
                controleGrafico.exibeAvioesPd(ControleDasThreads.pd);
                controleGrafico.exibeAvioesPp(ControleDasThreads.pp);
                controleGrafico.exibeAvioesFd(ControleDasThreads.fd);
                controleGrafico.exibeAvioesE5000(ControleDasThreads.e5000);
                controleGrafico.exibeAvioesE12000(ControleDasThreads.e12000);
                controleGrafico.exibeAvioesE18000(ControleDasThreads.e18000);
                controleGrafico.exibeAvioesE20000(ControleDasThreads.e20000);
                controleGrafico.exibeAvioesE15000(ControleDasThreads.e15000);
                controleGrafico.exibeAvioesE10000(ControleDasThreads.e10000);
                Thread.sleep(1000); //Atualização a cada segundo
              } catch (InterruptedException ex) {}
        }
    }
}