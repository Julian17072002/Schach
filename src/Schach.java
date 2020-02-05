
public class Schach {	
	

	    Spielfiguren[][] brett;
	    Farbe w = Farbe.WEISS;
		Farbe s = Farbe.SCHWARZ;
	    
	    public Schach(int x) {
	    	brett = new Spielfiguren[x][x];
		}
	    
	    public  boolean pruefen(int i, int j) {
			if (brett[i][j] == null) {
				return false;	
			}
			else {
				return true;	
			}
		}
	
	    public void befuellen(Spielfiguren f, int x, int y) {
			try {
				if (pruefen(x, y)) {
					System.out.println("Auf dem Feld ["+x+"] ["+y+"] liegt schon eine Speilfigur!\n");
				}
				else {
					brett[x][y] = f;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Dieses Feld existiert nicht!\n");
				return;
			}
		}
	    
	    public int gesamtFiguren() {
	    	return gesamtFiguren(s) + gesamtFiguren(w);
		}
	    
		public int gesamtFiguren(Farbe f) {
			int anz = 0;
			for(int i=0;i<brett.length; i++) {
				for (int j=0;j<brett.length;j++) {
					if(brett[i][j] != null && brett[i][j].farbe == f) {
						anz++;
					}
				}
			}
			return anz;
		}
	    
	    public void brettAusgabe() {

	
			for (int i = 0; i < brett.length; i++) {
				System.out.print(i+" |");
				for (int j = 0; j < brett.length; j++) {
					try {
						System.out.print(brett[j][i].figur + "|");
					} catch (NullPointerException e) {
						System.out.print(" |");
					}
				}
				System.out.println();
			}
		}
}
