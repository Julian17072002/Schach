
public class Schach {

	 	private static String[][] feld = new String[8][8];
	    private boolean werAmZug;
	    Farbe w = Farbe.weiﬂ;
	    Farbe s = Farbe.schwarz;

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
	    
	    public static void ausgabe() {
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
	    	ausgabe();

	    }

}
