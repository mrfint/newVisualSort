
package utils;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.xPanel;

public class HeapSort extends Sorter {
    private int n;
    
    @Override
    public void sort(int[] sa) {       
        a=sa;
        n=a.length;
        heapsort();
      
    }
    
    private void heapsort()
    {
        buildheap();
        while (n>1)
        {
            n--;
            swap (0, n);
            downheap (0);
        } 
    }

    private void buildheap()
    {
        for (int v=n/2-1; v>=0; v--)
            downheap (v);
    }

    private void downheap(int v)
    {
        int w=2*v+1;    // first descendant of v
        while (w<n)
        {
            if (w+1<n){
                compareCount++;
                if (a[w+1]>a[w]) w++;
            }
            // w is the descendant of v with maximum label
            compareCount++;
            if (a[v]>=a[w]) return;  // v has heap property
            // otherwise
            swap(v, w);  // exchange labels of v and w
            v=w;        // continue
            w=2*v+1;
        }
    }
    
 }
