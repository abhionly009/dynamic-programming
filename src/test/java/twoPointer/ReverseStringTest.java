package test.java.twoPointer;

import main.java.twoPointer.ReverseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseStringTest {
    private ReverseString reverseString;
    @BeforeEach
    void setUp(){
       reverseString = new ReverseString();
    }

    @Test
    void givenString_thenReturnReversedString(){
        assertEquals("dlrow olleH", reverseString.reverse("Hello world"));
    }

    @Test
    void givenEmptyString_thenReturnIllegalException(){
       IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class,()->reverseString.reverse(""));
        assertEquals("Input should not be empty", illegalArgumentException.getMessage());
    }

    @Test
    void givenNullAsInput_thenThrowNullPointerException(){
       NullPointerException nullPointerException = assertThrows(NullPointerException.class,()->reverseString.reverse(null));
       assertEquals("Cannot invoke \"String.isEmpty()\" because \"input\" is null", nullPointerException.getMessage());
    }

    @Test
    void givenInputWithWhiteSpace_thenReturnWithWhiteSpace(){
        assertEquals(" si mar ", reverseString.reverse(" ram is "));
    }

    @Test
    void givenSingleCharacter_thenReturnSingleCharacter(){
        assertEquals("i",reverseString.reverse("i"));
    }

    @Test
    void givenUnicode_thenReturnUnicode(){
        assertEquals("%#@", reverseString.reverse("@#%"));
    }
}
