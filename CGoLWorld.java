import java.util.LinkedList;

/**
 * Beschreiben Sie hier die Klasse CGoLWorld.
 * 
 * @author Sascha
 * @version 0.1
 */

public class CGoLWorld
{
	private int width;
	private int height;
	private int countOfBeings;
	private LinkedList<CGoLBeing> listOfBeings;
	private CGoLField[][] playground;
	
    public CGoLWorld()
    {
    	this.width = 100;
    	this.height = 100;
    	this.countOfBeings = 15;
    	this.playground = new CGoLField[width][height];
    }
    
    public CGoLWorld(int width, int height, int countOfBeings)
    {
    	this.width = width;
    	this.height = height;
    	this.countOfBeings = countOfBeings;
    	this.playground = new CGoLField[this.width][this.height];
    }
}
