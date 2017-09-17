
/**
 * Beschreiben Sie hier die Klasse CGoLWindow.
 * 
 * @author (Dominick K.) 
 * @version (Window 0.1)
 */

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;

public class CGoLWindow extends JFrame
{
    // privat muss ersetzt werden 
    private int x = 0;
    private int y = 0;
    private int width = 500;
    private int height = 500;
    private JButton button1; 
    private CGoLWorld world;
    /**
     * Konstruktor für Objekte der Klasse CGoLWindow
     */
    public CGoLWindow()
    {
    	setTitle("World of Life");

      
    	//Button1
    	button1 = new JButton("Start");
      
    	// Get the reference of  the   content  pane
    	Container contentPane = getContentPane();
    	//contentPane.setLayout(new FlowLayout());
    	// Add aComponent to contentPane 
    	contentPane.add(button1);
    	setBounds(x, y, width, height);
    	setVisible(true);
    }
}
