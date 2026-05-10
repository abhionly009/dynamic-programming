package test.java.twoPointer;

import main.java.twoPointer.FindNumberIndexInSortedArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindNumberIndexInSortedArrayTest {

    private FindNumberIndexInSortedArray findNumberIndexInSortedArray;
    @BeforeEach
     void setUp(){
        System.out.println("findNumberIndexInSortedArray has been initialized" );
        findNumberIndexInSortedArray = new FindNumberIndexInSortedArray();
    }

    @Test
    void givenValidInputArrayAndTarget_thenReturnCorrectIndex(){
        int [] input = {10,20,35,37,40,90,100};
        assertEquals(2,findNumberIndexInSortedArray.findIndex(input,35));
    }

    @Test
    void givenValidInputArrayAndTargetDoesNotFound_thenReturnNegativeIndex(){
        int [] input = {10,20,35,37,40,90,100};
        assertEquals(-1,findNumberIndexInSortedArray.findIndex(input,95));
    }

    @Test
    void givenNullInputArrayAndTargetAsValid_thenReturnIllegalInputException(){

       NullPointerException nullPointerException = assertThrows(NullPointerException.class,()->findNumberIndexInSortedArray.findIndex(null,35));
        assertEquals("Cannot read the array length because \"input\" is null",nullPointerException.getMessage());
    }

    @Test
    void givenEmptyInputArrayAndTargetAsValid_thenReturnIllegalInputException(){
        int [] input = {};

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,()->findNumberIndexInSortedArray.findIndex(input,35));
        assertEquals("Array must have at least one element",illegalArgumentException.getMessage());
    }




}
