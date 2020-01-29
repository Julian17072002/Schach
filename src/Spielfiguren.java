
public abstract class Spielfiguren {
	
	private Figur figur;
	private Farbe farbe;

	Spielfiguren (Farbe farbe, Figur figur) {
		this.setFarbe(farbe);
		this.setFigur(figur);
	}

	public Figur getFigur() {
		return figur;
	}

	public void setFigur(Figur figur) {
		this.figur = figur;
	}

	public Farbe getFarbe() {
		return farbe;
	}

	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	
	//to do
	public void ausgabe() {
		
	}
	

}
