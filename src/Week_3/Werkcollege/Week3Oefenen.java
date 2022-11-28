package Week_3.Werkcollege;

import java.util.Scanner;

public class Week3Oefenen {

    private static int totaal = 0;

    public static void main(String[] args){
        Scanner inputUsers = new Scanner(System.in);
        int getalInput = inputUsers.nextInt();
        if (getalInput > 50) {
            System.out.println("Getal is hoger dan 50");

        }else{
            System.out.println("De input is gelijk of kleiner dan 50");
        }
        Fiets[] fietsen = new Fiets[3];
        fietsen[0] = new Fiets("zwart", 23, 200);
        fietsen[1] = new Fiets("roze", 6, 100);
        fietsen[2] = new Fiets("blauw", 1, 1000);

        for ( int i = 0; i < fietsen.length; i++){
            System.out.println("Deze fiets heeft als kleur: "+fietsen[i].getKleur()+","+fietsen[i].getVersnellingen()+" versnellingen kost "+fietsen[i].getPrijs()+"euro");
            fietsen[i].getBel().bel();
            totaal += fietsen[i].getPrijs();


        }if (getalInput >= totaal){
            System.out.println("je kan de fiets kopen");


        }else {
            System.out.println("je kan de fiets niet kopen");
        }


}}
