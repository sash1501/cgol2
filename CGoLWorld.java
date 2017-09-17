import java.util.LinkedList;

/**
 * CGolWorld ist die Welt, in der unser Game of Life stattfindet.
 * 
 * @author Sascha
 * @version 0.1
 */

public class CGoLWorld
{
	private int width;
	private int height;
	private int countOfBeings;
	private LinkedList<CGoLBeing> listOfBeings = new LinkedList<CGoLBeing>();
	private CGoLField[][] playground;
	
    public CGoLWorld()
    {
    	super();
    	this.width = 100;
    	this.height = 100;
    	this.countOfBeings = 15;
    	createWorld();
    	populateWorld();
    	System.out.println("Es werde Licht - Standard.");
    }
    
    public CGoLWorld(int width, int height, int countOfBeings)
    {
    	super();
    	this.width = width;
    	this.height = height;
    	this.countOfBeings = countOfBeings;
    	this.playground = new CGoLField[this.width][this.height];
    	createWorld();
    	populateWorld();
    	System.out.println("Es werde Licht!");
    }

	public String toString() {
		return "CGoLWorld [width = " + width + " , height = " + height + " , countOfBeings = " + countOfBeings + "]";
	}
	
	private void createWorld() {
    	this.playground = new CGoLField[width][height];
    	for(int i = 0; i < width; i++) {
    		for(int j = 0; j < height; j++) {
    			playground[i][j] = new CGoLField(i,j);
    		}
    	}
	}

	private void populateWorld() {
    	for(int i = 0; i < countOfBeings; i++) {
    		listOfBeings.add(new CGoLBeing("fauna"+i));
    		
    	// Zufallsgenerator f�r die Platzierung anschmei�en, um
    	// LinkedListBeings in playground zu platzieren.
    		
    	}
    	
    	for(int i = 0; i < listOfBeings.size(); i++) {
    		System.out.println(listOfBeings.get(i).toString());
    	}
    }
    
    
    // --- Getter und Setter f�r die private-Variablen ---
    
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
