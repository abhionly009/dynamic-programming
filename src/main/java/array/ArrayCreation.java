package main.java.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayCreation {

    public static void main(String[] args) {

        int [] arr = new int[12];
        int a = 10;
        for(int i =0;i<arr.length;i++){

            arr[i] = ++a;
        }

        for (int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        System.out.println();
        int [] input = {3,4,5,6,1,3,5};

        for (int i =0;i<input.length;i++){
            System.out.print(input[i] +" ");
        }

        System.out.println();
        int [] eArr = new int []{3,5,7,9,10};

        for (int i =0;i<eArr.length;i++){
            System.out.print( eArr[i] +" ");
        }

        System.out.println();
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);

        for (Integer num:list){
            System.out.println(num);
        }


    }
}
