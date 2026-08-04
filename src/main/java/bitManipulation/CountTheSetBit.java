package main.java.bitManipulation;

public class CountTheSetBit {

    public int countSetBit(int input){

        int count =0;

        while (input!=0){

            input = input  & input-1;

            count++;

        }
        return count;
    }

    public static void main(String[] args) {

        CountTheSetBit setBit = new CountTheSetBit();

        int result = setBit.countSetBit(6);

        System.out.println(result);

    }
}
