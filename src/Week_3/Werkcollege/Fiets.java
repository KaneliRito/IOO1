package Week_3.Werkcollege;

public class Fiets {
    private String Kleur;
    private int versnellingen;
    private int prijs;
    Bel bel;

    public Fiets(String kleur, int versnellingen, int prijs){
        this.Kleur = kleur;
        this.prijs = prijs;
        this.versnellingen = versnellingen;
        this.bel = new Bel();

    }


    public String getKleur() {
        return Kleur;
    }

    public int getVersnellingen() {
        return versnellingen;
    }

    public int getPrijs() {
        return prijs;
    }

    public Bel getBel(){return bel;}




}


