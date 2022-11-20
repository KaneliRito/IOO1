import java.util.Scanner;

public class TafelTonenFor {
    private int getal;

    TafelTonenFor(int getal) {
        this.getal = getal;

    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("van welk getal tussen de 1 en 100 wil je de tafel zien? ");
        int getal = userInput.nextInt();
        TafelTonenFor tafelTonenFor = new TafelTonenFor(getal);
        if (getal >= 0 && getal <= 10) {
            for (int i = 1; i < 11; i++) {
                System.out.println(i + "x" + getal + "=" + i * getal);
            }

        }else { System.out.print("Dit getal mag niet");

        }
    }
}