package com.company;

import java.util.Random;

public class DevizniRacun extends Racun {
    public DevizniRacun() {
    }

    public DevizniRacun(double stanje) {
        super(stanje);
    }

    @Override
    public void uplatiNaRacun(double novac) {
        stanje += novac - (novac * 0.05);
    }

    @Override
    public void skiniSaRacuna(double novac) {
        if(stanje >=(novac +(novac * 0.05))){
            stanje -= (novac + (novac*0.05));
        }
        else{
            System.out.println("Nemate dovoljno novca");
        }
    }
}
