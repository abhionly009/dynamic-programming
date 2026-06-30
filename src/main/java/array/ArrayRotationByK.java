package main.java.array;

public class ArrayRotationByK {

    public int [] rotate(int [] input, int k){

        for (int j = 0;j<k;j++){
            int firstElement = input[0];
            for (int i = 1;i<input.length;i++){
                input[i-1] = input[i];
                if (i == input.length-1){
                    input[i] = firstElement;
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {

        int [] input = {1,2,3,5,6};
        ArrayRotationByK arrayRotationByK = new ArrayRotationByK();
        int [] result = arrayRotationByK.rotate(input,2);

        for (Integer num : result){
            System.out.print( num +" ");
        }
    }
}
