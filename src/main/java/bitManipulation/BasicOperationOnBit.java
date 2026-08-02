package main.java.bitManipulation;

public class BasicOperationOnBit {

    public static void main(String[] args) {

        int a = 13;
        int b = 7;


        System.out.println(a & b);

        System.out.println(a | b );

        System.out.println(~a);

        System.out.println(a<<1);
        System.out.println(a>>1);

        System.out.println(a<<4);
        System.out.println(a>>4);
    }
}
