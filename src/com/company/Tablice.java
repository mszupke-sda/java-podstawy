package com.company;

public class Tablice {

    public static void main(String[] args) {

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        float sum = 0.0f;
        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
        }

        System.out.println(sum);

    }
}
