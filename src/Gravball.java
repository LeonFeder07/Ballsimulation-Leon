public class Gravball extends Ball {
    int a;

    public Gravball(double pX, double pY, double pZ, double pRadius) {

        super(pX, pY, pZ, pRadius);
        kugel.setzeFarbe(1, 0, 0);
        a = 1;
    }

    public boolean getroffen() {
        if (kugel.gibY() >= 300 || kugel.gibY() <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public void falle() {
        kugel.verschiebe(0, -1 * a*  , 0);
        if (getroffen()) {
            a = a * -1;

        }


    }
}
