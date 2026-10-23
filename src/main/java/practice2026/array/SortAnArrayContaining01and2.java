package main.java.practice2026.array;

public class SortAnArrayContaining01and2 {

    public static int [] segregate(int [] arr){

        int low = 0;
        int high = arr.length-1;
        int mid =0;

        while (mid<=high) {
            if (arr[mid] ==0) {
                int temp = arr[mid];
                arr[low++] = arr[mid];
                arr[mid++] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high--] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,1,0,0,1,2,2,1,0};
       int [] result =  segregate(arr);

       for(Integer num : result){
           System.out.print( num +" ");
       }

    }
}
