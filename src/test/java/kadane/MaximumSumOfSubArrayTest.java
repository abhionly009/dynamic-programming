package test.java.kadane;

import main.java.kadane.MaximumSumOfSubArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSumOfSubArrayTest {

    MaximumSumOfSubArray maximumSumOfSubArray;

    @BeforeEach
    void setup(){

        maximumSumOfSubArray = new MaximumSumOfSubArray();

    }


    @Test
    void givenValidInputThenReturnValidOutput(){
        int[] arr = {2, 3, -8, 7, -1, 2, 3};

        assertEquals(11, maximumSumOfSubArray.findSum(arr));

    }
}
