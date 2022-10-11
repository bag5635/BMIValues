package com.example.bmivalues;

public class BMI {

    private double weight;
    private double height;


    public BMI(double newWeight, double newHeight)
    {
        weight = newWeight;
        height = newHeight;
    }
    public double getWeight()
    {
        return weight;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWeight(double newWeight)
    {
        weight = newWeight;
    }
    public void setHeight(double newHeight)
    {
        height = newHeight;
    }

    public double BMITop()
    {
        return (weight / height / height) * 703;
    }
}
