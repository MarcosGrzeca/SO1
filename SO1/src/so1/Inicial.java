package so1;

import javax.swing.JFrame;

/**
 *
 * @author Marcos
 */
public class Inicial {
    public static TelaInicial frameTelaInicial;
    public static TelaSimulador panel;
    
    public static void iniciarTelaControleAvioes(int nroTotalAvioes, int nroMaxAvioesPorPista) {
        //Fechar tela inicial e abrir tela de controle de avioes
        panel = new TelaSimulador();
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        panel.setLocationByPlatform(true);

        panel.setVisible(true);
        frameTelaInicial.setVisible(false);
        ControleDasThreads iniciar = new ControleDasThreads();
        iniciar.iniciar(nroTotalAvioes, nroMaxAvioesPorPista);
        frameTelaInicial.dispose();
    } 
    
    public static void main(String[] args) {
        //Iniciar tela para informar parametros
        frameTelaInicial = new TelaInicial();
        frameTelaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        frameTelaInicial.setLocationByPlatform(true);
        frameTelaInicial.setVisible(true);     
    }
}