package Week_4;

public class Main {



    public static void main(String[] args) {
        Coureur max = new Coureur("Max Verstappen", "Red Bull");
        Coureur lewis = new Coureur("Lewis Hamilton", "Mercedes");
        Coureur kevin = new Coureur("Kevin Magnussen", "Haas");
        F1Auto autoMax = new F1Auto(300,1, max);
        F1Auto autoLewis = new F1Auto(290,44, lewis);
        F1Auto autoKevin = new F1Auto(20,20, kevin);

        System.out.println(autoMax.getBasisSnelheid());

        Baan zandvoort = new Baan("Zandvoort", 2);

        System.out.println(zandvoort.voegF1AutoToe(autoKevin));
        System.out.println(zandvoort.voegF1AutoToe(autoLewis));
        System.out.println(zandvoort.voegF1AutoToe(autoMax));


    }
}
