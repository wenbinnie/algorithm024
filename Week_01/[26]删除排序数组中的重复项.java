class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(j==0 || nums[i] > nums[j-1]){
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}


/**
 *
 * 这道题目的代码主结构和 283.移动零的结构一样，都是比较数组中前后指针所指数字的关系
 * 只不过比较的逻辑不同
 *
 *
 */
