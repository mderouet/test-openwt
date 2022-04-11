package challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Implement regular expression matching with support for '.' and '*'.
 *
 *  '.' Matches any single character.
 *  '*' Matches zero or more of the preceding element.
 *
 *  The matching should cover the entire input string (not partial).
 *
 *  The function prototype should be:
 *  bool isMatch(const char *s, const char *p)
 *
 *  Some examples:
 *  isMatch("aa","a") → false
 *  isMatch("aa","aa") → true
 *  isMatch("aaa","aa") → false
 *  isMatch("aa", "a*") → true
 *  isMatch("aa", ".*") → true
 *  isMatch("ab", ".*") → true
 *  isMatch("aab", "c*a*b") → true
 */
class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching;

    @BeforeEach
    public void setUp() {
        regularExpressionMatching = new RegularExpressionMatching();
    }

    @Test
    public void isMatching() {
        assertFalse( regularExpressionMatching.isMatch("aa","a"));
        assertTrue( regularExpressionMatching.isMatch("aa","aa"));
        assertFalse( regularExpressionMatching.isMatch("aaa","aa"));
        assertTrue( regularExpressionMatching.isMatch("aa", "a*"));
        assertTrue( regularExpressionMatching.isMatch("aa", ".*"));
        assertTrue( regularExpressionMatching.isMatch("ab", ".*"));
        assertTrue( regularExpressionMatching.isMatch("aab", "c*a*b"));
    }


}