package com.pluralsight.finance;

public class Gold extends FixedAsset{

    public static void main(String[] args) {

    }
    private double weight;

    public Gold(String name, double weight){
        super(name,weight);
        this.weight=weight;
    }

    @Override
    public double getValue(){
        return weight;
    }
}