package test.java.numbers;

import main.java.number.DivideTwoInteger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivideTwoIntegerTest {

    DivideTwoInteger divideTwoInteger;

    @BeforeEach
    void setup(){
        divideTwoInteger = new DivideTwoInteger();
    }

    @Test
    void givenDividendIsPositiveAndDivisorIsPositiveThenReturnPositive(){
        assertEquals(3, divideTwoInteger.divide(10,3));
    }


    @Test
    void givenDividendIsPositiveAndDivisorIsNegativeThenReturnNegative(){
        assertEquals(-3, divideTwoInteger.divide(10,-3));
    }

    @Test
    void givenDividendIsNegativeAndDivisorIsPositiveThenReturnNegative(){
        assertEquals(-3, divideTwoInteger.divide(-10,3));
    }

    @Test
    void givenDividendIsNegativeAndDivisorIsNegativeThenReturnPositive(){
        assertEquals(3, divideTwoInteger.divide(-10,-3));
    }

    @Test
    void givenDividendIsPositiveAndDivisorIsZeroThenReturnException(){

    ArithmeticException exception = assertThrows(ArithmeticException.class, ()->divideTwoInteger.divide(10,0));

    assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    void givenDividendIsMinimumNumberAndDivisorIsNegativeOneThenReturnPositiveMax(){
        assertEquals(Integer.MAX_VALUE, divideTwoInteger.divide(Integer.MIN_VALUE,-1));
    }

}
