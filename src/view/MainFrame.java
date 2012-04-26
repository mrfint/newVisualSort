
package view;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class MainFrame extends JFrame{
    
    public static final int DEFAULT_WIDTH =700;
    public static final int DEFAULT_HEIGHT=650;
    public final String[] captSorters = new String[]{"BubbleSort", "InsertSort",
            "SelectionSort", "ShellSort", "QuickSort", "MergeSort", "HeapSort"};
    private JButton btInit, btStart;
    private JPanel jpFace;
    
    public MainFrame(){
        //Create and set up the window.
        super("DiffSorters");
        //setLocationRelativeTo(this);
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);       
        //Create and set up the content pane.
        addContentPane(getContentPane());      
    }
 
    
    public void addBtnsListeners(ActionListener[] actnListeners)
    {
        btInit.addActionListener(actnListeners[0]);
        btStart.addActionListener(actnListeners[1]);
    }
    
    private void addContentPane(Container contentPane) {
        
        jpFace = new JPanel( new GridLayout(7, 1) );
       
        for (int i = 0; i < 7; i++) {
            xPanel xpanel = new xPanel(captSorters[i]);
            jpFace.add(xpanel);
        }
         
        // Init buttons
        btInit  = new JButton("Init ");
        btStart = new JButton("Start");
        // выравнивания размеров кнопок
        JPanel grid = new JPanel( new GridLayout(1, 2, 5, 0) );
        grid.add( btInit );
        grid.add( btStart);
 
        JPanel jpDnButtons = new JPanel( new FlowLayout() );
        jpDnButtons.add(grid);
        
        contentPane.add(jpDnButtons, BorderLayout.SOUTH);
        
        contentPane.add(jpFace, BorderLayout.CENTER);
        
    }

    public JPanel getJpFace() {
        return jpFace;
    }
    
}
