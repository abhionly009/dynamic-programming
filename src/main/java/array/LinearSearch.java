package main.java.array;

public class LinearSearch {

    public int findElement(int [] input, int target){

        if (input == null){
            throw new NullPointerException("Array is null");
        }

        if (input.length ==0){
            return -1;
        }

        for (int i =0;i<input.length;i++){
            if (input[i]== target){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int [] input = {1,3,5,3,6,8};
        LinearSearch linearSearch = new LinearSearch();

        int result = linearSearch.findElement(input, 10);

        System.out.println(result);

    }
}
