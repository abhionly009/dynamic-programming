package main.java.dutchNationalFlag;

public class SortColors {

    public int [] sort(int [] input){

        int low =0;
        int mid =0;
        int high = input.length-1;

        while (mid<=high){

            if (input[mid]==0){
                int temp = input[low];
                input[low++] = input[mid];
                input[mid++] = temp;
            }else if (input[mid]==1){
                mid++;
            }else{

                int temp = input[mid];
                input[mid] = input[high];
                input[high--] = temp;
            }


        }

        return input;

    }

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
            int [] input = { 0, 1, 2, 0, 1, 2 };

            int [] result = sortColors.sort(input);

            for(int in :result){
                System.out.print(in +" ");
            }
    }
}
