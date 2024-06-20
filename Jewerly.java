package com.pluralsight.finance;

public class Jewelry extends FixedAsset {

    public static void main(String[] args) {

    }
    private double karat;

    public  Jewelry(String name, double karat){
        super(name,karat);
        this.karat=karat;
    }

    @Override
    public double getValue(){
        return karat;
    }
}