package firmapozice;

public class Manager extends Zamestnanec {
        private int pocetRizenych;

        public Manager(String jmeno, String prijmeni, String pozice, double plat, int pocetRizenych) {
            super(jmeno, prijmeni, pozice, plat);
            this.pocetRizenych = pocetRizenych;
        }

        @Override
        public void vypisInfo() {
            super.vypisInfo();
            System.out.println("Počet řízených zaměstnanců: " + pocetRizenych);
        }

}

