
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JPanel;

public class CaptPanel extends JPanel{
    private String name;
    private int cntSwap;
    
    public CaptPanel(String name) 
    {   
        super(new FlowLayout());
        setPreferredSize(new Dimension(90, 60));
        this.name = name;
    }
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString(name+" :", 10, 20);
        g.drawString("cntSwap :"+cntSwap, 10, 40);
    }

    public void refresh(int cntSwap) {
        this.cntSwap = cntSwap;
        repaint();
        
    }
}
