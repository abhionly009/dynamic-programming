package main.java.array;

public class PrintDiagonalOfArray {


    public static void main(String[] args) {

        int [][] arr = {
                {2,4,6},
                {3,6,9},
                {4,8,12}

        };

        for (int i =0;i<arr.length;i++){
            for (int j =0;j<arr[i].length;j++){
              if (i==j){
                  System.out.print( arr[i][j]);
              }
              else {
                  System.out.print(" ");
              }
            }
            System.out.println();
        }

    }
}
