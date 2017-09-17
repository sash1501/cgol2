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
    	System.out.println("Es werde Licht!");
    }

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getCountOfBeings() {
		return countOfBeings;
	}

	public void setCountOfBeings(int countOfBeings) {
		this.countOfBeings = countOfBeings;
	}

	public LinkedList<CGoLBeing> getListOfBeings() {
		return listOfBeings;
	}

	public void setListOfBeings(LinkedList<CGoLBeing> listOfBeings) {
		this.listOfBeings = listOfBeings;
	}

	public CGoLField[][] getPlayground() {
		return playground;
	}

	public void setPlayground(CGoLField[][] playground) {
		this.playground = playground;
	}
}
