package main.java.array;

public class OptimalApproachForSortedArrayCheck {

    public boolean isSorted(int [] input){

        if (input == null){
            throw new NullPointerException("Input can not be null");
        }

        if (input.length == 0 || input.length == 1){
            return true;
        }

        for (int i =1;i<input.length;i++){

            if (input[i]<input[i-1]){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int [] input = {1,2,4,5,6};

        OptimalApproachForSortedArrayCheck sortedArrayCheck = new OptimalApproachForSortedArrayCheck();
        boolean result =  sortedArrayCheck.isSorted(input);
        System.out.println(result);
    }
}
