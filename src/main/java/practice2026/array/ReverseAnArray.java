package main.java.practice2026.array;

public class ReverseAnArray {

    public static void reverse(int [] arr){

        int left =0;
        int right = arr.length-1;

      while (left<right){

          int temp = arr[right];
          arr[right] = arr[left];
          arr[left] = temp;

          left++;
          right--;
      }

        System.out.println(" After reverse ");
      for (Integer num :arr){
          System.out.print(  " "+num);
      }
    }

    public static void main(String[] args) {

        int [] arr = {1,5,8};
        for (Integer num :arr){
            System.out.print(  " "+num);
        }
        System.out.println();

        reverse(arr);

    }
}
