package com.Jahedul.lc.api;

public class RandomNumberDTO {
    private int randomInteger;


    public RandomNumberDTO(){
        this.randomInteger = (int)(100.0 * Math.random());
    }
    public int getRandomInteger(){
        return randomInteger;
    }
}
