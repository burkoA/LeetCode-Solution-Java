package easy;

import java.util.Arrays;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]


Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1


Follow up: Could you minimize the total number of operations done?
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1 && nums[0] == 0)
            return;

        int start = 0;
        int end = nums.length;

        while(start != end) {
            if(nums[start] == 0) {
                int temp = 0;
                int firstPoint = start;
                int secondPoint = firstPoint + 1;

                while(secondPoint != end) {
                    temp = nums[firstPoint];
                    nums[firstPoint] = nums[secondPoint];
                    nums[secondPoint] = temp;
                    firstPoint++;
                    secondPoint++;
                }

                end--;
                start--;
            }

            start++;
        }
    }
}
