
public class Schach {

	 	private Feld[][] feld = new Feld[8][8];
	    private boolean werAmZug;

	    
	    public Schach(Feld[][] feld) {
	        this(feld, true);
	    }

		public Schach(Feld[][] feld, boolean werAmZug) {
	        this.feld = feld;
	        this.werAmZug = werAmZug;
	    }

	    public Feld[][] getfeld() {
	        return feld;
	    }

	    public void setFeld(Feld[][] feld) {
	        this.feld = feld;
	    }

	    public boolean getWerAmZug() {
	        return werAmZug;
	    }

	    public void setWerAmZug(boolean werAmZug) {
	        this.werAmZug = werAmZug;
	    }
	    
	    public void ausgabe() {
			for (int i = 0; i < feld.length;i++)
			{
				for (int j = 0; j < feld[0].length;j++)
				{
					System.out.print(feld[i][j]);
				}
				System.out.println();
			}
		}
	public static void main(String[] args) {
		
	}

}
