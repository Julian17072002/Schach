
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
		
		
		Schach schachbrett = new Schach(Brettlaenge);
		
		
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
		
		
		schachbrett.befuellen(koenig1, 3, 0);
		
		schachbrett.befuellen(dame1, 4, 0);

		schachbrett.befuellen(laeufer1, 2, 0);

		schachbrett.befuellen(laeufer2, 5, 0);
		
		schachbrett.befuellen(springer1, 1, 0);
		
		schachbrett.befuellen(springer2, 6, 0);
		
		schachbrett.befuellen(turm1, 0, 0);
		
		schachbrett.befuellen(turm2, 7, 0);
		
		schachbrett.befuellen(bauer1, 3, 1);
	
		schachbrett.befuellen(bauer2, 4, 1);
	
		schachbrett.befuellen(bauer3, 2, 1);
		
		schachbrett.befuellen(bauer4, 5, 1);
		
		schachbrett.befuellen(bauer5, 1, 1);
		
		schachbrett.befuellen(bauer6, 0, 1);
	
		schachbrett.befuellen(bauer7, 6, 1);
	
		schachbrett.befuellen(bauer8, 7, 1);
	
		
		schachbrett.befuellen(koenig2, 4, 7);

		schachbrett.befuellen(dame2, 3, 7);

		schachbrett.befuellen(laeufer3, 2, 7);

		schachbrett.befuellen(laeufer4, 5, 7);

		schachbrett.befuellen(springer3, 1, 7);
	
		schachbrett.befuellen(springer4, 6, 7);

		schachbrett.befuellen(turm3, 7, 7);

		schachbrett.befuellen(turm4, 0, 7);
	
		schachbrett.befuellen(bauer9, 0, 6);

		schachbrett.befuellen(bauer10, 1, 6);
	
		schachbrett.befuellen(bauer11, 2, 6);
	
		schachbrett.befuellen(bauer12, 3, 6);
		
		schachbrett.befuellen(bauer13, 4, 6);
		
		schachbrett.befuellen(bauer14, 5, 6);
		
		schachbrett.befuellen(bauer15, 6, 6);
		
		schachbrett.befuellen(bauer16, 7, 6);
		
		
		schachbrett.brettAusgabe();
	}

}
