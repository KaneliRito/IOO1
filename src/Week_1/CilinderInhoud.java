import java.util.Scanner;

public class CilinderInhoud {
    private double straal;
    private double pi = 3.14;
    private double hoogte;



    public static void main(String[] args){
        // inhoud = straal * straal * pi * hoogte
        CilinderInhoud app = new CilinderInhoud();
        Scanner userinput = new Scanner(System.in);
        System.out.print("Geef straal op: ");
        app.straal = userinput.nextInt();
        System.out.print("Geef hoogte op: ");
        app.hoogte = userinput.nextInt();
        double inhoud = app.straal * app.straal * app.pi * app.hoogte;
        System.out.print("inhoud van cilinder is: "+inhoud);


    }
}
