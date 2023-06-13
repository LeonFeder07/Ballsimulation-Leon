import GLOOP.*;
public class Ballsimulation {
    private GLKamera kamera;
    GLLicht licht;
    GLHimmel himmel;
    GLBoden boden;
    private GLTastatur tastatur;

    private Ball ball;
    private Gravball gravball;
    private Farbball farbball;
    private Speedball speedball;
    private Hindernis[] hindernis;

    public Ballsimulation() {
        kamera = new GLSchwenkkamera(800, 500);
        kamera.setzePosition(0, 500, 2000);
        licht = new GLLicht();
        boden = new GLBoden("src/Boden.jpg");
        himmel = new GLHimmel("src/Himmel.jpg");
        tastatur = new GLTastatur();

        hindernis = new Hindernis[2];
        hindernis[0] = new Hindernis(1000, 200, 0, 50, 400, 1300);
        hindernis[1] = new Hindernis(-1000, 200, 0, 50, 400, 1300);

        ball = new Ball(0, 200, 0, 35);
        ball.werfen(new GLVektor(1, 0, 0));
        speedball = new Speedball(0, 200, 0, 35);
        speedball.werfen(new GLVektor(1, 0, 0));
        farbball = new Farbball(0, 300, 0, 35);
        farbball.werfen(new GLVektor(1, 0, 0));
        gravball = new Gravball(0, 50, 0, 35);
        gravball.werfen(new GLVektor(1, 0, 0));

        fuehreAus();
    }

    public void fuehreAus() {
        long time=System.currentTimeMillis();
        while (!tastatur.esc()) {
         if(System.currentTimeMillis()-time>= 500){
             double random=Math.random();
    farbball.farbwechsel(1-random,1-random/2,0+random);
    speedball.farbwechsel(1-random,0.5+random/2,1-random/2);
    time=System.currentTimeMillis();
}
            ball.bewegeDich;
            farbball.bewegeDich();
            gravball.bewegeDich();
            speedball.bewegeDich();
            gravball.falle();
            farbball.falle();
            speedball.falle();
            speedball.speedup();

            for (int j = 0; j < 2; j++) {
                ball.bearbeiteHindernis(hindernis[j]);
                gravball.bearbeiteHindernis(hindernis[j]);
                farbball.bearbeiteHindernis(hindernis[j]);
             speedball.bearbeiteHindernis(hindernis[j]);

                Sys.warte();
            }

        }
        Sys.beenden();

    }
}
