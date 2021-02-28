/**
 * 从后开始greedy
 */
class Solution {
    public boolean canJump(int[] nums) {
        int reachableEnd = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i >= reachableEnd) {
                reachableEnd = i;
            }
        }
        return reachableEnd == 0;
    }
}
