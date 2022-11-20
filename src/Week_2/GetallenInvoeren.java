import java.util.Scanner;
import java.util.*;
public class GetallenInvoeren {

    public ArrayList<Integer> voerInGetallen(int aantalGetallen) {
        int i = 1;
        ArrayList<Integer> nummerArray = new ArrayList<Integer>() {
        };
        while (i < 1 + aantalGetallen) {
            Scanner userinput = new Scanner(System.in);
            System.out.print("Voer getal " + i + " in: ");
            int getalInput = userinput.nextInt();
            nummerArray.add(getalInput);
            i++;
        }

        return nummerArray;
    }

    public void bepaalMaximum(ArrayList<Integer> arrayNummers) {
        System.out.print(Collections.max(arrayNummers)+"\n");
    }

    public void bepaalMinimum(ArrayList<Integer> arrayNummers) {
        System.out.print(Collections.min(arrayNummers)+"\n");
    }
    public void pakAlleEvenGetallen(ArrayList<Integer> arrayNummers){
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> evenGetallenArray = new ArrayList<Integer>(){
        };
        for (int i = 0; i < arrayNummers.size(); i++){
            if(arrayNummers.get(i) %2==0)
                evenGetallenArray.add(arrayNummers.get(i));


        }System.out.print(evenGetallenArray+"\n");

    }
    public void toonGetallen(ArrayList<Integer> arrayNumbers){
        ArrayList<Integer> alleGetallenArray = new ArrayList<Integer>(){
        };
        for (int i = 0; i <arrayNumbers.size(); i++){
            System.out.println("Getal "+(i+1)+": "+arrayNumbers.get(i));

        }
    }

    public static void main(String[] args){
        GetallenInvoeren getallenInvoeren = new GetallenInvoeren();
        Scanner userinput = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je invoeren? ");
        int invoerGetal = userinput.nextInt();
//      ArrayList<Integer> startProgram = getallenInvoeren.voerInGetallen(invoerGetal);
        ArrayList<Integer> newArray = getallenInvoeren.voerInGetallen(invoerGetal);
        getallenInvoeren.toonGetallen(newArray);
        getallenInvoeren.bepaalMaximum(newArray);
        getallenInvoeren.bepaalMinimum(newArray);
        getallenInvoeren.pakAlleEvenGetallen(newArray);

//      getallenInvoeren.bepaalMaximum(getallenInvoeren.voerInGetallen(invoerGetal));

    }
}
