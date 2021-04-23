package pro.dmitrypukhov.javaquiz.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    /**
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    void twoSum_example1() {
        int[] out = new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(new int[]{0, 1}, out);
    }

    /**
     * Example 2:
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */
    @Test
    void twoSum_example2() {

        int[] arr = new int[]{1,2,3};
        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int i = Arrays.asList(arr).indexOf((Integer)2);


        int[] out = new TwoSum().twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(new int[]{1, 2}, out);
    }

    /**
     * Example 3:
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    @Test
    void twoSum_example3() {
        int[] out = new TwoSum().twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(new int[]{0, 1}, out);
    }
}