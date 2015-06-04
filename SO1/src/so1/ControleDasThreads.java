package so1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import static so1.Inicial.panel;

/**
 *
 * @author Marcos Grzeça
 */
public class ControleDasThreads extends JFrame{

    static Semaphore sfd = new Semaphore(1);
    static Semaphore spd = new Semaphore(1);
    static Semaphore spp = new Semaphore(1);
    static Semaphore se5000 = new Semaphore(1);
    static Semaphore se12000 = new Semaphore(1);
    static Semaphore se18000 = new Semaphore(1);
    static Semaphore se20000 = new Semaphore(1);
    static Semaphore se15000 = new Semaphore(1);
    static Semaphore se10000 = new Semaphore(1);
    
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
    
    static int nroTotalAvioes;
    static int nroAvioesPorFila;
    int totalAvioesInseridosTmp = 0;
    
    ControleGrafico controleGrafico;
    
    public void inicializarThreads() {
        avioes = new ArrayList<>();
        //Declaração das pistas e filas
        e5000 = new Fila("E5000", 1, panel);
        e12000 = new Fila("E12000", 1, panel);
        e18000 = new Fila("E18000", 1, panel);
        e10000 = new Fila("E10000", 0, panel);
        e15000 = new Fila("E15000", 0, panel);
        e20000 = new Fila("E20000", 0, panel);
        pp = new Fila("PP", 2, panel);
        pd = new Fila("PD", 3, panel);
        fd = new Fila("FD", 4, panel);
        
        controleGrafico = new ControleGrafico();
    
        //Popular pistas e estradas com aviões
        iniciarAvioes(fd);
        iniciarAvioes(e5000);
        iniciarAvioes(e12000);
        iniciarAvioes(e18000);
        iniciarAvioes(e20000);
        iniciarAvioes(e15000);
        iniciarAvioes(e10000);

        //Thread que atualiza interface a cada segundo
        AtualizarStatus atualizarTela = new AtualizarStatus(controleGrafico);
        atualizarTela.start();
    }
    
    public void iniciarAvioes(Fila fila) {
        int indiceTmp = 0, indice;
        while(indiceTmp < nroAvioesPorFila && this.totalAvioesInseridosTmp < nroTotalAvioes) {
            indice = totalAvioesInseridosTmp + 1;
            Aviao aviao = new Aviao(fila.getName(), indice, fila);
            avioes.add(aviao);
            aviao.start();
            this.totalAvioesInseridosTmp++;
            indiceTmp++;
        }        
    }
    
    public void iniciar(int nroTotalAvioes, int nroMaxAvioesPorPista) {
        this.nroTotalAvioes = nroTotalAvioes;
        this.nroAvioesPorFila = nroMaxAvioesPorPista;
    
        ControleDasThreads so = new ControleDasThreads();
        so.inicializarThreads();
    }   
}