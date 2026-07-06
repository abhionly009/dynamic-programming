package main.java.dutchNationalFlag;

public class SegregateNegativePositiveAndZero {

    public int [] segregate(int [] input ){

        int low =0;
        int mid = 0;
        int high = input.length-1;

        while (mid<=high){

            if (input[mid] <0){

                int temp = input[low];
                input[low++] = input[mid];
                input[mid++] = temp;

            }else if (input[mid]==0){
                mid++;
            }else {
                int temp = input[mid];
                input[mid] = input[high];
                input[high--] = temp;
            }
        }

        return input;
    }


    public static void main(String[] args) {

        SegregateNegativePositiveAndZero sgr = new SegregateNegativePositiveAndZero();
        int [] input = {3,-2,0,5,-1,0,-7,4};

        int [] result = sgr.segregate(input);

        for (int num:result){
            System.out.print( num +" ");
        }

    }

}
