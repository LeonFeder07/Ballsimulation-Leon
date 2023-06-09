public class Farbball extends Ball{
  int farbe;
    public Farbball(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);
        farbe=0;
    }
    public void farbwechsel(){
        if(farbe==0){
            kugel.setzeFarbe(1,1,0);
            farbe=1;
        }
        if(farbe==1){
            kugel.setzeFarbe(1,0,0);
            farbe=2;
        }
        if(farbe==2){
            kugel.setzeFarbe(1,0,1);
            farbe=3;
        }
        if(farbe==3){
            kugel.setzeFarbe(0,1,1);
            farbe=0;
        }

    }
}
