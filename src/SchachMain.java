
public class SchachMain {
	
	final static int Brettlaenge = 8;
	
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
		
		
		Schach x = new Schach(Brettlaenge);
		
		
		x.befuellen(koenig1, 0, 5);
		koenig1.ausgabe();
		x.befuellen(dame1, 0, 4);
		dame1.ausgabe();
		x.befuellen(laeufer1, 0, 3);
		laeufer1.ausgabe();
		x.befuellen(laeufer2, 0, 6);
		laeufer2.ausgabe();
		
		
		x.befuellen(koenig2, 7, 4);
		koenig2.ausgabe();
		x.befuellen(dame2, 7, 5);
		dame2.ausgabe();
		x.befuellen(laeufer3, 7, 3);
		laeufer3.ausgabe();
		x.befuellen(laeufer4, 7, 6);
		laeufer4.ausgabe();
		
	}

}
