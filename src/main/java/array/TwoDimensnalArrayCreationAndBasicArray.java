package main.java.array;

public class TwoDimensnalArrayCreationAndBasicArray {



    public static void main(String[] args) {

        int [] [] arr = new int[2][2];

        arr[0][0] = 12;
        arr[0][1] = 13;
        arr[1][0] = 20;
        arr[1][1] = 9;

        for (int i = 0;i<arr.length;i++){
            System.out.print("|");
            for (int j =0;j<arr.length;j++){
                System.out.print(  " "+arr[i][j] +" ");
            }

            System.out.println("|");
        }

    }
}
