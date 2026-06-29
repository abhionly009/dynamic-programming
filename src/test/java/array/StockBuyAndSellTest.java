package test.java.array;

import main.java.array.StockBuyAndSell;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StockBuyAndSellTest {

    StockBuyAndSell stockBuyAndSell;

    @BeforeEach
    void setup(){
        stockBuyAndSell = new StockBuyAndSell();
    }

    @Test
    void givenInputIsValidThenReturnValidResult(){
        int[] prices = {2, 1, 5, 3, 8, 4};
        assertEquals(7,stockBuyAndSell.buyAndSell(prices));
    }

    @Test
    void givenInputIsInValidThenReturnZero(){
        int[] prices = {7,6,4,3,1};
        assertEquals(0, stockBuyAndSell.buyAndSell(prices));
    }

    @Test
    void givenInputAsNullThenReturn0(){
        NullPointerException exception = assertThrows(NullPointerException.class,
                ()-> stockBuyAndSell.buyAndSell(null));

        assertEquals("Input can not be null",exception.getMessage());
    }
}
