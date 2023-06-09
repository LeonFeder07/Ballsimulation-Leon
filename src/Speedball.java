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
            speed=speed +0.5;

        }
        kugel.verschiebe(0, -1 * a*speed   , 0);
        if (getroffen()) {
            a = a * -1;

        }
    }
}
