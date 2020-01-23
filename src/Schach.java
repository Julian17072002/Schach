
public class Schach {

	 	private static String[][] feld = new String[8][8];
	    private boolean werAmZug;

	    
	    public Schach(String[][] feld) {
	        this(feld, true);
	    }

		public Schach(String[][] feld, boolean werAmZug) {
	        Schach.feld = feld;
	        this.werAmZug = werAmZug;
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
	    
	    public static void ausgabe() {
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
