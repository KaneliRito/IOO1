package Week_4;

public class Student {
    private String naam;
    private int leeftijd;

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
}
