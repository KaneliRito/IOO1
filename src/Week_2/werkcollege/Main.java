package werkcollege;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        VliegtuigspottenApp vliegtuigspottenApp = new VliegtuigspottenApp();
        vliegtuigspottenApp.maakVliegtuigenAan();
        Vliegtuig[] spotLijst = vliegtuigspottenApp.getSpotLijst();
        for (int i = 0; i < spotLijst.length ; i++){
            String nieuw = spotLijst[i].getVliegtuigType();
            vliegtuigspottenApp.bepaalUniekheidVanVliegtuig(nieuw);
        }


    }
}
