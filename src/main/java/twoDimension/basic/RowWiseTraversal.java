package main.java.twoDimension.basic;

public class RowWiseTraversal {

    public void traverse(int [][] input){

        for (int i =0;i<input.length;i++){
            for (int j=0;j<input[i].length;j++){
                System.out.print( input[i][j]+" ");
            }
        }

    }

    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        RowWiseTraversal rowWiseTraversal = new RowWiseTraversal();
        rowWiseTraversal.traverse(matrix);
    }
}
