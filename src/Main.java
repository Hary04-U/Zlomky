import java.util.Scanner;

public class Main {
    static Scanner vstup = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Zadejte čitatel 1. zlomku: ");
        int citatel1 = vstup.nextInt();
        System.out.println("Zadejte jmenovatel 1. zlomku: ");
        int jmenovatel1 = vstup.nextInt();
        System.out.println("Zadejte čitatel 1. zlomku: ");
        int citatel2 = vstup.nextInt();
        System.out.println("Zadejte jmenovatel 1. zlomku: ");
        int jmenovatel2 = vstup.nextInt();
        int spolJmenovatel = jmenovatel1 * jmenovatel2;
        System.out.println("1. sčítaní");
        System.out.println("2. odčítaní");
        System.out.println("3. násobení");
        System.out.println("4. dělení");
        System.out.println("Vyberte operaci: ");
        int vyber = vstup.nextInt();
        int scitani;
        int odcitani;
        int nasobeni;
        int deleni;
        int vetsi;
        switch (vyber) {
            case 1:
                scitani = (spolJmenovatel / jmenovatel1) * citatel1 + (spolJmenovatel / jmenovatel2) * citatel2;
                vetsi = (scitani < spolJmenovatel) ? scitani : spolJmenovatel;
                for (int i = vetsi; i > 0; i--) {
                    if (scitani % i == 0 && spolJmenovatel % i == 0) {
                        scitani = scitani / i;
                        spolJmenovatel = spolJmenovatel / i;
                    }
                }
                System.out.println(scitani);
                System.out.println("--");
                System.out.println(spolJmenovatel);
                break;
            case 2:
                odcitani = (spolJmenovatel / jmenovatel1) * citatel1 - (spolJmenovatel / jmenovatel2) * citatel2;
                vetsi = (odcitani < spolJmenovatel) ? odcitani : spolJmenovatel;
                for (int i = vetsi; i > 0; i--) {
                    if (odcitani % i == 0 && spolJmenovatel % i == 0) {
                        odcitani = odcitani / i;
                        spolJmenovatel = spolJmenovatel / i;
                    }
                }
                System.out.println(odcitani);
                System.out.println("--");
                System.out.println(spolJmenovatel);
                break;
            case 3:
                nasobeni = citatel1 * citatel2;
                vetsi = (nasobeni < spolJmenovatel) ? nasobeni : spolJmenovatel;
                for (int i = vetsi; i > 0; i--) {
                    if (nasobeni % i == 0 && spolJmenovatel % i == 0) {
                        nasobeni = nasobeni / i;
                        spolJmenovatel = spolJmenovatel / i;
                    }
                }
                System.out.println(nasobeni);
                System.out.println("--");
                System.out.println(spolJmenovatel);
                break;
            case 4:
                int pomoc = citatel2;
                citatel2 = jmenovatel2;
                jmenovatel2 = pomoc;
                spolJmenovatel = jmenovatel1 * jmenovatel2;
                deleni = citatel1 * citatel2;
                vetsi = (deleni < spolJmenovatel) ? deleni : spolJmenovatel;
                for (int i = vetsi; i > 0; i--) {
                    if (deleni % i == 0 && spolJmenovatel % i == 0) {
                        deleni = deleni / i;
                        spolJmenovatel = spolJmenovatel / i;
                    }
                }
                System.out.println(deleni);
                System.out.println("--");
                System.out.println(spolJmenovatel);
                break;
            default:
        }

    }
}