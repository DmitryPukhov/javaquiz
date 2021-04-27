package pro.dmitrypukhov.javaquiz.leetcode;

/**
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * <p>
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * <p>
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * <p>
 * Example 4:
 * <p>
 * Input: x = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
public class ReverseInteger {
    public int reverse(int x) {
        int out = 0;
        int absX = Math.abs(x);
        while (absX != 0) {
            int b = absX % 10;
            // Overflow if out*10 above max int
            if (out > Integer.MAX_VALUE/10){
                return 0;
            }
            out = out * 10 + b;
            absX = absX / 10;
        }
        return x < 0 ? -out : out;
    }
}
