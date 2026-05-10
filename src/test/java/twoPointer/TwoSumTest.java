package test.java.twoPointer;

import main.java.twoPointer.TwoSumProblem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    private TwoSumProblem twoSumProblem;
    @BeforeEach
    void setUp(){
        twoSumProblem = new TwoSumProblem();
    }

    @Test
    void givenValidInputAndTargetIsFound_thenReturnCorrectIndexes(){
        int [] input = {1,2,4,5,6,8,10};
        assertArrayEquals(new int[]{1,6},twoSumProblem.findIndexes(input,12));
        System.out.println("givenValidInputAndTargetIsFound_thenReturnCorrectIndexes" + " passed successfully");
    }

    @Test
    void givenValidInputAndTargetNotFound_thenReturnCorrectIndexes(){
        int [] input = {1,2,4,5,6,8,10};
        assertArrayEquals(new int[]{-1,-1},twoSumProblem.findIndexes(input,90));
        System.out.println("givenValidInputAndTargetNotFound_thenReturnCorrectIndexes" + " passed successfully");
    }

    @Test
    void givenEmptyArrayInputAndCorrect_thenReturnCorrectIndexes(){
        int []input = {};
        assertArrayEquals(new int[] {-1,-1},twoSumProblem.findIndexes(input,15));

    }

    @Test
    void givenNullArrayInputAndValidTarget_thenReturnIllegalException(){

        NullPointerException nullPointerException = assertThrows(NullPointerException.class,()->twoSumProblem.findIndexes(null,35));
        assertEquals("Array should not be null", nullPointerException.getMessage());

    }
}
