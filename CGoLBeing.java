import survivalstrategy.*;
/**
 * CGoLBeing describes everything that lives in our CGoLWorld.
 * 
 * @author sash1501 
 * @version 0.1
 */
public class CGoLBeing
{
	// species = what kind of species do we have? (SurvivalStrategy)
    private CGoLSpecies species;
    private int tribe;
    
    /**
     * Constructor for CGoLBeing
     */
    public CGoLBeing()
    {
    	species = new CGoLSpecies();
    	tribe = 0;  // 0 = fauna
    }

    public void setSpecies(CGoLSpecies species) {
    	this.species = species;
    }
    
    public CGoLSpecies getSpecies() {
    	return species;
    }
    
    public void setTribe(int tribe) {
    	this.tribe = tribe;
    }
    
    public int getTribe() {
    	return tribe;
    }
    
}
