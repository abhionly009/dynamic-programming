package test.java.bitManipulation;

import main.java.bitManipulation.BitClearDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BitClearDemoTest {

    private BitClearDemo clearDemo;

    @BeforeEach
    void setUp(){
        clearDemo = new BitClearDemo();
    }

    @Test
    public void givenInputIsValidThenClearTheBitAndReturnNewValue(){
        int position = 2;
        int input = 13;
        int result = clearDemo.clearBit(input,position);

        assertEquals(9,result);
    }


    @Test
    public void givenInputIsValidThenClearTheBitAndReturnNewValueWithZeroCase(){
        int position = 1;
        int input = 13;
        int result = clearDemo.clearBit(input,position);

        assertEquals(13,result);
    }

}
