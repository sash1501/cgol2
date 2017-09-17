
public class CGoLField {

	public static final int PLAIN = 0;
	public static final int MOUNTAIN = 1;
	public static final int DESERT = 2;
	public static final int ICE = 3;
	public static final int GRASS = 4;
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

	public CGoLBeing getCgolbeing() {
		return cgolbeing;
	}

	public void setCgolbeing(CGoLBeing cgolbeing) {
		this.cgolbeing = cgolbeing;
	}

	public int getFieldtype() {
		return fieldtype;
	}

	public void setFieldtype(int fieldtype) {
		this.fieldtype = fieldtype;
	}
}
