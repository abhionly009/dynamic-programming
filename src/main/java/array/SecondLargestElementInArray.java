package main.java.array;

public class SecondLargestElementInArray {

    public int findSecondLargeElement(int [] input){

        int firstLarge = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (Integer num :input){
            if (num>firstLarge){
                secondLarge = firstLarge;
                firstLarge = num;

            }else if (num>secondLarge && num != firstLarge){
                secondLarge = num;
            }
        }

        return secondLarge;
    }

    public static void main(String[] args) {
        SecondLargestElementInArray secondLargestElementInArray = new SecondLargestElementInArray();
        int [] input  = {1,4,6,3,5};
        System.out.println(secondLargestElementInArray.findSecondLargeElement(input));

    }
}
