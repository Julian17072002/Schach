
public class Schach {

	 	private static String[][] feld = new String[8][8];
	    private boolean werAmZug;
	    Spielfiguren[][] br;
	    Farbe w = Farbe.weiﬂ;
	    Farbe s = Farbe.schwarz;

	    public Schach(int x) {
	    	br = new Spielfiguren[x][x];
		}

		public String[][] getfeld() {
	        return feld;
	    }

	    public void setFeld(String[][] feld) {
	        Schach.feld = feld;
	    }

	    public boolean getWerAmZug() {
	        return werAmZug;
	    }

	    public void setWerAmZug(boolean werAmZug) {
	        this.werAmZug = werAmZug;
	    }
	    
		@SuppressWarnings("unused")
		private boolean figurErkennung(int x, int y) {
			if (feld[x][y] == null) {
				return false;	
			}
			else {
				return true;	
			}
		}
	    
		public void befuellen(Spielfiguren a, int i, int j) {
			
		}
		
	    public static void brettAusgabe() {
	    	System.out.println(" ");
	    	System.out.println(" __  __  __  __  __  __  __  __ ");
			for (int i = 0; i < feld.length;i++)
			{
				for (int j = 0; j < feld[0].length;j++)
				{
					System.out.print("|__|");
				}
				System.out.println("");
			}
		}
	    
	    public static void main(String[] args) {
	    	brettAusgabe();

	    }

}
