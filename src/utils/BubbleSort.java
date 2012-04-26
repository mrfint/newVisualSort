
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainFrame;
import view.xPanel;

public class BubbleSort extends Sorter{   
    @Override
    public void sort(int[] sa) {       
        initA(sa);
        for (int i = 0; i < a.length; i++) 
        {   
                for (int j = i+1; j < a.length; j++){
                    compareCount++;
                    if(a[i]>a[j]) {  
                       swap(i,j);
                    }
                }
        }
    }

}
