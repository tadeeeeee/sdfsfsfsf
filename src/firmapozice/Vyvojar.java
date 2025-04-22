package firmapozice;
import java.util.List;
public class Vyvojar extends Zamestnanec {
    private List<String> programovaciJazyky;

    public Vyvojar(String jmeno, String prijmeni, String pozice, double plat, List<String> programovaciJazyky) {
        super(jmeno, prijmeni, pozice, plat);
        this.programovaciJazyky = programovaciJazyky;
    }

    @Override
    public void vypisInfo() {
        super.vypisInfo();
        System.out.println("Programovací jazyky: " + String.join(", ", programovaciJazyky));
    }
}
