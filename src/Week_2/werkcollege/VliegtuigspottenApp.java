package werkcollege;

public class VliegtuigspottenApp {
    private Vliegtuig[] spotLijst;

    public Vliegtuig[] getSpotLijst(){
        return spotLijst;

    }

    public void maakVliegtuigenAan(){
        Vliegtuig boeing747 = new Vliegtuig("boeing 747", "747", 920);
        Vliegtuig airbusA380 = new Vliegtuig("Airbus A380", "A380", 1041);
        Vliegtuig embraer190 = new Vliegtuig("Embrear 190", "190", 829);
        spotLijst = new Vliegtuig[]{boeing747, airbusA380, embraer190};
    }
    public void bepaalUniekheidVanVliegtuig(String vliegtuig){
        switch(vliegtuig){
            case "boeing 747":
                System.out.println("Dit is een vrijveel voorkomend vliegtuig. Per dag vliegen er vanuit Schiphol gemiddeld 20 uit.");
                break;
            case "Airbus A380":
                System.out.println("Dit is een zeldzaam vliegtuig. Gemiddeld vliegen er maar 2 per dag uit Schiphol ");
                break;
            default:
                System.out.println("Wij hebben hiergeen data over helaas.");
                break;
        }


    }

}
