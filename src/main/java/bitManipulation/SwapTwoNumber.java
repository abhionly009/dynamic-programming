package main.java.bitManipulation;

public class SwapTwoNumber {

    public static void main(String[] args) {

        int a = 9;

        int b = 5;

        System.out.println("Initial value of a " + a);
        System.out.println("Initial value of b " + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swap value of a " + a);
        System.out.println("After swap value of b " + b);

    }

}
