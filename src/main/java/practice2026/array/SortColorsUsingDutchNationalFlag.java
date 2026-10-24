package main.java.practice2026.array;

import java.util.Arrays;

public class SortColorsUsingDutchNationalFlag {

    public static char [] segregate(char [] arr){

        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while (mid<=high){
            if (arr[mid]=='B'){
                char temp = arr[mid];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            }else if (arr[mid]=='G'){
                mid++;
            }else {
                char temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }

        }
        return arr;

    }

    public static void main(String[] args) {

        char [] colors = new char[] {'R','G','B','G','G','R','R','B'};

        System.out.println(Arrays.toString(segregate(colors)));


    }
}
