package main.java.array;

public class ColumnSum {

    public static void main(String[] args) {


        int [][] arr = {

                {2,3,4},
                {5,4,8},
                {7,9,3}
        };

        int[] columnSums = new int[arr[0].length];


        for (int i =0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
              columnSums[j] += arr[i][j];
            }
        }

        for (int num:columnSums){
            System.out.println(num);
        }


    }
}
