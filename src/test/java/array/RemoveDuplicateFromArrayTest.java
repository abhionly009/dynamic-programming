package test.java.array;

import main.java.array.RemoveDuplicateFromArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateFromArrayTest {

    RemoveDuplicateFromArray removeDuplicateFromArray;

    @BeforeEach
    void setup(){
        removeDuplicateFromArray = new RemoveDuplicateFromArray();
    }

    @Test
    void givenValidInputThenReturnValidOutput(){
        int [] input = {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicateFromArray.remove(input));
    }

    @Test
    void givenValidNegativeArrayInputThenReturnValidOutput(){
        int [] input = {-2,-2,-1,0,0,1,1,1,2,2,3,3,4};
        assertEquals(7, removeDuplicateFromArray.remove(input));
    }
}
