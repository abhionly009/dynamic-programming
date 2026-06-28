package test.java.array;

import main.java.array.IsArraySortedBruteApproach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IsArraySortedBruteApproachTest {

    IsArraySortedBruteApproach sortedBruteApproach;

    @BeforeEach
    void setup(){
        sortedBruteApproach = new IsArraySortedBruteApproach();
    }

    @Test
    void givenInputIsNullThenReturnNullPointerException(){
        NullPointerException exception = assertThrows(NullPointerException.class, ()->{sortedBruteApproach.isSorted(null);});
    assertEquals("Input can not be null", exception.getMessage());
    }

    @Test
    void givenInputIsSortedThenReturnTrue(){
        int [] input = {1,2,3,4,5,6};
        assertEquals(true,sortedBruteApproach.isSorted(input));
    }

    @Test
    void givenInputIsNotSortedThenReturnFalse(){
        int [] input = {1,2,4,5,3};
        assertEquals(false,sortedBruteApproach.isSorted(input));
    }

    @Test
    void givenInputIsWithZeroElementThenReturnTrue(){
        int [] input = {};
        assertEquals(true,sortedBruteApproach.isSorted(input));
    }

    @Test
    void givenInputIsWithOneElementThenReturnTrue(){
        int [] input = {102};
        assertEquals(true,sortedBruteApproach.isSorted(input));
    }

}
