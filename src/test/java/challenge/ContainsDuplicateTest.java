package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private ContainsDuplicate containsDuplicate;

    @BeforeEach
    public void setUp() {
        containsDuplicate = new ContainsDuplicate();
    }

    @Test
    public void testDuplicate() {
        int[] myIntArray = new int[]{1, 2, 1};
        assertTrue(containsDuplicate.containsDuplicate(myIntArray));
    }

    @Test
    public void testDuplicate2() {
        int[] myIntArray = new int[]{1, 2, 3};
        assertFalse(containsDuplicate.containsDuplicate(myIntArray));
    }

    @Test
    public void testDuplicate3() {
        int[] myIntArray = new int[]{1, 2, 3, 4, 5, 2, 3};
        assertTrue(containsDuplicate.containsDuplicate(myIntArray));
    }
}