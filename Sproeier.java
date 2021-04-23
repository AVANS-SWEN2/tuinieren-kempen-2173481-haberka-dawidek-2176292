public class Sproeier {
	private String merk;

	public Sproeier() {
		super();
		merk = "Gardena";
	}

	public String getHoseBrand() {
		return merk;
	}

	public void sproeien(boolean sproeien) {
		System.out.println("Sproeien wordt " + (sproeien ? "aan" : "uit") + "gezet");
	}
}
