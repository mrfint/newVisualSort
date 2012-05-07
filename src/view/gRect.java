
package view;

import java.awt.Dimension;
import javax.swing.JButton;

public class gRect extends JButton{

    private int khRect;
    public gRect(int a, int h, int parH) {
        khRect = parH/h;
        setPreferredSize(new Dimension(20, khRect*a));
    }
    public void setHight(int a){
        setPreferredSize(new Dimension(20, khRect*a));
    }
}
