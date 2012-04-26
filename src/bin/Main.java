
package bin;

import controller.Controller;
import javax.swing.JFrame;
import view.MainFrame;

public class Main {

    public static void main(String[] args) {
       MainFrame mf = new MainFrame();
       Controller controller = new Controller(mf);
       mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       mf.setVisible(true);
    }
}
