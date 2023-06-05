import GLOOP.*;
public class Blood extends Schneemann{
    private GLObjekt[] kopfbedeckung;

    public Blood(double pX, double pZ){
        super(pX,pZ);
        kopfbedeckung = new GLObjekt[2];
        
        //Stirnband
        kopfbedeckung[0] = new GLTorus(0,220,0, 30,5);
        kopfbedeckung[0].drehe(90,0,0);
        kopfbedeckung[0].verschiebe(pX,0,pZ);
        kopfbedeckung[0].setzeFarbe(1,0,0);
        

    }
    
}
