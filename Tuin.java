import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tuin {

    public static void main(String[] args) 
    throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
  
        System.out.println("Welkom in mijn tuin.");
        Sproeier slangetje = new Sproeier();
        TuinDomotica slimmeSchakelaar = new TuinDomotica();
        String input = "";
        do
        {
            System.out.println("Regen installatie staat op"+ slimmeSchakelaar.getSlimmeschakelaar());
            System.out.println("Regent het (JA/NEE)");
            input = reader.readLine();
            slimmeSchakelaar.setRegen(input.equalsIgnoreCase("JA"));

            System.out.print("Wilt u stoppen (JA/NEE)");
            input = reader.readLine();

        } while (!input.equalsIgnoreCase("JA"));
        System.out.println(slangetje.getHoseBrand());
        

    }
}