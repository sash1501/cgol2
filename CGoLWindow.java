
/**
 * Beschreiben Sie hier die Klasse CGoLWindow.
 * 
 * @author (Dominick K.) 
 * @version (Window 0.1)
 */

import javax.swing.JFrame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CGoLWindow extends JFrame implements ActionListener 
{
    // privat muss ersetzt werden 
    private int x = 0;
    private int y = 0;
    private int width = 100;
    private int height = 100;
    private int countOfBeings = 15;
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
    	button1.addActionListener(this);
      
    	// Get the reference of  the   content  pane
    	Container contentPane = getContentPane();
    	//contentPane.setLayout(new FlowLayout());
    	// Add aComponent to contentPane 
    	contentPane.add(button1);
    	setBounds(x, y, width, height);
    	setVisible(true);
    }
    
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			world = new CGoLWorld(width, height, countOfBeings);
		}
	}
}
