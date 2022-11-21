package werkcollege;

public class Oefening {

    public void isDeelbaarDoorVier(int getal){
        int eenGetal = getal % 4;
        if (eenGetal == 0){
            System.out.print("Dit getal is deelbaar door 4!");
        }else{System.out.print("Helaas is dit getal neit deelbaar door 4.");}


    }


    public static void main(String[] args){
        int[] nummerLijst = new int[]{1,2,3};
        String[] namenLijst = new String[]{"Severus Snape", "Harry Potter"};
        
        for (int i = 0; i < nummerLijst.length; i++){
            System.out.print(nummerLijst[i]+"\n");
        }
        for (int i = 0; i < namenLijst.length; i++){
            System.out.print(namenLijst[i]+"\n");
    }

        Oefening oefening = new Oefening();
        oefening.isDeelbaarDoorVier(4);


}}
