import java.util.Scanner;

public class UserInputApp {
    public double straal;
    private int getal;


    public static void main(String[] args){
    UserInputApp app = new UserInputApp();
    Scanner userInput = new Scanner(System.in);
    System.out.print("voer een getal in: ");
    app.getal = userInput.nextInt();
    System.out.println(app.getal*2);


    }
}
