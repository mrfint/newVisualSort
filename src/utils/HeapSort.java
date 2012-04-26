
package utils;

import java.awt.Component;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.xPanel;

public class HeapSort extends Sorter {

    @Override
    public void sort(int[] sa) {       
      initA(sa);
      sortHeap( a.length - 1 );
      
    }
 
   private void sortHeap( int end )
   {
       for ( int i = end / 2; i >= 1; i-- )        
           fixHeap( i, end, a[i] );
       
       for ( int i = end; i > 1; i-- )
       {
          swap( 1, i );
 
          fixHeap( 1, i - 1, a[1] );
       }
    }

    private void fixHeap( int root, int end,
                          int key )
    {   a[0] = 0;                     // MOCK
       int child = 2 * root;          // left child
       
       if ( child < end && a[child] < a[child + 1] )
          child++;                    // right child is larger

       if ( child <= end && key < a[child] )
       {
          a[root] = a[child];
          fixHeap( child, end, key );
       }
       else
          a[root] = key;
       
    }
    
 }
