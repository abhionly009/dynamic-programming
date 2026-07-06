package main.java.twoDimension.basic;

public class SpiralTraversal {

    public void traverse(int [][]matrix){

    int left =0;
    int right = matrix[0].length-1;
    int bottom = matrix.length-1;
    int top =0;

        System.out.println(left);
        System.out.println(right);
        System.out.println(bottom);
        System.out.println(top);



    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3,4},
                {4, 5, 6,5},
                {7, 8, 9,3}
        };

        SpiralTraversal spiralTraversal = new SpiralTraversal();
        spiralTraversal.traverse(matrix);

    }
}
