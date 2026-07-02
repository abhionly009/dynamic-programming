package test.java.array;

import main.java.array.SortColors;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortColorsTest {

    SortColors sortColors;

    @BeforeEach
    void setup(){
        sortColors = new SortColors();
    }

    @Test
    void givenInputIsValidThenReturnSortedArray(){
        int [] input = {2,0,1,1,0,2,1};
        int [] result = sortColors.sort(input);
        assertEquals(7,result.length );

        assertEquals(0,result[0]);
        assertEquals(0,result[1]);
        assertEquals(1,result[2]);
        assertEquals(1,result[3]);
        assertEquals(1,result[4]);
        assertEquals(2,result[5]);
        assertEquals(2,result[6]);
    }



}
