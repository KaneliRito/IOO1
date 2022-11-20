import java.util.Scanner;

public class SecondenOmrekenen {
    private long jaar = 31556926;
    private long dagen = 86400;
    private long uren = 3600;
    private long minuten = 60;

    private long aantalSeconden;
    SecondenOmrekenen(long aantalSeconden){
        this.aantalSeconden = aantalSeconden;
        System.out.println(aantalSeconden);
        long jaarBer = (aantalSeconden - (aantalSeconden % jaar)) / jaar;
        long newAantalSec = aantalSeconden % jaar;
        long dagenBer = (newAantalSec - (newAantalSec % dagen)) / dagen;
        long newAantalSec2 = newAantalSec % dagen;
        long urenBer = (newAantalSec2 - (newAantalSec2 % uren)) / uren;
        long newAantalSec3 = newAantalSec2 % uren;
        long minBer = (newAantalSec3 - (newAantalSec3 % minuten)) / minuten;
        long newAantalSec4 = newAantalSec3 % minuten;

        System.out.print("Aantal jaar: "+jaarBer+"\n");
        System.out.print("Aantal dagen: "+dagenBer+"\n");
        System.out.print("Aantal uren: "+urenBer+"\n");
        System.out.print("Aantal minuten: "+minBer+"\n");
        System.out.print("Aantal seconden: "+newAantalSec4+"\n");

        }


    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Hoeveel seconden moeten er worden omgerekend? ");
        Long aantalsec = userInput.nextLong();
        SecondenOmrekenen secondenOmrekenen = new SecondenOmrekenen(aantalsec);




    }
}
