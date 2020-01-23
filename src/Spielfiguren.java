
public abstract class Spielfiguren {

	enum figurenSchwarz {koenig, dame, laeufer, springer, turm, bauer} 
	enum figurenWeiﬂ {koenig, dame, laeufer, springer, turm, bauer}
	
	private boolean farbeWeiss;
	private boolean bewegen;
	
	public boolean getFarbeWeiss() {
		return farbeWeiss;
	}

	public void setFarbeWeiss(boolean farbeWeiss) {
		this.farbeWeiss = farbeWeiss;
	}
	
	public boolean getBewegen() {
		return bewegen;
	}
	
	public void setBewegen(boolean bewegen) {
		this.bewegen = bewegen;
	}
	
	public static void main(String[] args) {
		
	}
	
}
