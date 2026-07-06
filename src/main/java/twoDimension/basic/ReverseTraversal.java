package main.java.twoDimension.basic;

public class ReverseTraversal {

    public void traverse(int [][]matrix){

        for (int i = matrix.length-1;i>=0;i--){

            for (int j = matrix[i].length-1;j>=0;j--){
                System.out.print( matrix[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ReverseTraversal traversal = new ReverseTraversal();
        traversal.traverse(matrix);

    }
}
