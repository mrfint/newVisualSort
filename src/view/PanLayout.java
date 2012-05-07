
package view;

import java.awt.*;

class PanLayout implements LayoutManager
{   private final int DY=2;
    public void addLayoutComponent(String name, Component comp)
    {}
    public void removeLayoutComponent(Component comp)
    {}
 
    public Dimension minimumLayoutSize(Container parent)
    {
        return computeLayoutSize(parent);
    }
 
    public Dimension preferredLayoutSize(Container parent)
    {
        return computeLayoutSize(parent);
    }
 
    private Dimension computeLayoutSize(Container parent)
    {
        int prefWidth = 0;
        int prefHeight = 0;
        Component[] components = parent.getComponents();
        for(int k=0; k<components.length; k++) {
            prefWidth += components[k].getWidth();
            prefHeight += components[k].getHeight();
        }
        return new Dimension(prefWidth, prefHeight);
    }
 
    public void layoutContainer(Container parent)
    {
        // Получаем список компонентов
        Component[] components = parent.getComponents();
        if(components.length!=0)
        {
            int row = parent.getHeight();
            int width = parent.getWidth()/(components.length);
            int width2 = parent.getWidth();
            int col = (parent.getWidth()-width*components.length)/2;

            for(int k=0; k<components.length; k++) {
                int height = (int)(components[k].getPreferredSize().getHeight())+DY+1; //  min height
                // Определяем местоположение компонента и его размеры
                Rectangle r = new Rectangle(col, row-height-DY, width, height-DY);
                // Устанавливаем его
                components[k].setBounds(r);
                // Заготавливаем координаты следующего компонента
                col += width;
            }
        }
    }
}