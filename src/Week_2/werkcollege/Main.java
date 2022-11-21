package werkcollege;

public class Main {

    public static void main(String[] args){
        Vliegtuig boeing747 = new Vliegtuig("boeing 747", "747", 920);
        Vliegtuig airbusA380 = new Vliegtuig("Airbus A380", "A380", 1041);
        Vliegtuig Embraer190 = new Vliegtuig("Embrear 190", "190", 829);

        System.out.print(boeing747.getModelNummer()+" "+ "\n"+ boeing747.getVliegtuigType()+" "+ "\n" + boeing747.getSnelheidPerUur());




    }
}
