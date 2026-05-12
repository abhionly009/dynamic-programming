package test.java.twoPointer;

import main.java.twoPointer.SortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortedArrayTest {

    private SortedArray sortedArray;
    private int [] first ;
    private int [] second;
    @BeforeEach
    void setUp(){
        sortedArray = new SortedArray();
       first = new int[]{1, 3, 6, 7, 9};
    second = new int[]{2, 3, 5, 7, 8, 9, 10};
    }


    @Test
    void givenInputArray1AndArray2Valid_thenReturnNewMergedArray(){
        assertArrayEquals(new int[] {1 ,2 ,3 ,3 ,5 ,6 ,7, 7, 8, 9, 9, 10},sortedArray.mergeTwoSortedArray(first,second));
    }

    @Test
    void givenFirstInputArrayAsValidSecondAsEmpty_thenReturnFirstArray(){
        assertArrayEquals(first, sortedArray.mergeTwoSortedArray(first,new int[]{}));
    }

    @Test
    void givenSecondInputArrayAsValidFirstAsEmpty_thenReturnSecondArray(){
        assertArrayEquals(second, sortedArray.mergeTwoSortedArray(new int[]{},second));
    }

    @Test
    void givenBothArrayAsEmpty_thenThrowIllegalArgumentException(){
    IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
            ()->sortedArray.mergeTwoSortedArray(new int[]{},new int[]{}));

    assertEquals("Both array can not be empty", exception.getMessage());

    }
}
