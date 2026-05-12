package main.java.twoPointer;

public class SortedArray {

    public int [] mergeTwoSortedArray(int [] first, int [] second)
    {

        if (first.length<1 && second.length<1){
            throw new IllegalArgumentException("Both array can not be empty");
        }

        int [] result = new int[first.length+ second.length];

        int left = 0;
        int right = 0;
        int index = 0;

        while (left<first.length && right<second.length){

            if (first[left]<=second[right]){
                result[index++] = first[left++];
            }else {
                result[index++] = second[right++];
            }
        }

        while (left<first.length){
            result[index++] = first[left++];
        }

        while(right<second.length){
            result[index++] = second[right++];
        }

        return result;

    }
    public static void main(String[] args) {

        int [] first = {1,3,6,7,9};
        int [] second = {2,3,5,7,8,9,10};

        SortedArray array = new SortedArray();
       int [] result  = array.mergeTwoSortedArray(first,second);

       for (int data:result){
           System.out.print(data + " ");
       }

    }
}
