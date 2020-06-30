package com.company;

public class OmladinskiRacun extends Racun{
    public OmladinskiRacun() {
    }

    public OmladinskiRacun(double stanje) {
        super(stanje);
    }

    @Override
    public void uplatiNaRacun(double novac) {
        stanje += novac - (novac*0.02);
    }
}
