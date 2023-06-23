package BL.Entities;

import BL.Fachade.ITerrestre;

public class Perro extends Mascota implements ITerrestre {

    @Override
    public void correr() {
        System.out.println("Perro corriendo...!");
    }
    
}
