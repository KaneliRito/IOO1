package Week_5;

import java.util.Scanner;

public class Cirkel {
    Punt punt;
    private int straal;
    private final double PI = 3.14159265359;


    public void vraagStraal() {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("geef straal");
        straal = inputUser.nextInt();


    }

    public void berekenOmtrek() {
        double omtrek = PI * (straal + straal);
        System.out.println(omtrek);
    }

    public void berekenOppervlakte() {
        double opper = PI * (straal * straal);
        System.out.println(opper);
    }

    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel();
        cirkel.vraagStraal();
        System.out.println("omtrek");
        cirkel.berekenOmtrek();
        System.out.println("opper");
        cirkel.berekenOppervlakte();
    }
}
