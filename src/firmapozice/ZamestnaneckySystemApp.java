package firmapozice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class ZamestnaneckySystemApp {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        t
        Zamestnanec z1 = new Zamestnanec("Jan", "Novák", "Asistent", 30000);
        Manager m1 = new Manager("Eva", "Hrubá", "Manažer", 60000, 5);
        Vyvojar v1 = new Vyvojar("Petr", "Malý", "Vývojář", 50000, Arrays.asList("Java", "Python"));
        Tester t1 = new Tester("Lucie", "Velká", "Tester", 40000);

        ArrayList<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec>();

        while (true) {
            System.out.println("1: Zamestnanec");
            System.out.println("2: manager");
            System.out.println("3: vyvojar");
            System.out.println("4: tester");
            int vstup= myObj.nextInt();

            switch (vstup){
                case 1:
            System.out.println(z1);
            break;
                case 2:
                    System.out.println(m1);
                    break;
                    case 3:
                        System.out.println(v1);
                        break;
                        case 4:
                            System.out.println(t1);
                            break;


            }
        }



    }
    }
