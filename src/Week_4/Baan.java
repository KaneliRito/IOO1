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

    public String voegF1AutoToe(F1Auto f1Auto) {
        if (autosOpDeBaan < capaciteitBaan) {
            f1Autos[autosOpDeBaan] = f1Auto;
            System.out.println("F1Auto met nummer (f1AutoNummer)van coureur (coureurNaam)is toegevoegd aan de baan (baanNaam)");
            autosOpDeBaan++;
            return ("toegevoegd");

        } else {
            return ("\n de baan is vol!");

        }

    }
    public void startRace();


}
