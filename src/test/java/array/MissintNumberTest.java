package test.java.array;

import main.java.array.MissingNumberInArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissintNumberTest {

    MissingNumberInArray missingNumberInArray;
    @BeforeEach
    void setup(){
        missingNumberInArray = new MissingNumberInArray();
    }

    @Test
    void given(){
        int [] input = {9,6,4,2,3,5,7,0,1};

       assertEquals(8,missingNumberInArray.findMissingNumber(input));
    }
}
