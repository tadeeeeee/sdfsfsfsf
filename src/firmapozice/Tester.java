package firmapozice;

public class Tester extends Zamestnanec{
    private int pocetChyb;

    public Tester(String jmeno, String prijmeni, String pozice, double plat) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetChyb = 0;
    }

    public void naselNovouChybu() {
        pocetChyb++;
    }
}
