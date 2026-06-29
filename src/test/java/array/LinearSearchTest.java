package test.java.array;

import main.java.array.LinearSearch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinearSearchTest {

    LinearSearch linearSearch;

    @BeforeEach
    void setup(){
        linearSearch = new LinearSearch();
    }

    @Test
    void givenInputIsValidAndTargetMatchedThenReturnIndex(){
        int [] input = {1,3,5,3,6,8};
        assertEquals(4,linearSearch.findElement(input,6));
    }

    @Test
    void givenInputIsValidAndTargetNotFoundThenReturnIndexAsNegativeOne(){
        int [] input = {1,3,5,3,6,8};
        assertEquals(-1,linearSearch.findElement(input,7));
    }

    @Test
    void givenInputIsNullThenReturnNullPointer(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                ()->linearSearch.findElement(null,9));
        assertEquals("Array is null",exception.getMessage());
    }


    @Test
    void givenInputIsEmptyThenReturnIndexAsNegativeOne(){
        int [] input = {};
        assertEquals(-1, linearSearch.findElement(input,5));
    }

}
