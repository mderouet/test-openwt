package challenge;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
Write a program to test if the input String is a Palindrome in Java. Input can be a Word, Number or even a Phrase.

White space - acceptable
Punctuation marks - not acceptable
Any Case - acceptable
Perform Unit testing with all possible:

Annotations
Assert Statements
Test any Exception
 */

public class PalindromeTest {

    private Palindrome palindrome;
    private String input;

    @BeforeEach
    public void setUp() throws Exception {

        input = null;
        palindrome = new Palindrome();

    }

    @AfterEach
    public void tearDown() throws Exception {

    }

    @Test
    public void nullStringTest() throws Exception {
        Assertions.assertThrows(NullPointerException.class, () -> {
            palindrome.isPalindrome(null);
        });
    }

    @Test
    public void emptyStringTest() throws Exception {
        input = "";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void multipleWhiteSpaceTest() throws Exception {
        input = "A   Santa         at Nasa";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void singleCharTest() throws Exception {
        input = "H";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void punctuationTest() throws Exception {
        input = "Eva, can I see bees in a cave?";
        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void unicodeTest() throws Exception {
        input = "\u20A9 My gym \u20A9";
        assertFalse(palindrome.isPalindrome(input));
    }

    @Test
    public void alphaNumericPalindromeTest() throws Exception {
        input = "Air 2 an a2ria";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void validPalindromeTest() throws Exception {
        input = "No lemon no melon";
        assertTrue(palindrome.isPalindrome(input));
    }

    @Test
    public void invalidPalindromeTest() throws Exception {
        input = "I am a tester";
        assertFalse(palindrome.isPalindrome(input));
    }
}
