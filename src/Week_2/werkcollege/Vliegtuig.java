package werkcollege;

public class Vliegtuig {

    private String vliegtuigType;
    private String modelNummer;
    private int snelheidPerUur;

    public Vliegtuig(String vliegtuigType, String modelNummer, int snelheidPerUur) {
        this.vliegtuigType = vliegtuigType;
        this.modelNummer = modelNummer;
        this.snelheidPerUur = snelheidPerUur;
    }
    public String getVliegtuigType(){
        return this.vliegtuigType;
    }

    public String getModelNummer(){
        return this.modelNummer;
    }

    public int getSnelheidPerUur(){
        return this.snelheidPerUur;
    }
}
