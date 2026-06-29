package test.java.array;

import main.java.array.MoveZeroToEnd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoveZeroToEndTest {

    MoveZeroToEnd moveZeroToEnd;

    @BeforeEach
    void setup(){
        moveZeroToEnd = new MoveZeroToEnd();
    }

    @Test
    void givenInputIsNullThenReturnNullPointer(){
        NullPointerException exception = assertThrows(NullPointerException.class,()->moveZeroToEnd.move(null));
        assertEquals("Input is null",exception.getMessage());
    }

    @Test
    void givenInputIsValidThenReturnArray(){
        int [] input = {1,0,3,0,5,9};
        //1 3 5 9 0 0
        int [] actual = moveZeroToEnd.move(input);
        assertEquals(6, actual.length);
        assertEquals(1,actual[0]);
        assertEquals(3,actual[1]);
        assertEquals(5,actual[2]);
        assertEquals(9,actual[3]);
        assertEquals(0,actual[4]);
        assertEquals(0,actual[5]);
    }



}
