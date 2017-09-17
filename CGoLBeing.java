import survivalstrategy.*;
/**
 * CGoLBeing describes everything that lives in our CGoLWorld.
 * 
 * @author sash1501 
 * @version 0.1
 */
public class CGoLBeing
{
	private String name;
	
    public CGoLBeing(String name)
    {
    	this.name = name;
    }

	public String toString() {
		return "CGoLBeing [name = " + name + "]";
	}
    
    	
    	
    // --- Getter und Setter für die private-Variablen ---
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
