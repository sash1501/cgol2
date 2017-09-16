
/**
 * Beschreiben Sie hier die Klasse CGoLWindow.
 * 
 * @author (Dominick K.) 
 * @version (Window 0.1)
 */

import javax.swing.JFrame;

public class CGoLWindow extends JFrame
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int x = 300;
    private int y = 500;
    /**
     * Konstruktor für Objekte der Klasse CGoLWindow
     */
    public CGoLWindow()
    {
      //Create  
      JFrame frame = new JFrame("Swing");
      frame.setSize(x, y);
      frame.setVisible(true);
    }
}
