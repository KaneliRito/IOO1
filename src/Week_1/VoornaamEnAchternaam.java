public class VoornaamEnAchternaam {
    private String voorNaam = "Jurgen";
    private String achterNaam = "Vermeer";
    private String namenAanElkaar;
    public static void main(String[] args){
        VoornaamEnAchternaam namen = new VoornaamEnAchternaam();
        namen.namenAanElkaar = namen.voorNaam + " " + namen.achterNaam;
        System.out.println(namen.namenAanElkaar);
    }
}
