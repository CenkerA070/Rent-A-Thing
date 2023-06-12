import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hallo, wat wilt u huren?");
        System.out.println("1. Auto");
        System.out.println("2. Vrachtauto");
        System.out.println("3. Boormachine");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Verhuur verhuur;

        switch (choice) {
            case 1 -> {
                System.out.println("Beschikbare auto's:");
                Auto auto1 = new Auto();
                auto1.setMerk("Toyota");
                auto1.setHuurprijs(50.0);
                auto1.setVerzekeringsPrijs(10.0);
                auto1.setVerhuurd(false);

                Auto auto2 = new Auto();
                auto2.setMerk("Honda");
                auto2.setHuurprijs(60.0);
                auto2.setVerzekeringsPrijs(15.0);
                auto2.setVerhuurd(true);

                Auto auto3 = new Auto();
                auto3.setMerk("BMW");
                auto3.setHuurprijs(80.0);
                auto3.setVerzekeringsPrijs(20.0);
                auto3.setVerhuurd(false);

                System.out.println("1. " + auto1.getMerk() + " - €" + auto1.getHuurprijs() + " per dag - " + (auto1.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));
                System.out.println("2. " + auto2.getMerk() + " - €" + auto2.getHuurprijs() + " per dag - " + (auto2.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));
                System.out.println("3. " + auto3.getMerk() + " - €" + auto3.getHuurprijs() + " per dag - " + (auto3.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));

                int carChoice = scanner.nextInt();
                scanner.nextLine();

                switch (carChoice) {
                    case 1 -> {
                        verhuur = auto1;
                    }
                    case 2 -> {
                        verhuur = auto2;
                    }
                    case 3 -> {
                        verhuur = auto3;
                    }
                    default -> {
                        System.out.println("Ongeldige keuze.");
                        scanner.close();
                        return;
                    }
                }
                Klant klant1 = new Klant();
                klant1.setNaam("SHooSh");
                klant1.setAchternaam("Doe");
                verhuur.setKlant(klant1);
            }
            case 2 -> {


                System.out.println("Beschikbare vrachtauto's:");
                VrachtAuto vrachtauto1 = new VrachtAuto();
                vrachtauto1.setMerk("Scania");
                vrachtauto1.setHuurprijs(100.0);
                vrachtauto1.setVerzekeringsPrijs(20.0);
                vrachtauto1.setVerhuurd(true);

                VrachtAuto vrachtauto2 = new VrachtAuto();
                vrachtauto2.setMerk("Volvo");
                vrachtauto2.setHuurprijs(120.0);
                vrachtauto2.setVerzekeringsPrijs(25.0);
                vrachtauto2.setVerhuurd(false);

                System.out.println("1. " + vrachtauto1.getMerk() + " - €" + vrachtauto1.getHuurprijs() + " per dag - " + (vrachtauto1.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));
                System.out.println("2. " + vrachtauto2.getMerk() + " - €" + vrachtauto2.getHuurprijs() + " per dag - " + (vrachtauto2.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));

                int truckChoice = scanner.nextInt();
                scanner.nextLine();

                switch (truckChoice) {
                    case 1 -> {
                        verhuur = vrachtauto1;
                    }
                    case 2 -> {
                        verhuur = vrachtauto2;
                    }
                    default -> {
                        System.out.println("Ongeldige keuze.");
                        scanner.close();
                        return;
                    }
                }

                Klant klant2 = new Klant();
                klant2.setNaam("John");
                klant2.setAchternaam("Doe");
                verhuur.setKlant(klant2);
            }
            case 3 -> {
                System.out.println("Beschikbare boormachines:");
                Boormachine boormachine1 = new Boormachine();
                boormachine1.setMerk("Bosch");
                boormachine1.setHuurprijs(20.0);
                boormachine1.setVerzekeringsPrijs(15.0);
                boormachine1.setVerhuurd(false);

                Boormachine boormachine2 = new Boormachine();
                boormachine2.setMerk("Makita");
                boormachine2.setHuurprijs(25.0);
                boormachine2.setVerzekeringsPrijs(18.0);
                boormachine2.setVerhuurd(true);

                System.out.println("1. " + boormachine1.getMerk() + " - €" + boormachine1.getHuurprijs() + " per dag - " + (boormachine1.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));
                System.out.println("2. " + boormachine2.getMerk() + " - €" + boormachine2.getHuurprijs() + " per dag - " + (boormachine2.isVerhuurd() ? "Niet beschikbaar" : "Beschikbaar"));

                int drillChoice = scanner.nextInt();
                scanner.nextLine();

                switch (drillChoice) {
                    case 1 -> {
                        verhuur = boormachine1;
                    }
                    case 2 -> {
                        verhuur = boormachine2;
                    }
                    default -> {
                        System.out.println("Ongeldige keuze.");
                        scanner.close();
                        return;
                    }
                }
                Klant klant3 = new Klant();
                klant3.setNaam("peter");
                klant3.setAchternaam("Doe");
                verhuur.setKlant(klant3);
            }
            default -> {
                System.out.println("Ongeldige keuze.");
                scanner.close();
                return;
            }
        }


        verhuur.checkVerhuurd(verhuur.isVerhuurd());

        if (verhuur.isVerhuurd()) {
            System.out.println("Dit item is al verhuurd aan " + verhuur.getKlant().getNaam());
        } else {
            System.out.println("Dit item is nog beschikbaar.");

            System.out.println("Hoe lang wilt u het lenen (in dagen)?");
            int lengteHuur = scanner.nextInt();
            verhuur.setLengtehuur(lengteHuur);


            System.out.println("Wilt u ook een verzekering? (ja/nee)");
            String insuranceChoice = scanner.next();

            if (insuranceChoice.equalsIgnoreCase("ja")) {
                verhuur.setVerzekering(true);
            } else {
                verhuur.setVerzekering(false);
            }

            System.out.println("Vul uw naam in:");
            String naam = scanner.next();
            System.out.println("Achternaam: ");
            String achternaam = scanner.next();

            Klant klant = new Klant();
            klant.setUser(naam, achternaam);

            verhuur.setKlant(klant);

            verhuur.setVerhuurd(true);
            System.out.println("Het item is nu verhuurd aan " + verhuur.getKlant().getNaam());

            double totaalPrijs = verhuur.berekenHuurprijs();
            System.out.println("Totaalprijs: " + totaalPrijs);
        }

        scanner.close();
    }
}
