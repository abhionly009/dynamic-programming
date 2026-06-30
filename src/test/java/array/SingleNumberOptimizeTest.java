package test.java.array;

import main.java.array.SingleNumberOptimize;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberOptimizeTest {
    SingleNumberOptimize singleNumberOptimize;
    @BeforeEach
    void setup(){
        singleNumberOptimize = new SingleNumberOptimize();
    }

    @Test
    void givenValidInputThenReturn(){
        int [] input = {1,4,2,1,2};
        assertEquals(4,singleNumberOptimize.findSingleNumber(input));
    }
}
