package easy;
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000


Constraints:

n == nums.length
1 <= k <= n <= 105
-104 <= nums[i] <= 104
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length < k)
            return 0;

        double windowSum = 0;

        for(int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        if(nums.length == 1)
            return nums[0];

        if(k == nums.length)
            return maxSum / k;

        for(int end = k; end < nums.length; end++) {
            windowSum += (nums[end] - nums[end-k]);
            maxSum = Math.max(windowSum,maxSum);
        }

        return maxSum / k;
    }
}
