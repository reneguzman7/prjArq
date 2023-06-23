package BL.Entities;

import BL.Fachade.IMarina;
import BL.Fachade.ITerrestre;

public class Iguana extends Mascota implements ITerrestre, IMarina{

    @Override
    public void nadar() {
        System.out.println("Iguana nadando...!");
    }

    @Override
    public void flotar() {
        System.out.println("Iguana flotando...!");
    }

    @Override
    public void correr() {
        System.out.println("Iguana corriendo...!");
    }

    
}
