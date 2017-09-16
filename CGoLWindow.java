
/**
 * Beschreiben Sie hier die Klasse CGoLWindow.
 * 
 * @author (Dominick K.) 
 * @version (Window 0.1)
 */

import javax.swing.JFrame;

public class CGoLWindow extends JFrame
{
    // privat muss ersetzt werden 
    private int x = 0;
    private int y = 0;
    private int width = 500;
    private int height = 500;
   
    /**
     * Konstruktor für Objekte der Klasse CGoLWindow
     */
    public CGoLWindow()
    {
      //Create frame mit Position(x,y) & Größe(width,height)
      JFrame frame = new JFrame("World of Life");
      frame.setBounds(x, y, width, height);
      frame.setVisible(true);
    }
}
