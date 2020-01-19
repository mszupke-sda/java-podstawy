package com.company;

public class Switch {

    public static void main(String[] args) {

        int testVal = 10;
        switch (testVal) {
            case 0:
                System.out.println("Testowana wartość to 0");
            case 1:
                System.out.println("Testowana wartość to 1");
            case 2:
                System.out.println("Testowana wartość to 2");
            case 10:
                System.out.println("Testowana wartość to 10");
            case 11:
                System.out.println("Testowana wartość to 11");
            default:
                System.out.println("Testowana wartość to 0");
        }

    }
}
