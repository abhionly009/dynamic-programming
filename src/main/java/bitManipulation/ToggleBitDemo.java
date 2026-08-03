package main.java.bitManipulation;

public class ToggleBitDemo {

    public int toggle(int input, int position){

        return input ^ (1<<position);

    }

    public static void main(String[] args) {

        int input = 13;
        int position = 1;

        ToggleBitDemo toggleBitDemo = new ToggleBitDemo();

        int result =  toggleBitDemo.toggle(input,1);

        System.out.println(result);

        int result2 =  toggleBitDemo.toggle(input,2);

        System.out.println(result2);

    }
}
