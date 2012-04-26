
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
    private int swapCount;
    
    protected void initA(int[] a) {
        this.a = a;
        swapCount = 0;
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
        ((CaptPanel)xpan.getComponent(0)).refresh(swapCount);
        if(xpan!=null){
            ((GistPanel)xpan.getComponent(1)).refresh();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException ex) {
                Logger.getLogger(BubbleSort.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getSwapCount() {
        return swapCount;
    }
    
}
