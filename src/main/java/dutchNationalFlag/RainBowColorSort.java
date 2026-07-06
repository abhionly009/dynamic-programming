package main.java.dutchNationalFlag;

public class RainBowColorSort {

    public char [] rainBowSort(char [] input){

        int low =0;
        int mid =0;
        int high = input.length-1;

        while (mid<=high){

            if (input[mid] == 'R'){
                char temp = input[low];
                input[low++] = input[mid];
                input[mid++] = temp;

            }else if (input[mid] == 'G'){
                mid++;
            }else {
                char temp = input[mid];
                input[mid] = input[high];
                input[high--] = temp;
            }


        }
        return input;
    }

    public static void main(String[] args) {

        RainBowColorSort rainBowColorSort = new RainBowColorSort();

        char [] input = {'B', 'R', 'G', 'R', 'B', 'G', 'R'};

        char [] result = rainBowColorSort.rainBowSort(input);

        for (char ch :result){
            System.out.print(ch +" ");
        }

    }
}
