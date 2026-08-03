package main.java.bitManipulation;

public class BitClearDemo {

    public int clearBit(int input, int position){

      return ~(1<<position) & input;

    }

    public static void main(String[] args) {

        int input = 13;

        int position =2;

        BitClearDemo bitClearDemo = new BitClearDemo();

        int result = bitClearDemo.clearBit(input,position);

        System.out.println(result);

    }
}
