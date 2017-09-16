
public class CGoLField {

	public static final int PLAIN = 0;
	public static final int MOUNTAIN = 1;
	// weitere Ebenentypen als Konstanten deklarieren
	
	private CGoLBeing cgolbeing;
	private int fieldtype;
	
	public CGoLField () {
		cgolbeing = null;
		fieldtype = PLAIN;
	}
	
	public CGoLField(int fieldtype) {
		this.fieldtype = fieldtype;
		this.cgolbeing = null;
	}
	
	public CGoLField(CGoLBeing cgolbeing) {
		this.cgolbeing = cgolbeing;
		this.fieldtype = PLAIN;
	}
	
	public CGoLField(CGoLBeing cgolbeing, int fieldtype) {
		this.cgolbeing = cgolbeing;
		this.fieldtype = fieldtype;
	}
}
