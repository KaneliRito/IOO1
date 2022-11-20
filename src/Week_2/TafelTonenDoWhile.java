import java.util.Scanner;

public class TafelTonenDoWhile {
    private int getal;

    TafelTonenDoWhile(int getal) {
        this.getal = getal;

    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("van welk getal tussen de 1 en 100 wil je de tafel zien? ");
        int getal = userInput.nextInt();
        TafelTonenFor tafelTonenFor = new TafelTonenFor(getal);
        int i = 1;
        if (getal >= 0 && getal <= 10) {
            do {
                System.out.println(i + "x" + getal + "=" + i * getal);
                i++;
            }
            while (i < 11);

        }else { System.out.print("Dit getal mag niet");

        }

    }
}