package test.java.bitManipulation;

import main.java.bitManipulation.RemoveLastSetBit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveLastSetBitTest {

    RemoveLastSetBit removeLastSetBit;

    @BeforeEach
    void setUp(){
        removeLastSetBit = new RemoveLastSetBit();

    }

    @Test
    void givenValidInputThenReturnRemovedSetBit(){

        int result = removeLastSetBit.remove(10);

        assertEquals(8,result);

    }
}
