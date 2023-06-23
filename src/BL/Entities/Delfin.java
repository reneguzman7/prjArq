package BL.Entities;
import BL.Fachade.IMarina;

public class Delfin extends Mascota implements IMarina {

    @Override
    public void nadar() {
        System.out.println("Delfin nadando...!");
    }

    @Override
    public void flotar() {
        System.out.println("Delfin flotando...!");
    }
    
}
