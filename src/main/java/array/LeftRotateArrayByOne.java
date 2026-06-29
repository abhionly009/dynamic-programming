package main.java.array;

public class LeftRotateArrayByOne {

    public int [] rotate(int [] input){

        if (input == null){
            throw new NullPointerException("Array is Null");
        }
        if (input.length ==0){
            throw new IllegalArgumentException("There is no item to rotate");
        }
        if ( input.length == 1){
            return input;
        }

        int firstElement = input[0];
        for (int i =1;i<input.length;i++){
            input[i-1] = input[i];
            if (i == input.length-1){
                input[i] = firstElement;
            }
        }

        return input;
    }


    public static void main(String[] args) {

        int [] input = {3,5,6,9,10};

        for (Integer num : input){
            System.out.print(num +" ");
        }
        LeftRotateArrayByOne leftRotateArrayByOne = new LeftRotateArrayByOne();

        System.out.println();
       int[] result = leftRotateArrayByOne.rotate(input);
        for (Integer num : result){
            System.out.print(num +" ");
        }
    }
}
