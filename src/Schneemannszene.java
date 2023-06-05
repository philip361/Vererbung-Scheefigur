import GLOOP.*;
public class Schneemannszene {
    private GLKamera kamera;
    private GLLicht  licht;  
    private GLHimmel himmel;
    private GLBoden  boden;

    private Schneemann schneemann,schneemann2,schneemann3,schneemann4;;

    public Schneemannszene(){
        kamera = new GLSchwenkkamera(1920,1080);
        kamera.setzePosition(-600,400,800);
        licht  = new GLLicht();  
        boden  = new GLBoden("src/img/Schnee.jpg");
        himmel = new GLHimmel("src/img/Himmel.jpg");

        schneemann = new Schneemann(-100,0);
        schneemann2 = new Crip (0,0);
        schneemann3 = new Vagos (100,0);
        schneemann4 = new Blood (-200,0);
        
    }
}
