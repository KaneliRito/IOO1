package Week_5;

import java.util.Scanner;

public class Punt {
    private int xCord;
    private int yCord;

    public int[] Punt(){
        return(vraagPunt());
    }

    public Punt(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public int[] vraagPunt(){
        Scanner inputUser = new Scanner(System.in);
        System.out.println("x cord");
        int vraagX = inputUser.nextInt();
        System.out.println("Y cord");
        int vraagY = inputUser.nextInt();
        return new int[] {vraagX, vraagY};
    }


}
