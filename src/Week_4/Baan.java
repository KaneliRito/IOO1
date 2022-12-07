package Week_4;

import org.w3c.dom.ls.LSOutput;

public class Baan {

    private String baanNaam;
    private int capaciteitBaan;
    F1Auto[] f1Autos;
    private int autosOpDeBaan = 0;


    public Baan(String baanNaam, int capaciteitBaan) {
        this.baanNaam = baanNaam;
        this.capaciteitBaan = capaciteitBaan;
        this.f1Autos = new F1Auto[capaciteitBaan];
    }

    public void voegF1AutoToe(F1Auto f1Auto) {
        if (autosOpDeBaan < capaciteitBaan) {
            f1Autos[autosOpDeBaan] = f1Auto;
            System.out.println("F1Auto met nummer (f1AutoNummer)van coureur (coureurNaam)is toegevoegd aan de baan (baanNaam)");
            autosOpDeBaan++;


        } else {
            System.out.println("Baan zit vol!");
        }


    }

    public void startRace() {
        for (int i = 0; i < autosOpDeBaan; i++) {
            double min = 0.5;
            double max = 1.5;
            double random = min + Math.random() * (max - min);
            double newValue = f1Autos[i].getBasisSnelheid() * random;
            f1Autos[i].setGeredenSnelheid(newValue);
            System.out.println(f1Autos[i].getGeredenSnelheid());


        }
    }

    public void bepaalWinnaar() {
        F1Auto winnaar = f1Autos[0];
        for (int i = 0; i < capaciteitBaan; i++) {
            if (f1Autos[i].getGeredenSnelheid() > winnaar.getGeredenSnelheid()) {
                winnaar = f1Autos[i];



            }

        }System.out.println(winnaar.getCoureur().getNaam() + " heeft gewonnen met autonummer: " + winnaar.getNummer());
    }
}