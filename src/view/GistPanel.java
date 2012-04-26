
package view;

import controller.Controller;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import utils.Sorter;
import view.utils.FactorySorter;

public class GistPanel extends JPanel{
    private int[] a = new int[0];
    private Sorter sorter = null;
    private int wRect, khRect;
    private String name;
    public GistPanel(String name) {
        super(new GridLayout());
        this.name  = name;
        sorter = FactorySorter.getInstance(name);
        setBackground(Color.white);
    }
    public void initMass( int[] a, int h )
    {
        this.a = a.clone();
        khRect = getHeight()/h;        
        
        repaint();        
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
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        wRect = getWidth()/(a.length+1);
        for (int i = 0; i < a.length; i++) {
            g.setColor(Color.green);
            g.fillRect(10+i*wRect, getHeight()-khRect*a[i], wRect, khRect*a[i]);
            g.setColor(Color.black);
            g.drawRect(10+i*wRect, getHeight()-khRect*a[i], wRect, khRect*a[i]);
        }
    }

    public void refresh() {
        repaint();
    }   
}