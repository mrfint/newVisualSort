
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainFrame;
import view.xPanel;

public class QuickSort extends Sorter{
    @Override
    public void sort(int[] sa) {       
        initA(sa);
        qs(a, 0, a.length-1);
    }

    private void qs(int[] items, int left, int right) {
        int i, j;
        int x, y;
        
        if( left >= right ) return;
        i = left;  j = right;
        x = items[(left + right)/2];
        
        do {
                while( (items[i] < x ) && (i < right)) {
                    compareCount++;
                    i++;
                }
                while( (x < items[j] ) && (j > left)){
                    compareCount++;
                    j--;
                }

                    if (i <= j) {
                        swap(i,j);
                        i++; j--;
                        
                    }
        } while (i <= j);
        
        if(left < j)  qs(items, left, j);
        if(i < right) qs(items, i, right);
    }
    
}
