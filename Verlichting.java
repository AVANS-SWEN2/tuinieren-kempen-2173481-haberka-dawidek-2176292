
public class Verlichting {

	private boolean licht;

	public Verlichting() {
		super();
	}

	public boolean isLicht() {
		return licht;
	}

	public void setLicht(boolean licht) {
		this.licht = licht;
		System.out.println("Licht wordt " + (licht ? "aan" : "uit") + "gezet");
	}

}
