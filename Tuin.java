import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tuin {

	public static void main(String[] args) throws IOException {
		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Zonnescherm zonnescherm = new Zonnescherm();
		System.out.println("Welkom in mijn tuin.");
		Sproeier slangetje = new Sproeier();
		TuinDomotica slimmeSchakelaar = new TuinDomotica();
		String input = "";
		System.out.println("Regent het (JA/NEE)");
		slimmeSchakelaar.setRegen(reader.readLine().equalsIgnoreCase("JA"));
		slimmeSchakelaar.activate();
		do {
			System.out.println("Regen installatie staat op" + slimmeSchakelaar.getSlimmeschakelaar());
			System.out.println("Wilt u de toestand van de verlichting weten?");
			if(reader.readLine().equalsIgnoreCase("JA"))
            		System.out.println("Het tuinverlichting staat " + (slimmeSchakelaar.getLicht().isLicht() ? "aan" : "uit"));
			System.out.println("Wilt u de toestand van het zonnescherm-weerstand weten?");
			if(reader.readLine().equalsIgnoreCase("JA"))
			System.out.println("De weerstand is " + zonnescherm.getWeerstand());
			System.out.print("Wilt u stoppen (JA/NEE)");
			input = reader.readLine();

		} while (!input.equalsIgnoreCase("JA"));
		System.out.println(slangetje.getHoseBrand());
	}
}