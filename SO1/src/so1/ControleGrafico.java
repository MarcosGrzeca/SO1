/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package so1;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static so1.SO1.panel;

/**
 *
 * @author Éderson
 */
public class ControleGrafico {
    
    /**
     *
     * @param fe18000
     */
    
    public void exibeAvioesPd(Fila fPd)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao1.png"));        
            int i;
            panel.btnPd.setIcon(new ImageIcon());
            panel.txpPd.setText(null);
            for(i=0;i<=fPd.avioes.size();i++)
            {
                if (i==1){                
                    panel.btnPd.setIcon(new ImageIcon(imgAviaoDecolando));
                    panel.txpPd.setText(fPd.avioes.get(i-1).getNumberTxt());
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void exibeAvioesPp(Fila fPp)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao2.png"));        
            int i;
            panel.btnPp.setIcon(new ImageIcon());
            panel.txpPp.setText(null);
            for(i=0;i<=fPp.avioes.size();i++)
            {
                if (i==1){                
                    panel.btnPp.setIcon(new ImageIcon(imgAviaoDecolando));
                    panel.txpPp.setText(fPp.avioes.get(i-1).getNumberTxt());
                }
            }
            
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    public void exibeAvioesE5000(Fila fe5000)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao1.png"));        
        int i;
        
        panel.btnE5000_1.setIcon(new ImageIcon());
        panel.btnE5000_2.setIcon(new ImageIcon());
        panel.btnE5000_3.setIcon(new ImageIcon());
        panel.btnE5000_4.setIcon(new ImageIcon());
        panel.btnE5000_5.setIcon(new ImageIcon());
        panel.btnE5000_6.setIcon(new ImageIcon());
        panel.btnE5000_7.setIcon(new ImageIcon());
        panel.btnE5000_8.setIcon(new ImageIcon());
        panel.btnE5000_9.setIcon(new ImageIcon());
        panel.btnE5000_10.setIcon(new ImageIcon());
        
        panel.txpE5000_1.setText(null);
        panel.txpE5000_2.setText(null);
        panel.txpE5000_3.setText(null);
        panel.txpE5000_4.setText(null);
        panel.txpE5000_5.setText(null);
        panel.txpE5000_6.setText(null);
        panel.txpE5000_7.setText(null);
        panel.txpE5000_8.setText(null);
        panel.txpE5000_9.setText(null);
        panel.txpE5000_10.setText(null);        
        
        for(i=0;i<=fe5000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE5000_1.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_1.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE5000_2.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_2.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE5000_3.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_3.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE5000_4.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_4.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE5000_5.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_5.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE5000_6.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_6.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE5000_7.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_7.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE5000_8.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_8.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE5000_9.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_9.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE5000_10.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE5000_10.setText(fe5000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesE12000(Fila fe12000)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao1.png"));        
        int i;
        
        panel.btnE12000_1.setIcon(new ImageIcon());
        panel.btnE12000_2.setIcon(new ImageIcon());
        panel.btnE12000_3.setIcon(new ImageIcon());
        panel.btnE12000_4.setIcon(new ImageIcon());
        panel.btnE12000_5.setIcon(new ImageIcon());
        panel.btnE12000_6.setIcon(new ImageIcon());
        panel.btnE12000_7.setIcon(new ImageIcon());
        panel.btnE12000_8.setIcon(new ImageIcon());
        panel.btnE12000_9.setIcon(new ImageIcon());
        panel.btnE12000_10.setIcon(new ImageIcon());
        
        panel.txpE12000_1.setText(null);
        panel.txpE12000_2.setText(null);
        panel.txpE12000_3.setText(null);
        panel.txpE12000_4.setText(null);
        panel.txpE12000_5.setText(null);
        panel.txpE12000_6.setText(null);
        panel.txpE12000_7.setText(null);
        panel.txpE12000_8.setText(null);
        panel.txpE12000_9.setText(null);
        panel.txpE12000_10.setText(null);
                
        
        for(i=0;i<=fe12000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE12000_1.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_1.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE12000_2.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_2.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE12000_3.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_3.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE12000_4.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_4.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE12000_5.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_5.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE12000_6.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_6.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE12000_7.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_7.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE12000_8.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_8.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE12000_9.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_9.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE12000_10.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE12000_10.setText(fe12000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesE18000(Fila fe18000)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao1.png"));        
        int i;
        
        panel.btnE18000_1.setIcon(new ImageIcon());
        panel.btnE18000_2.setIcon(new ImageIcon());
        panel.btnE18000_3.setIcon(new ImageIcon());
        panel.btnE18000_4.setIcon(new ImageIcon());
        panel.btnE18000_5.setIcon(new ImageIcon());
        panel.btnE18000_6.setIcon(new ImageIcon());
        panel.btnE18000_7.setIcon(new ImageIcon());
        panel.btnE18000_8.setIcon(new ImageIcon());
        panel.btnE18000_9.setIcon(new ImageIcon());
        panel.btnE18000_10.setIcon(new ImageIcon());
        
        panel.txpE18000_1.setText(null);
        panel.txpE18000_2.setText(null);
        panel.txpE18000_3.setText(null);
        panel.txpE18000_4.setText(null);
        panel.txpE18000_5.setText(null);
        panel.txpE18000_6.setText(null);
        panel.txpE18000_7.setText(null);
        panel.txpE18000_8.setText(null);
        panel.txpE18000_9.setText(null);
        panel.txpE18000_10.setText(null);
        
        for(i=0;i<=fe18000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE18000_1.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_1.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE18000_2.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_2.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE18000_3.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_3.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE18000_4.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_4.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE18000_5.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_5.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE18000_6.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_6.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE18000_7.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_7.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE18000_8.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_8.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE18000_9.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_9.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE18000_10.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpE18000_10.setText(fe18000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesE20000(Fila fe20000)
    {
      
        try {           
            Image imgAviaoPousando = ImageIO.read(getClass().getResource("../imagens/aviao2.png"));        
        int i;
        
        panel.btnE20000_1.setIcon(new ImageIcon());
        panel.btnE20000_2.setIcon(new ImageIcon());
        panel.btnE20000_3.setIcon(new ImageIcon());
        panel.btnE20000_4.setIcon(new ImageIcon());
        panel.btnE20000_5.setIcon(new ImageIcon());
        panel.btnE20000_6.setIcon(new ImageIcon());
        panel.btnE20000_7.setIcon(new ImageIcon());
        panel.btnE20000_8.setIcon(new ImageIcon());
        panel.btnE20000_9.setIcon(new ImageIcon());
        panel.btnE20000_10.setIcon(new ImageIcon());
        
        panel.txpE20000_1.setText(null);
        panel.txpE20000_2.setText(null);
        panel.txpE20000_3.setText(null);
        panel.txpE20000_4.setText(null);
        panel.txpE20000_5.setText(null);
        panel.txpE20000_6.setText(null);
        panel.txpE20000_7.setText(null);
        panel.txpE20000_8.setText(null);
        panel.txpE20000_9.setText(null);
        panel.txpE20000_10.setText(null);        
        
        for(i=0;i<=fe20000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE20000_1.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_1.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE20000_2.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_2.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE20000_3.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_3.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE20000_4.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_4.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE20000_5.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_5.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE20000_6.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_6.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE20000_7.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_7.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE20000_8.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_8.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE20000_9.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_9.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE20000_10.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE20000_10.setText(fe20000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesE15000(Fila fe15000)
    {
      
        try {           
            Image imgAviaoPousando = ImageIO.read(getClass().getResource("../imagens/aviao2.png"));        
        int i;
        
        panel.btnE15000_1.setIcon(new ImageIcon());
        panel.btnE15000_2.setIcon(new ImageIcon());
        panel.btnE15000_3.setIcon(new ImageIcon());
        panel.btnE15000_4.setIcon(new ImageIcon());
        panel.btnE15000_5.setIcon(new ImageIcon());
        panel.btnE15000_6.setIcon(new ImageIcon());
        panel.btnE15000_7.setIcon(new ImageIcon());
        panel.btnE15000_8.setIcon(new ImageIcon());
        panel.btnE15000_9.setIcon(new ImageIcon());
        panel.btnE15000_10.setIcon(new ImageIcon());
        
        panel.txpE15000_1.setText(null);
        panel.txpE15000_2.setText(null);
        panel.txpE15000_3.setText(null);
        panel.txpE15000_4.setText(null);
        panel.txpE15000_5.setText(null);
        panel.txpE15000_6.setText(null);
        panel.txpE15000_7.setText(null);
        panel.txpE15000_8.setText(null);
        panel.txpE15000_9.setText(null);
        panel.txpE15000_10.setText(null);          
        
        for(i=0;i<=fe15000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE15000_1.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_1.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE15000_2.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_2.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE15000_3.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_3.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE15000_4.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_4.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE15000_5.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_5.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE15000_6.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_6.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE15000_7.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_7.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE15000_8.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_8.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE15000_9.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_9.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE15000_10.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE15000_10.setText(fe15000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesE10000(Fila fe10000)
    {
      
        try {           
            Image imgAviaoPousando = ImageIO.read(getClass().getResource("../imagens/aviao2.png"));        
        int i;
        
        panel.btnE10000_1.setIcon(new ImageIcon());
        panel.btnE10000_2.setIcon(new ImageIcon());
        panel.btnE10000_3.setIcon(new ImageIcon());
        panel.btnE10000_4.setIcon(new ImageIcon());
        panel.btnE10000_5.setIcon(new ImageIcon());
        panel.btnE10000_6.setIcon(new ImageIcon());
        panel.btnE10000_7.setIcon(new ImageIcon());
        panel.btnE10000_8.setIcon(new ImageIcon());
        panel.btnE10000_9.setIcon(new ImageIcon());
        panel.btnE10000_10.setIcon(new ImageIcon());
        
        panel.txpE10000_1.setText(null);
        panel.txpE10000_2.setText(null);
        panel.txpE10000_3.setText(null);
        panel.txpE10000_4.setText(null);
        panel.txpE10000_5.setText(null);
        panel.txpE10000_6.setText(null);
        panel.txpE10000_7.setText(null);
        panel.txpE10000_8.setText(null);
        panel.txpE10000_9.setText(null);
        panel.txpE10000_10.setText(null);          
        
        for(i=0;i<=fe10000.avioes.size();i++)
        {
            if (i==1){                
                panel.btnE10000_1.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_1.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnE10000_2.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_2.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnE10000_3.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_3.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnE10000_4.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_4.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnE10000_5.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_5.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnE10000_6.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_6.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnE10000_7.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_7.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnE10000_8.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_8.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnE10000_9.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_9.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnE10000_10.setIcon(new ImageIcon(imgAviaoPousando));
                panel.txpE10000_10.setText(fe10000.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void exibeAvioesFd(Fila fFd)
    {
      
        try {           
            Image imgAviaoDecolando = ImageIO.read(getClass().getResource("../imagens/aviao1.png"));        
        int i;
        
        panel.btnFd_1.setIcon(new ImageIcon());
        panel.btnFd_2.setIcon(new ImageIcon());
        panel.btnFd_3.setIcon(new ImageIcon());
        panel.btnFd_4.setIcon(new ImageIcon());
        panel.btnFd_5.setIcon(new ImageIcon());
        panel.btnFd_6.setIcon(new ImageIcon());
        panel.btnFd_7.setIcon(new ImageIcon());
        panel.btnFd_8.setIcon(new ImageIcon());
        panel.btnFd_9.setIcon(new ImageIcon());
        panel.btnFd_10.setIcon(new ImageIcon());
        
        panel.txpFd_1.setText(null);
        panel.txpFd_2.setText(null);
        panel.txpFd_3.setText(null);
        panel.txpFd_4.setText(null);
        panel.txpFd_5.setText(null);
        panel.txpFd_6.setText(null);
        panel.txpFd_7.setText(null);
        panel.txpFd_8.setText(null);
        panel.txpFd_9.setText(null);
        panel.txpFd_10.setText(null);  
        
        
        
        for(i=0;i<=fFd.avioes.size();i++)
        {
            if (i==1){                
                panel.btnFd_1.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_1.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
             if (i==2){                
                panel.btnFd_2.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_2.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==3){                
                panel.btnFd_3.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_3.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==4){                
                panel.btnFd_4.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_4.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
             if (i==5){                
                panel.btnFd_5.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_5.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==6){                
                panel.btnFd_6.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_6.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==7){                
                panel.btnFd_7.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_7.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==8){                
                panel.btnFd_8.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_8.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==9){                
                panel.btnFd_9.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_9.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
            if (i==10){                
                panel.btnFd_10.setIcon(new ImageIcon(imgAviaoDecolando));
                panel.txpFd_10.setText(fFd.avioes.get(i-1).getNumberTxt());
            }
        }
        } catch (IOException ex) {
            Logger.getLogger(ControleGrafico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
