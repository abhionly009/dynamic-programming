package main.java.dutchNationalFlag;

public class ThreeWayPartition {

    public int [] segregateInThreeWay(int [] input, int pivot) {

        int low = 0;
        int mid = 0;
        int high = input.length - 1;

        while (mid <= high) {
            if (input[mid] < pivot) {
                int temp = input[low];
                input[low++] = input[mid];
                input[mid++] = temp;
            } else if (input[mid] == pivot) {
                mid++;
            } else {
                int temp = input[mid];
                input[mid] = input[high];
                input[high--] = temp;
            }

        }
        return input;
    }
    public static void main(String[] args) {

        ThreeWayPartition threeWayPartition = new ThreeWayPartition();
        int [] input = {7, 9, 4, 8,5, 3, 6, 2, 1, 5};
        int [] result = threeWayPartition.segregateInThreeWay(input,5);

        for (int num :result){
            System.out.print( num +" ");
        }

    }
}
