package test.java.twoPointer;

import main.java.twoPointer.ContainerWithMostWater;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @BeforeEach
    void setUp(){
            containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    void givenCorrectInputArray_thenReturnCorrectArea(){
        int [] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49,containerWithMostWater.findArea(height));
    }

    @Test
    void givenIncorrectInputArray_thenThrowIllegalException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->containerWithMostWater.findArea(new int[]{}));
        assertEquals("Container size should be greater than 2",exception.getMessage());
    }

    @Test
    void givenIncorrectInputArrayWith2SizeArray_thenThrowIllegalException(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->containerWithMostWater.findArea(new int[]{1}));
        assertEquals("Container size should be greater than 2",exception.getMessage());
    }

    @Test
    void givenNullAsInputArray_thenThrowNullPointerException(){
        NullPointerException exception = assertThrows(NullPointerException.class,()->containerWithMostWater.findArea(null));
        assertEquals("Input can not be null",exception.getMessage());
    }

}
