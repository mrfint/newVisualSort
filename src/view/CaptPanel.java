
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CaptPanel extends JPanel{
    private String name;
    private int cntSwap;
    private int cntCmpre;
    
    public CaptPanel(String name) 
    {   
        super(new FlowLayout());
        setPreferredSize(new Dimension(150, 60));
        this.name = name;
    }
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString(name+" :", 10, 20);
        g.drawString("cntSwap :"+cntSwap, 10, 40);
        g.drawString("cntCompare :"+cntCmpre, 10, 60);
    }

    public void repaint(int cntSwap, int cntCmpre) {
        this.cntSwap = cntSwap;
        this.cntCmpre = cntCmpre;
        repaint();
        
    }
}
