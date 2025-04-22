package firmapozice;

public class Zamestnanec {
    private String jmeno;
    private String prijmeni;
    private String pozice;
    private double plat;

public Zamestnanec(String jmeno, String prijmeni, String pozice, double plat) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.pozice = pozice;
    this.plat = plat;
}



public void vypisInfo(){
    System.out.println("Jmeno: " + jmeno + "prijmeni: " + prijmeni + "pozice: " + pozice + "plat: " + plat);
}

    public String getJmeno() { return jmeno; }
    public void setJmeno(String jmeno) { this.jmeno = jmeno; }
    public String getPrijmeni() { return prijmeni; }
    public void setPrijmeni(String prijmeni) { this.prijmeni = prijmeni; }
    public String getPozice() { return pozice; }
    public void setPozice(String pozice) { this.pozice = pozice; }
    public double getPlat() { return plat; }
    public void setPlat(double plat) { this.plat = plat; }
}
