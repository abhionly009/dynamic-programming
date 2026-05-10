package main.java.twoPointer;

public class MoveZeroAtEnd {

        public int[] moveToEnd(int [] input){

            if (input.length<1){
                throw new IllegalArgumentException("Array must contain at least one element");
            }

            int left = 0;

            for (int right = 0;right<input.length;right++){

                if (input[right]!=0){
                    int temp = input[left];
                    input[left] = input[right];
                    input[right] = temp;
                    left++;
                }
            }

            return input;
        }

        public static void main(String[] args) {

            int [] input = {1,4,0,6,0,9};
            main.java.twoPointer.MoveZeroAtEnd moveZeroAtEnd = new main.java.twoPointer.MoveZeroAtEnd();
            int []result =  moveZeroAtEnd.moveToEnd(input);
            for (int data:result){
                System.out.print(data+ " ");
            }

        }
    }


