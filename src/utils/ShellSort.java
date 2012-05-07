
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.MainFrame;
import view.xPanel;

public class ShellSort extends Sorter{
    
   @Override
   public void sort(int[] sa) {       
        initA(sa);
        int i, j, k, h, m=0, b=a.length;
        int[] d =  { 1, 4, 10, 23, 57, 145 , 356, 911};
        while (d[m] < b) ++m;
        while (--m >= 0){
            k = d[m];
            for (i=k; i<b; i++){     // k-сортировка
                j=i;
                h=a[i];
                while ((j >= k) && (a[j-k] > h)){ 
                    compareCount++;
                    a[j]=a[j-k];
                    j =  j-k;
                }
                a[j] = h;
                swap();
            }            
        }
    }
    
}
