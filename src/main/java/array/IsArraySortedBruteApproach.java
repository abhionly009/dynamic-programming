package main.java.array;

public class IsArraySortedBruteApproach {

    public boolean isSorted(int [] input){

        if (input == null){
            throw new NullPointerException("Input can not be null");
        }

        if (input.length ==0 || input.length ==1){
            return true;
        }

        for (int i=0;i<input.length;i++){

            for (int j =i;j<input.length;j++){
                if (input[i]>input[j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        IsArraySortedBruteApproach sortedBruteApproach = new IsArraySortedBruteApproach();
        int [] input = {2};
        boolean result = sortedBruteApproach.isSorted(input);

        System.out.println(result);

    }
}
