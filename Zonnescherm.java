
public class Zonnescherm {
	private int weerstand;
	private SchakelaarBinair dommeschakelaar;
	
	public Zonnescherm(){
	    dommeschakelaar = SchakelaarBinair.UIT;
		weerstand = 0;
	}
	
	public void setZonnescherm(boolean foobar) {
		if (foobar) {
			dommeschakelaar = SchakelaarBinair.AAN;
		}
		else {
			dommeschakelaar = SchakelaarBinair.UIT;
		}
	}
	
	public int getWeestand() {
		return weerstand;
	}
}
