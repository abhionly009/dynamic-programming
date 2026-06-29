package test.java.array;

import main.java.array.LeftRotateArrayByOne;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeftRotateArrayByOneTest {

    LeftRotateArrayByOne leftRotateArrayByOne;

    @BeforeEach
    void setup(){
        leftRotateArrayByOne = new LeftRotateArrayByOne();
    }

    @Test
    void givenInputIsValidThenRotateArrayByOne(){
        int [] input = {3,5,6,9,10};
       int [] actual = leftRotateArrayByOne.rotate(input);
        assertEquals(5,actual.length);
        assertEquals(5,actual[0]);
        assertEquals(6,actual[1]);
        assertEquals(9,actual[2]);
        assertEquals(10,actual[3]);
        assertEquals(3,actual[4]);
    }

    @Test
    void givenInputIsEmptyArrayThenReturnIllegalArgument(){
        int [] input = {};

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()->leftRotateArrayByOne.rotate(input));

        assertEquals("There is no item to rotate",exception.getMessage());

    }

    @Test
    void givenInputIsEmptyArrayThenReturnNullPointer(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                ()->leftRotateArrayByOne.rotate(null)
                );

        assertEquals("Array is Null",exception.getMessage());
    }

    @Test
    void givenInputIsEmptyArrayWithSize1ThenReturnSameInput(){
        int [] input = {8};
        int [] actual = leftRotateArrayByOne.rotate(input);
        assertEquals(8,actual[0]);
    }

}
