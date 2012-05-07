
package utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import view.CaptPanel;
import view.GistPanel;
import view.xPanel;

public abstract class Sorter implements Runnable{
    protected final int DELAY = 10;
    protected int[] a;
    protected xPanel xpan;
    protected int swapCount;
    protected int compareCount;
    
    protected void initA(int[] sa) {
        this.a = sa;
        swapCount = 0;
        compareCount = 0;
    }
    public void prepareShow(xPanel xpan) {
        this.xpan = xpan;
        initA(((GistPanel)xpan.getComponent(1)).getMass());
    }
    
    @Override
    public void run() {
        sort(a);
    }
    
    public abstract void sort(int[] a);
    
    protected void swap(int i, int j) {
         int c=a[i];  
         a[i]=a[j];   
         a[j]=c; 
         
         swap();
        
    }
    protected void swap(){
        swapCount++;
        ((CaptPanel)xpan.getComponent(0)).repaint(swapCount, compareCount);
        if(xpan!=null){
            ((GistPanel)xpan.getComponent(1)).repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sorter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
