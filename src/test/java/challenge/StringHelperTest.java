package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHelperTest {

    private StringHelper stringHelper;

    @BeforeEach
    public void setUp() throws Exception {
        stringHelper = new StringHelper();
    }

    @Test
    public void testConcatenate() {

        String result = stringHelper.concatenate("one", "two");

        assertEquals("onetwo", result);

    }

    @Test
    public void testConcatenateWithEmptyString() {
        String result = stringHelper.concatenate("two", "");
        assertEquals("two", result);
    }

    /**
     * Given two strings, write a method to decide if one is a permutation of the other
     */
    @Test
    public void testPermutation() {
        StringHelper stringHelper = new StringHelper();

        assertTrue(stringHelper.permutation("ABC", "ACB"));
        assertTrue(stringHelper.permutation("ABC", "BAC"));
        assertTrue(stringHelper.permutation("ABC", "BCA"));

    }

}