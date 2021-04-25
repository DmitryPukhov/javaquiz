package pro.dmitrypukhov.javaquiz.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    /**
     * Example 1:
     * Input: s = "()"
     * Output: true
     **/
    @Test
    void isValid_example1() {
        assertTrue(new ValidParentheses().isValid("()"));
    }

    /**
     * Example 2:
     * <p>
     * Input: s = "()[]{}"
     * Output: true
     **/
    @Test
    void isValid_example2() {
        assertTrue(new ValidParentheses().isValid("()[]{}"));
    }

    /**
     * Example 3:
     * <p>
     * Input: s = "(]"
     * Output: false
     **/
    @Test
    void isValid_example3() {
        assertFalse(new ValidParentheses().isValid("(]"));
    }

    /**
     * Example 4:
     * <p>
     * Input: s = "([)]"
     * Output: false
     **/
    @Test
    void isValid_example4() {
        assertFalse(new ValidParentheses().isValid("([)]"));
    }

    /**
     * Example 5:
     * <p>
     * Input: s = "{[]}"
     * Output: true
     **/
    @Test
    void isValid_example5() {
        assertTrue(new ValidParentheses().isValid("{[]}"));
    }
}