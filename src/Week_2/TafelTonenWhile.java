import java.util.Scanner;

public class TafelTonenWhile {
    private int getal;

    TafelTonenWhile(int getal) {
        this.getal = getal;

    }


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("van welk getal tussen de 1 en 100 wil je de tafel zien? ");
        int getal = userInput.nextInt();
        TafelTonenFor tafelTonenFor = new TafelTonenFor(getal);
        int i = 1;
        if (getal >= 0 && getal <= 10) {
            while (i < 11) {
                System.out.println(i + "x" + getal + "=" + i * getal);
                i++;
            }

        }else { System.out.print("Dit getal mag niet");

        }
    }
}
