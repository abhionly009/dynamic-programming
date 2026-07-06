package main.java.twoDimension.basic;

public class ColumnWiseTraversal {

    public void traversMatrix(int [][]matrix){

        for (int i=0;i<matrix[0].length;i++){

            for (int j = 0 ;j<matrix.length;j++){
                System.out.print( matrix[j][i]+" ");
            }

        }

    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ColumnWiseTraversal columnWiseTraversal = new ColumnWiseTraversal();
        columnWiseTraversal.traversMatrix(matrix);
    }
}
