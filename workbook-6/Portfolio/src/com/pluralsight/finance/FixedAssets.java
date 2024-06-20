package com.pluralsight.finance;

public class FixedAssets {

    public static void main(String[] args) {

    }
}
public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public FixedAsset(String name, double value){
        this.name=name;
        this.marketValue=value;
    }
    @Override
    public double getValue(){
        return marketValue;
    }
}