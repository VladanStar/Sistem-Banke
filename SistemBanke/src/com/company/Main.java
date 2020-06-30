package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       DevizniRacun dev = new DevizniRacun(345);
       DinarskiRacun din = new DinarskiRacun(12000);
        System.out.println(dev.getStanje());
        System.out.println(din.getStanje());
    }
}
