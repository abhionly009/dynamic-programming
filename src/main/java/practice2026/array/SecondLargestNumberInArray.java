package main.java.practice2026.array;

public class SecondLargestNumberInArray {

    public static int findSecondLargestNumber(int [] arr){

        int firstLargest = arr[0];
        int secondLargest =0;



        for (int i=0;i<arr.length;i++){

           if (firstLargest<arr[i]){
               secondLargest = firstLargest;
               firstLargest = arr[i];
           }else if (arr[i]>secondLargest && arr[i]<firstLargest){
               secondLargest = arr[i];
           }
        }

        return secondLargest;

    }

    public static void main(String[] args) {

        int [] arr = {10, 5, 20, 8};

        int second = findSecondLargestNumber(arr);
        System.out.println(second);
    }
}
