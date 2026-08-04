package main.java.bitManipulation;

public class RemoveLastSetBit {

    public int remove(int input){
        return (input & input-1);
    }

    public static void main(String[] args) {

        RemoveLastSetBit removeLastSetBit = new RemoveLastSetBit();

       int result =  removeLastSetBit.remove(18);
        System.out.println(result);

    }
}
