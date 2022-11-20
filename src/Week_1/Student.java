

public class Student {
    private String naam;
    private int leeftijd;
    Student(int leeftijd, String naam){
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public static void main(String[] args) {
       Student student = new Student(21, " Hans");
       System.out.println(student.leeftijd + student.naam);


    }
}


