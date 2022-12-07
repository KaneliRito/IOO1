package Week_3.Werkcollege;

public class Main {
    public static void main(String[] args) {
        Pokemon squirtle = new Pokemon("Squirtle", 75, 18);
        Pokemon charmander = new Pokemon("Charmander", 70, 23);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 80, 14);

        GevechtLeider gevechtLeider = new GevechtLeider(squirtle, charmander);
        gevechtLeider.printDeelnemers();
        gevechtLeider.startGevecht();
    }
}
