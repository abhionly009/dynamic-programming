package test.java.array;

import main.java.array.SecondLargestElementInArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondLargestNumberInArrayTest {

    SecondLargestElementInArray secondLargestElementInArray;

    @BeforeEach
    void setup(){
        secondLargestElementInArray = new SecondLargestElementInArray();
    }

    @Test
    void givenInputIsValidThenReturnSecondHighestNumber(){
        int [] input  = {1,4,6,3,5};

       assertEquals(5,  secondLargestElementInArray.findSecondLargeElement(input));

    }

    @Test
    void givenInputIsValidWithNegativeNumberThenReturnSecondHighestNumber(){
        int [] input  = {-5,-8,-6,-3,-5};
        assertEquals(-5,  secondLargestElementInArray.findSecondLargeElement(input));
    }

    @Test
    void givenInputHasSameNumberThenReturn(){
        int [] input = {2,2,2,2,2};
        assertEquals(Integer.MIN_VALUE,secondLargestElementInArray.findSecondLargeElement(input));
    }

    @Test
    void givenInputHasMaxValue(){
        int [] input = {Integer.MAX_VALUE,3,5};
        assertEquals(5,secondLargestElementInArray.findSecondLargeElement(input));
    }

    @Test
    void givenInputHasMinValue(){
        int [] input = {Integer.MIN_VALUE,3,5};
        assertEquals(3,secondLargestElementInArray.findSecondLargeElement(input));
    }

    @Test
    void givenInputContainsZeroValues(){
        int [] input  = {-5,-8,0,-3,-5};
        assertEquals(-3,  secondLargestElementInArray.findSecondLargeElement(input));
    }


}
