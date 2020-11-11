import java.util.Random;

public class Blume {

    private Random rnd = new Random();

    private int blaetterCount = 7 + rnd.nextInt(5);

    public Blume(int blaetterCount) {
        this.blaetterCount = blaetterCount;
    }
    public Blume(){}

    void ausreissen(boolean geschlecht) {

        for (int i = 1; i <= blaetterCount; i++) {

            if (i % 2 == 0) {
                if (geschlecht) {
                    System.out.println("Er liebt mich.");
                } else {
                    System.out.println("Sie liebt mich.");
                }
            } else {
                if (geschlecht) {
                    System.out.println("Er liebt mich nicht.");
                } else {
                    System.out.println("Sie liebt mich nicht.");
                }
            }
        }
    }
        public static void main (String[]args){

            Blume rose = new Blume();
            rose.ausreissen(true);

            Blume tulpe = new Blume();
            tulpe.ausreissen(false);



    }
}
