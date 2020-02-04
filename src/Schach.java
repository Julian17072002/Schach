
public class Schach {	
	

	    Spielfiguren[][] brett;

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
	    
	    public void brettAusgabe() {
//			System.out.println();
//			System.out.print("   ");
//			for (int i = 0; i < brett.length; i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println("");
	
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
