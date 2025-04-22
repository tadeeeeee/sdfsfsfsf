package firmapozice;

import java.util.Arrays;

public class ZamestnaneckySystemApp {
    public static void main(String[] args) {
        Zamestnanec z1 = new Zamestnanec("Jan", "Novák", "Asistent", 30000);
        Manager m1 = new Manager("Eva", "Hrubá", "Manažer", 60000, 5);
        Vyvojar v1 = new Vyvojar("Petr", "Malý", "Vývojář", 50000, Arrays.asList("Java", "Python"));
        Tester t1 = new Tester("Lucie", "Velká", "Tester", 40000);

        z1.vypisInfo();
        m1.vypisInfo();
        v1.vypisInfo();
        t1.vypisInfo();

    }
    }
