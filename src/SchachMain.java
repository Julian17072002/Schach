
public class SchachMain {
	
	public static void main(String[] args) {
		Figur König = Figur.koenig;
		Figur Dame = Figur.dame;
		Figur Läufer = Figur.laeufer;
		Figur Springer = Figur.springer;
		Figur Turm = Figur.turm;
		Figur Bauer = Figur.bauer;
		
		Farbe w = Farbe.weiß;
		Farbe s = Farbe.schwarz;
		
		bauer bauer1 = new bauer(w, Bauer);
		bauer bauer2 = new bauer(w, Bauer);
		bauer bauer3 = new bauer(w, Bauer);
		bauer bauer4 = new bauer(w, Bauer);
		bauer bauer5 = new bauer(w, Bauer);
		bauer bauer6 = new bauer(w, Bauer);
		bauer bauer7 = new bauer(w, Bauer);
		bauer bauer8 = new bauer(w, Bauer);
		turm turm1 = new turm(w, Turm);
		springer springer1 = new springer(w, Springer);
		laeufer laeufer1 = new laeufer(w, Läufer);
		turm turm2 = new turm(w, Turm);
		springer springer2 = new springer(w, Springer);
		laeufer laeufer2 = new laeufer(w, Läufer);
		dame dame1 = new dame(w, Dame);
		koenig koenig1 = new koenig(w, König);
		
		bauer bauer9 = new bauer(s, Bauer);
		bauer bauer10 = new bauer(s, Bauer);
		bauer bauer11 = new bauer(s, Bauer);
		bauer bauer12 = new bauer(s, Bauer);
		bauer bauer13 = new bauer(s, Bauer);
		bauer bauer14 = new bauer(s, Bauer);
		bauer bauer15 = new bauer(s, Bauer);
		bauer bauer16 = new bauer(s, Bauer);
		turm turm3 = new turm(s, Turm);
		springer springer3 = new springer(s, Springer);
		laeufer laeufer3 = new laeufer(s, Läufer);
		turm turm4 = new turm(s, Turm);
		springer springer4 = new springer(s, Springer);
		laeufer laeufer4 = new laeufer(s, Läufer);
		dame dame2 = new dame(s, Dame);
		koenig koenig2 = new koenig(s, König);
		
		
		
		
		
	}

}
