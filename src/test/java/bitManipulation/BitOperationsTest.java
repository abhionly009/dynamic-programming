package test.java.bitManipulation;


import main.java.bitManipulation.BitOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitOperationsTest {

    BitOperations bitOperations;


    @BeforeEach
    void setUp(){
        bitOperations = new BitOperations();
    }

    @Test
    public void givenInputIsValidAndSetThenReturnTrue(){
        int input = 13;
        int position = 2;
        boolean result  = bitOperations.isBitSet(input,position);

        assertEquals(result,true);
    }

    @Test
    public void givenInputIsValidAndNotSetThenReturnFalse(){
        int input = 13;
        int position = 1;
        boolean result  = bitOperations.isBitSet(input,position);

        assertEquals(result,false);
    }


}
