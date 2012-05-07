
package view;

import controller.Controller;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;
import utils.Sorter;
import view.utils.FactorySorter;

public class GistPanel extends JPanel{
    private int[] a = new int[0];
    private Sorter sorter = null;
    private int wRect;
    private String name;
    
    public GistPanel(String name) {
        super(new PanLayout());       
        this.name  = name;
        sorter = FactorySorter.getInstance(name);
        setBackground(Color.white);
      //  setBounds(0, 0, 100, 30);
    }
    
    public void initMass( int[] a, int h )
    {
        this.a = a.clone();
        
        removeAll();
        for (int i = 0; i < a.length; i++) {
          add(new gRect(a[i],h, getHeight()));
          validate();
        }
    }
  
    public void startSort(){
        sorter.prepareShow((xPanel)getParent());
        Thread t = new Thread(sorter);
        t.start();       
    }
    
    public int[] getMass()
    {
        return a;     
    }
}