package Week_4;

public class Module {
    private String naam;
    private int aantalEC;
    private final int maxStudent;
    private int aantalStudent;

    public Module(String naam, int aantalEC, int maxStudent, int aantalStudent) {
        this.naam = naam;
        this.aantalEC = aantalEC;
        this.maxStudent = maxStudent;
        this.aantalStudent = aantalStudent;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalEC() {
        return aantalEC;
    }

    public int getMaxStudent() {
        return maxStudent;
    }

    public int getAantalStudent() {
        return aantalStudent;
    }

    public void setAantalStudent(int aantalStudent) {
        this.aantalStudent = aantalStudent;
    }
}
