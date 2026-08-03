package main.java.bitManipulation;

public class BitOperations {

    public boolean isBitSet(int input, int position){

        return ((1<<position) & input) != 0;
    }

    public int setBit(int input, int position){

        return (1<<position)| input;

    }

    public static void main(String[] args) {

        int input = 13;
        int position = 1;
        BitOperations bitOperations = new BitOperations();

        System.out.println("Bit at position has been set " + position + " ---> " + bitOperations.isBitSet(input,position) );

        System.out.println(bitOperations.setBit(9,2));

    }
}
