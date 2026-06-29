package main.java.array;

public class MoveZeroToEnd {

    public int [] move(int [] input){

        if (input == null){
            throw new NullPointerException("Input is null");
        }
        int left = 0;
        for (int i = 0;i<input.length;i++){
            if (input[i] != 0){
                int temp = input[left];
                input[left] = input[i];
                input[i] = temp;
                left++;
            }
        }
    return input;
    }

    public static void main(String[] args) {

        int [] input = {1,0,3,0,5,9};

        MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();
        int [] result = moveZeroToEnd.move(input);

        for (Integer num :result){
            System.out.print(num + " ");
        }
    }
}
