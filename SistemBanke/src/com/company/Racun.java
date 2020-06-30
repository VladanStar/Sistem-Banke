package com.company;

public abstract class Racun {
    protected double stanje;

    public Racun() {
    }

    public Racun(double stanje) {
        this.stanje = stanje;
    }

    public double getStanje() {
        return stanje;
    }

    public void setStanje(double stanje) {
        this.stanje = stanje;
    }
    public void uplatiNaRacun(double novac){
        stanje +=novac;
    }
    public void skiniSaRacuna(double novac){
        if(stanje >=(novac +(novac * 0.02))){
            stanje -= (novac + (novac*0.02));
        }
        else{
            System.out.println("Nemate dovoljno novca");
        }
    }

}
