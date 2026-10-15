package main.java.practice2026.array;

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int [] arr1 = {2,3,5,7};
        int [] arr2 = {1,4,6,8};

        // {1,2,3,4,5,6,7,8}

        int [] result = new int[arr1.length+ arr2.length];

        int i =0; int j =0; int k =0;

        while (i<arr1.length && j <arr2.length){

            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }

        }


        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }


        for (Integer num :result){
            System.out.print( " " + num);
        }

    }

}
