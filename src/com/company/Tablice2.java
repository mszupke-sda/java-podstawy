package com.company;

public class Tablice2 {

    public static void main(String[] args) {

        float[] theVals = new float[3];
        theVals[0] = 10.0f;
        theVals[1] = 20.0f;
        theVals[2] = 30.0f;

        float sum = 0.0f;
        for (float currentVal : theVals) {
            sum += currentVal;
        }

        System.out.println(sum);

    }
}
