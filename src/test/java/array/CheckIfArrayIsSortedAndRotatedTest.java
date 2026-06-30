package test.java.array;

import main.java.array.CheckIfArrayIsSortedAndRotated;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfArrayIsSortedAndRotatedTest {

    CheckIfArrayIsSortedAndRotated sortedAndRotated;

    @BeforeEach
    void setup(){
        sortedAndRotated = new CheckIfArrayIsSortedAndRotated();
    }

    @Test
    void givenInputIsValidThenReturnTrue(){
        int [] input = {3,4,5,1,2};
        assertEquals(true,sortedAndRotated.isRotatedAndSorted(input));
    }

    @Test
    void givenInputIsNotValidSortedAndRotatedThenReturnFalse(){
        int [] input = {2,1,3,4};
        assertEquals(false,sortedAndRotated.isRotatedAndSorted(input));
    }

    @Test
    void givenInputContainsNegativeAndValidThenReturnTrue(){
        int [] input = {1,2,-2};
        assertEquals(true,sortedAndRotated.isRotatedAndSorted(input));
    }

    @Test
    void givenInputContainsNegativeAndInvalidThenReturnFalse(){
        int [] input = {1,2,-2,-5};
        assertEquals(false,sortedAndRotated.isRotatedAndSorted(input));
    }
}
