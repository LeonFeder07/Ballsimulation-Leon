public class Speedball extends Farbball{
   public double speed;
    public Speedball(double pX, double pY, double pZ, double pRadius) {
        super(pX, pY, pZ, pRadius);
        speed=0;

    }
   public boolean wandgetroffen(){
        if(kugel.gibX()>=950||kugel.gibX()<=-950){
            return true;
        }else{return false;}

   }

    public void speedup(){
        if(getroffen()||wandgetroffen()){
            speed=speed +0.1;

        }
        if( kugel.gibY()>=300) {
            kugel.setzePosition(kugel.gibX(),299, kugel.gibZ());

        }
        if( kugel.gibY()<=20) {
            kugel.setzePosition(kugel.gibX(),21, kugel.gibZ());

        }
        if(getroffen() ) {

            a = a * -1;
        }

        kugel.verschiebe(0, -1 * a*speed   , 0);

    }
}
