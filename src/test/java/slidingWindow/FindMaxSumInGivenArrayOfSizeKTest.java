package test.java.slidingWindow;

import main.java.slidingWindow.FindMaxSumInGivenArrayOfSizeK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxSumInGivenArrayOfSizeKTest {

    private FindMaxSumInGivenArrayOfSizeK maxSumInGivenArrayOfSizeK;
    private int [] input;
    @BeforeEach
    void setUp(){
        maxSumInGivenArrayOfSizeK = new FindMaxSumInGivenArrayOfSizeK();
      input = new int[]{4, 3, 5, 6, 5, 9, 2};

    }

    @Test
    void givenArrayInputAndWindowSize_thenReturnCorrectOutput(){
        assertEquals(20,maxSumInGivenArrayOfSizeK.calculateMaxSum(input,3));
    }

    @Test
    void givenArrayInputAndWindowSize_thenReturnCorrectOutputAndValidateNegative(){
        assertNotEquals(21,maxSumInGivenArrayOfSizeK.calculateMaxSum(input,3));
    }

    @Test
    void givenArrayInputAndWindowSizeGreaterThanArrayLength_thenReturnIllegalException(){
       IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->maxSumInGivenArrayOfSizeK.calculateMaxSum(input,15));
        assertEquals("Window size is greater than array size",exception.getMessage());
    }

    @Test
    void givenArrayInputAndWindowSizeLessThan2_thenReturnIllegalException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->maxSumInGivenArrayOfSizeK.calculateMaxSum(input,1));
        assertEquals("Window size must be greater than one",exception.getMessage());
    }

    @Test
    void givenArrayInputAsEmptyAnd_thenReturnIllegalException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->maxSumInGivenArrayOfSizeK.calculateMaxSum(new int[]{},1));
        assertEquals("Array should have at least one element",exception.getMessage());
    }

    @Test
    void givenArrayInputAsNullAnd_thenReturnNullPointerException(){
        NullPointerException exception = assertThrows(NullPointerException.class,()->maxSumInGivenArrayOfSizeK.calculateMaxSum(null,1));
        assertEquals("Array can not be null",exception.getMessage());
    }
}
