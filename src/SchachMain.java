
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
		
		Bauer bauer1 = new Bauer(w, Bauer);
		Bauer bauer2 = new Bauer(w, Bauer);
		Bauer bauer3 = new Bauer(w, Bauer);
		Bauer bauer4 = new Bauer(w, Bauer);
		Bauer bauer5 = new Bauer(w, Bauer);
		Bauer bauer6 = new Bauer(w, Bauer);
		Bauer bauer7 = new Bauer(w, Bauer);
		Bauer bauer8 = new Bauer(w, Bauer);
		Turm turm1 = new Turm(w, Turm);
		Springer springer1 = new Springer(w, Springer);
		Laeufer laeufer1 = new Laeufer(w, Läufer);
		Turm turm2 = new Turm(w, Turm);
		Springer springer2 = new Springer(w, Springer);
		Laeufer laeufer2 = new Laeufer(w, Läufer);
		Dame dame1 = new Dame(w, Dame);
		Koenig koenig1 = new Koenig(w, König);
		
		Bauer bauer9 = new Bauer(s, Bauer);
		Bauer bauer10 = new Bauer(s, Bauer);
		Bauer bauer11 = new Bauer(s, Bauer);
		Bauer bauer12 = new Bauer(s, Bauer);
		Bauer bauer13 = new Bauer(s, Bauer);
		Bauer bauer14 = new Bauer(s, Bauer);
		Bauer bauer15 = new Bauer(s, Bauer);
		Bauer bauer16 = new Bauer(s, Bauer);
		Turm turm3 = new Turm(s, Turm);
		Springer springer3 = new Springer(s, Springer);
		Laeufer laeufer3 = new Laeufer(s, Läufer);
		Turm turm4 = new Turm(s, Turm);
		Springer springer4 = new Springer(s, Springer);
		Laeufer laeufer4 = new Laeufer(s, Läufer);
		Dame dame2 = new Dame(s, Dame);
		Koenig koenig2 = new Koenig(s, König);
		
		
		Schach schachbrett = new Schach(Brettlaenge);
		
		
		schachbrett.befuellen(koenig1, 0, 3);
		koenig1.ausgabe();
		schachbrett.befuellen(dame1, 0, 4);
		dame1.ausgabe();
		schachbrett.befuellen(laeufer1, 0, 2);
		laeufer1.ausgabe();
		schachbrett.befuellen(laeufer2, 0, 5);
		laeufer2.ausgabe();
		schachbrett.befuellen(springer1, 0, 1);
		springer1.ausgabe();
		schachbrett.befuellen(springer2, 0, 6);
		springer2.ausgabe();
		schachbrett.befuellen(turm1, 0, 0);
		turm1.ausgabe();
		schachbrett.befuellen(turm2, 0, 7);
		turm2.ausgabe();
		schachbrett.befuellen(bauer1, 0, 3);
		bauer1.ausgabe();
		schachbrett.befuellen(bauer2, 0, 4);
		bauer2.ausgabe();
		schachbrett.befuellen(bauer3, 0, 2);
		bauer3.ausgabe();
		schachbrett.befuellen(bauer4, 0, 5);
		bauer4.ausgabe();
		schachbrett.befuellen(bauer5, 0, 1);
		bauer5.ausgabe();
		schachbrett.befuellen(bauer6, 0, 6);
		bauer6.ausgabe();
		schachbrett.befuellen(bauer7, 0, 0);
		bauer7.ausgabe();
		schachbrett.befuellen(bauer8, 0, 7);
		bauer8.ausgabe();
		
		schachbrett.befuellen(koenig2, 7, 4);
		koenig2.ausgabe();
		schachbrett.befuellen(dame2, 7, 3);
		dame2.ausgabe();
		schachbrett.befuellen(laeufer3, 7, 2);
		laeufer3.ausgabe();
		schachbrett.befuellen(laeufer4, 7, 5);
		laeufer4.ausgabe();
		schachbrett.befuellen(springer3, 0, 1);
		springer3.ausgabe();
		schachbrett.befuellen(springer4, 0, 6);
		springer4.ausgabe();
		schachbrett.befuellen(turm3, 0, 0);
		turm3.ausgabe();
		schachbrett.befuellen(turm4, 0, 7);
		turm4.ausgabe();
		schachbrett.befuellen(bauer9, 0, 3);
		bauer9.ausgabe();
		schachbrett.befuellen(bauer10, 0, 4);
		bauer10.ausgabe();
		schachbrett.befuellen(bauer11, 0, 2);
		bauer11.ausgabe();
		schachbrett.befuellen(bauer12, 0, 5);
		bauer12.ausgabe();
		schachbrett.befuellen(bauer13, 0, 1);
		bauer13.ausgabe();
		schachbrett.befuellen(bauer14, 0, 6);
		bauer14.ausgabe();
		schachbrett.befuellen(bauer15, 0, 0);
		bauer15.ausgabe();
		schachbrett.befuellen(bauer16, 0, 7);
		bauer16.ausgabe();
	}

}
