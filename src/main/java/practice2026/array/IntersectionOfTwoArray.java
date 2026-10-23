package main.java.practice2026.array;

public class IntersectionOfTwoArray {

    public static void interSection(int [] arr,int [] input){

        int i =0;
        int j =0;

        while(i<arr.length && j<input.length){
            if (arr[i] == input[j]){
                System.out.print(" " + arr[i]);
                i++;
                j++;
            }else if (arr[i]<input[j]){
                i++;
            }else {
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int [] arr = {1,3,4,6,7};
        int [] input = {1,2,4,5,8,9};

        interSection(arr,input);
    }
}
