package main.java.array;

public class SumOfTwoDArrayElement {

    public static void main(String[] args) {

        int [][] arr = {{4,3,2},{6,5,7}};
        int sum = 0;
        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){

                System.out.println("" + arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.println(sum);
    }
}
