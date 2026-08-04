package main.java.bitManipulation;

public class PowerOf2 {

    public boolean isNumberPowerOf2(int input){

        return (input & input-1) == 0;

    }

    public static void main(String[] args) {


        PowerOf2 powerOf2 = new PowerOf2();

        System.out.println(powerOf2.isNumberPowerOf2(16));
        System.out.println(powerOf2.isNumberPowerOf2(13));

    }
}
