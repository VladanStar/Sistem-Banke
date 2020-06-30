package com.company;

public class DinarskiRacun extends Racun{
    public DinarskiRacun() {
    }

    public DinarskiRacun(double stanje) {
        super(stanje);
    }

    @Override
    public void uplatiNaRacun(double novac) {
        stanje += novac - (novac*0.05);
    }
}
