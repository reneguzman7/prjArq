package BL.Entities;

import BL.Fachade.IMarina;

public class Pez extends Pet implements IMarina{
    
    private int aleta;

    public int getAleta() {
        return aleta;
    }

    public void setAleta(int aleta) {
        this.aleta = aleta;
    }

    @Override
    public void nadar() {
        System.out.println("Pez nadando...!");
    }

    @Override
    public void flotar() {
        System.out.println("Pez flotando...!");
    }




}
