package test.java.bitManipulation;

import main.java.bitManipulation.PowerOf2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerOf2Test {

    PowerOf2 powerOf2 ;

    @BeforeEach
    void setup(){
        powerOf2 = new PowerOf2();
    }

    @Test
    void givenValidInputThenReturnValidOutput(){

        assertEquals(true,powerOf2.isNumberPowerOf2(16));
        assertEquals(false,powerOf2.isNumberPowerOf2(13));

    }

}
