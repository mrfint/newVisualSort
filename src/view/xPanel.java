
package view;

import controller.Controller;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class xPanel extends JPanel{
    private GistPanel gistPanel = null;
    public xPanel(String name) {
        super(new BorderLayout());
        add(new CaptPanel(name), BorderLayout.WEST);

        gistPanel = new GistPanel(name);
        
        add(gistPanel, BorderLayout.CENTER);
        setBorder(BorderFactory.createBevelBorder(1));
    }

    public GistPanel getGistPanel() {
        return gistPanel;
    }
    
}