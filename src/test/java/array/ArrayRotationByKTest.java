package test.java.array;

import main.java.array.ArrayRotationByK;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayRotationByKTest {

    ArrayRotationByK arrayRotationByK;

    @BeforeEach
    void setup(){
        arrayRotationByK = new ArrayRotationByK();
    }

    @Test
    void givenArrayIsValidThenReturnRotatedArray(){
        int [] input = {1,3,5,6,7};
        int [] result = arrayRotationByK.rotate(input,2);
        assertEquals(5,result.length);

        assertEquals(5,result[0]);
        assertEquals(6,result[1]);
        assertEquals(7,result[2]);
        assertEquals(1,result[3]);
        assertEquals(3,result[4]);
    }
}
