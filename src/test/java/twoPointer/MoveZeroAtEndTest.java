package test.java.twoPointer;

import main.java.twoPointer.MoveZeroAtEnd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZeroAtEndTest {

    private MoveZeroAtEnd moveZeroAtEnd;

    @BeforeEach
    void setUp(){
        moveZeroAtEnd = new MoveZeroAtEnd();
    }

    @Test
    void givenValidInput_thenReturnArrayWhichHasAllTheZeroAtTheEnd(){
        int [] input = {1,4,0,6,0,9};
        assertArrayEquals(new int[] {1,4,6,9,0,0},moveZeroAtEnd.moveToEnd(input));
    }

    @Test
    void givenInputArrayContainsAllZero_thenReturnSame(){
        int [] input = {0,0,0};
        assertArrayEquals(new int[]{0,0,0},moveZeroAtEnd.moveToEnd(input));
    }

    @Test
    void givenNullArray_returnNullPointerException(){
        NullPointerException nullPointerException = assertThrows(NullPointerException.class, () -> moveZeroAtEnd.moveToEnd(null));
        assertEquals("Cannot read the array length because \"input\" is null", nullPointerException.getMessage());
    }

    @Test
    void givenEmptyArray_returnIllegalArgumentException(){
        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,
                ()->moveZeroAtEnd.moveToEnd(new int[]{}));

        assertEquals("Array must contain at least one element",illegalArgumentException.getMessage());
    }

}
