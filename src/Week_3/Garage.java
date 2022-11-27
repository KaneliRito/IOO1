package Week_3;

import Week_3.Auto;

import java.util.Scanner;

public class Garage {
    private int startkapitaal = 10000;
    private Auto[] voorraad = new Auto[5];
    private Klant[] klantenbestand = new Klant[5];
    private int gekozenKlant;
    private int gekozenAuto;

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.klantenTonen();
        garage.gekozenKlant = garage.keuzeGebruiker();
        garage.autosTonen();
        garage.gekozenAuto = garage.keuzeAuto();
        garage.geldCheck(garage.gekozenKlant, garage.gekozenAuto);
    }

    public void autoAanmaken() {
        Auto rolceRoyce = new Auto("Rolce Royce", "Zilver", 100000);
        Auto batMobiel = new Auto("Batmobiel", "Zwart", 250000);
        Auto catMobiel = new Auto("Catmobiel", "Zwart", 200000);
        Auto kawasaki_1 = new Auto("Kawasaki", "Blauw", 15000);
        Auto kawasaki_2 = new Auto("Kawasaki", "Rood", 10000);
        voorraad[0] = rolceRoyce;
        voorraad[1] = batMobiel;
        voorraad[2] = catMobiel;
        voorraad[3] = kawasaki_1;
        voorraad[4] = kawasaki_2;
    }

    public void klantAanmaken() {
        Klant klant1 = new Klant(1, "Alfred", 100000);
        Klant klant2 = new Klant(2, "Bruce", 250000);
        Klant klant3 = new Klant(3, "Cat", 200000);
        Klant klant4 = new Klant(4, "Grayson", 15000);
        Klant klant5 = new Klant(5, "Robin", 10000);
        klantenbestand[0] = klant1;
        klantenbestand[1] = klant2;
        klantenbestand[2] = klant3;
        klantenbestand[3] = klant4;
        klantenbestand[4] = klant5;
    }

    public void klantenTonen() {
        klantAanmaken();
        for (int i = 0; i < klantenbestand.length; i++) {
            System.out.println(klantenbestand[i].getId() + " " + klantenbestand[i].getNaam());
        }
    }

    public int keuzeGebruiker() {
        Scanner userInput = new Scanner(System.in);
        System.out.print(">> ");
        int gekozenKlant = userInput.nextInt();
        int index = gekozenKlant - 1;
        System.out.println("Welkom " + klantenbestand[index].getNaam() + " bij garage - kies een auto");
        return index;
    }

    public void autosTonen() {
        autoAanmaken();
        for (int i = 0; i < voorraad.length; i++) {
            System.out.println((i + 1) + " " + voorraad[i].getNaam() + " " + voorraad[i].getKleur() + " " + voorraad[i].getVerkoopprijs());
        }
    }

    public int keuzeAuto() {
        Scanner userInput = new Scanner(System.in);
        System.out.print(">> ");
        int keuze = userInput.nextInt();
        int index = keuze - 1;
        return index;
    }

    public void geldCheck(int gekozenKlant, int gekozenAuto) {
        if(klantenbestand[gekozenKlant].getBedrag() >= voorraad[gekozenAuto].getVerkoopprijs()){
            System.out.println("Dank voor je aankoop - je hebt de " + voorraad[gekozenAuto].getNaam() + " gekocht");
            int bijschrijving = voorraad[gekozenAuto].getVerkoopprijs();
            int geldKlant = klantenbestand[gekozenKlant].getBedrag();
            klantenbestand[gekozenKlant].setBedrag(geldKlant-bijschrijving);
            startkapitaal += bijschrijving;
            System.out.println("De garage heeft nu "+startkapitaal+" in de kassa.");
        } else {
            System.out.println("Je hebt helaas niet genoeg geld!");
        }
    }


}