package test.java.twoPointer;

import main.java.twoPointer.Palindrome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PalindromeTest {

    private  Palindrome palindrome;
    @BeforeEach
    void setUp(){
        palindrome = new Palindrome();
    }

    @Test
    void givenValidStringAndItIsPalindrome_thenReturnTrue(){

        assertEquals(true,palindrome.isPalindrome("madam"));
    }

    @Test
    void givenValidStringAndItIsNotAPalindrome_thenReturnFalse(){
        assertEquals(false,palindrome.isPalindrome("lokal"));
    }

    @Test
    void givenStringIsEmpty_thenReturnIllegal(){
     IllegalArgumentException exception =  assertThrows(IllegalArgumentException.class,()->palindrome.isPalindrome(""));
        assertEquals("Input string must have at least one character",exception.getMessage());
    }

    @Test
    void givenStringAsNull_thenReturnNullPointerException(){
        NullPointerException exception = assertThrows(NullPointerException.class,()->palindrome.isPalindrome(null));
        assertEquals("Input string must be there", exception.getMessage());
    }

    @Test
    void givenStringIsSingleCharacter_thenReturnTrue(){
        assertEquals(true,palindrome.isPalindrome("p"));
    }

}
