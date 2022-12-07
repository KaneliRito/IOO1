package Week_4;

public class F1Auto {
    private double basisSnelheid;
    private double geredenSnelheid = 0.0;
    private int nummer;
    private Coureur coureur;

    public F1Auto(double basisSnelheid, int nummer, Coureur coureur) {
        this.basisSnelheid = basisSnelheid;
        this.nummer = nummer;
        this.coureur = coureur;

    }

    public double getBasisSnelheid() {
        return basisSnelheid;
    }

    public double getGeredenSnelheid() {
        return geredenSnelheid;
    }

    public int getNummer() {
        return nummer;
    }

    public void setBasisSnelheid(double basisSnelheid) {
        this.basisSnelheid = basisSnelheid;
    }

    public Coureur getCoureur() {
        return coureur;
    }

    public void setGeredenSnelheid(double geredenSnelheid) {
        this.geredenSnelheid = geredenSnelheid;
    }
}
