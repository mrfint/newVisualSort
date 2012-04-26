
package view.utils;

import java.util.HashMap;
import java.util.Map;
import utils.BubbleSort;
import utils.HeapSort;
import utils.InsertSort;
import utils.MergeSort;
import utils.QuickSort;
import utils.SelectionSort;
import utils.ShellSort;
import utils.Sorter;
import view.MainFrame;
import view.xPanel;

public class FactorySorter {
        private static Map mp = null;
   
        public static Sorter getInstance(String type)
        {   Sorter ret=null;
            if(mp==null)
            {
                init();
            }
            return (Sorter) mp.get(type);
        }
        private static void init() {
        mp = new HashMap<String, Sorter>();  
            mp.put("BubbleSort", new BubbleSort());
            mp.put("InsertSort", new InsertSort());
            mp.put("SelectionSort", new SelectionSort());
            mp.put("ShellSort", new ShellSort());
            mp.put("QuickSort", new QuickSort());
            mp.put("MergeSort", new MergeSort());
            mp.put("HeapSort", new HeapSort());
        }
       
}
