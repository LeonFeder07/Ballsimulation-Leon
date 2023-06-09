public class Farbball extends Gravball{
  int farbe;
    public Farbball(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);
        farbe=0;
    }
    public void farbwechsel(double pR,double pG,double pB){

            kugel.setzeFarbe(pR,pG,pB);



    }
}
