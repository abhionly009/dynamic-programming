package main.java.array;

public class CheckIfArrayIsSortedAndRotated {

    public boolean isRotatedAndSorted(int [] input){
        int dropCount = 0;
        int n = input.length;
        for (int i = 0;i<input.length;i++){
            if (input[i]> input[(i+1)%n]){
                dropCount++;
            }
            if (dropCount>1){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        CheckIfArrayIsSortedAndRotated checkIfArrayIsSortedAndRotated = new CheckIfArrayIsSortedAndRotated();

        int [] arr = {3,4,5,1,2};
        int [] input = {2,1,3,4};
        int [] as = {6,10,6};

        System.out.println(checkIfArrayIsSortedAndRotated.isRotatedAndSorted(arr));
        System.out.println(checkIfArrayIsSortedAndRotated.isRotatedAndSorted(input));
        System.out.println(checkIfArrayIsSortedAndRotated.isRotatedAndSorted(as ));
    }
}
