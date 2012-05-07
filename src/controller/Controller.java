
package controller;

import view.utils.FactorySorter;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import utils.*;
import view.GistPanel;
import view.MainFrame;
import view.xPanel;

public class Controller {
    
    private MainFrame mf;
    
    private int[]       a = null; // Mass A
    private final int   N = 100;   // quals of element
    private final int   H = 10;   // h - max element of mass A
    
    private FactorySorter factSorter = null;

    public Controller(MainFrame mf) {
        this.mf = mf;
        factSorter = new FactorySorter();
        mf.addBtnsListeners(initButtonsListeners());
    }
    
    public void initMass(){
        a = new int[N];
        for(int i=0; i<N; i++){ 
            a[i]=(int)(Math.random()*H);
        }

    }

    private ActionListener[] initButtonsListeners() {
        ActionListener btnInt = new ActionListener() {
          @Override
            public void actionPerformed(ActionEvent e) {
                initMass();            // Init array A by random numbers
                JPanel jpFace = (JPanel) mf.getJpFace();
                for (int i = 0; i < jpFace.getComponentCount(); i++) 
                {   GistPanel gistPanel = ((xPanel)jpFace.getComponent(i)).getGistPanel();
                    gistPanel.initMass(a, H);
                }      
                
            }
        };
        ActionListener btnStart = new ActionListener(){
           @Override
            public void actionPerformed(ActionEvent e) {
                JPanel jpFace = (JPanel) mf.getJpFace();
                for (int i = 0; i < jpFace.getComponentCount(); i++) 
                {   
                    GistPanel comp = ((xPanel)jpFace.getComponent(i)).getGistPanel();
                    comp.startSort();
                    
                }  
            }
        };

        return new ActionListener[]{btnInt,btnStart}; 
    }
    
}
