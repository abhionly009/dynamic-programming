package test.java.array;

import main.java.array.SingleNumberBruteForce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberBruteForceTest {

    SingleNumberBruteForce singleNumberBruteForce;

    @BeforeEach
    void setup(){
        singleNumberBruteForce = new SingleNumberBruteForce();
    }

    @Test
    void givenInputIsValidThenReturnMissingNumber(){
        int [] input = {4,1,2,1,1,2};
        assertEquals(4, singleNumberBruteForce.findSingleNumber(input));
    }

}
